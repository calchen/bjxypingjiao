package com.chenky.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 实现程序与数据库的链接，查询，更新。 <br />
 * 该类使用JDBC连接数据库，提供静态方法对数据库进行增删改查
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class DAO {
	private static Connection ct = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	// 连接数据库参数
	private static String driverName = "";
	private static String dbURL = "";
	private static String dbUserName = "";
	private static String dbPasswd = "";
	// 读配置文件
	private static Properties pp = null;
	private static InputStream fis = null;

	/**
	 * 从dbinfo.properties配置文件中读取数据库配置
	 */
	static {
		try {
			pp = new Properties();
			fis = DAO.class.getResourceAsStream("/dbInfo.properties");
			pp.load(fis);
			driverName = pp.getProperty("dbdriver");
			dbURL = pp.getProperty("dburl");
			dbUserName = pp.getProperty("dbusername");
			dbPasswd = pp.getProperty("dbpassword");
			Class.forName(driverName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fis = null;
		}
	}

	/**
	 * 建立连接
	 * 
	 * @return 连接
	 */
	private static Connection getConnection() {
		try {
			// 得到链接
			ct = DriverManager.getConnection(dbURL, dbUserName, dbPasswd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ct;
	}

	/**
	 * 统一查询语句，使用PreparedStatement,参数可以是null 需要用DAO.close()方法关闭连接。
	 * 如果出现错误会抛出RuntimeException。
	 * 
	 * @param sql
	 *            SQL语句
	 * @param parameters
	 *            SQL语句参数
	 * @return ResultSet结果集
	 */
	public static ResultSet executeQuery(String sql, Object[] parameters) {
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if (parameters != null && !parameters.equals("")) {
				for (int i = 0; i < parameters.length; i++) {
					ps.setObject(i + 1, parameters[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}
		return rs;
	}

	/**
	 * 统一的update/delete/insert语句，使用PreparedStatement。 如果出现错误会抛出RuntimeException。
	 * 
	 * @param sql
	 *            SQL语句
	 * @param parameters
	 *            SQL语句参数
	 */
	public static void executeUpdate(String sql, Object[] parameters) {
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if (parameters != null && !parameters.equals("")) {
				for (int i = 0; i < parameters.length; i++) {
					ps.setObject(i + 1, parameters[i]);
				}
			}
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs, ps, ct);
		}
	}

	/**
	 * 释放资源
	 * 
	 * @param rs
	 *            ResultSet
	 * @param ps
	 *            PreparedStatement
	 * @param ct
	 *            Connection
	 */
	public static void close(ResultSet rs, Statement ps, Connection ct) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ps = null;
		}
		if (ct != null) {
			try {
				ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ct = null;
	}

	/**
	 * 获取Connection
	 * 
	 * @return Connection
	 */
	public static Connection getCt() {
		return ct;
	}

	/**
	 * 获取PreparedStatement
	 * 
	 * @return
	 */
	public static PreparedStatement getPs() {
		return ps;
	}

	/**
	 * 获取ResultSet
	 * 
	 * @return
	 */
	public static ResultSet getRs() {
		return rs;
	}
}
