package com.chenky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chenky.vo.UserVO;

/**
 * 执行与登陆相关的SQL语句 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class LoginDAO {
	/**
	 * 用于检查用户登录是否合法，如果不合法就返回null，如果合法就返回该用户的信息
	 * 
	 * @param user
	 *            包含用户ID和password
	 * @return null或用户基本信息
	 */
	public UserVO check(UserVO user) {
		String id = user.getId();
		String password = user.getPassword();

		UserVO dbUser = null;
		String sql = "select * from user where id=? and password=?";
		String[] parameters = { id, password };
		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			if (rs.next()) {
				String idString = rs.getString("id");
				String nameString = rs.getString("name");
				String passwordString = rs.getString("password");
				String levelString = rs.getString("level");
				dbUser = new UserVO(idString, nameString, passwordString,
						levelString);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbUser;
	}
}
