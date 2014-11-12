package com.chenky.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.chenky.vo.PingjiaoStatusVO;
import com.chenky.vo.StudentVO;
import com.chenky.vo.UserVO;

/**
 * 将解析的数据存入到Excel
 * 
 * @author 周山胜
 * @version 1.0
 * @author 恺垣
 * @version 2.0
 */
public class ExcelDao {

	/**
	 * 将学生User信息存入数据库中
	 * 
	 * @param lt
	 * @return 若成功插入表格，则返回true；否则返回false
	 */
	public boolean stuUserdb(List<UserVO> lt) {
		String sql = "insert into user(id,name,password,level)VALUES(?,?,?,?)";
		Connection ct = DAO.getConnection();
		PreparedStatement ps = null;
		try {
			ps = ct.prepareStatement(sql);
			for (int i = 0; i < lt.size(); i++) {
				UserVO vo = lt.get(i);
				ps.setObject(1, vo.getId());
				ps.setObject(2, vo.getName());
				ps.setObject(3, vo.getPassword());
				ps.setObject(4, vo.getLevel());
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (Exception e1) {
			return false;
		} finally {
			DAO.close(DAO.getRs(), ps, ct);
		}
		return true;
	}

	/**
	 * 将student信息存入数据中
	 * 
	 * @param lt
	 * @return 若成功插入表格，则返回true；否则返回false
	 */
	public boolean stuTable(List<StudentVO> lt) {
		String sql = "insert into student(id,professionalName,executiveClass,IdCardNumber)VALUES(?,?,?,?)";
		Connection ct = DAO.getConnection();
		PreparedStatement ps = null;
		try {
			ps = ct.prepareStatement(sql);
			for (int i = 0; i < lt.size(); i++) {
				StudentVO vo = lt.get(i);
				ps.setObject(1, vo.getId());
				ps.setObject(2, vo.getProfessionalName());
				ps.setObject(3, vo.getExecutiveClass());
				ps.setObject(4, vo.getIdCardNumber());
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (Exception e1) {
			return false;
		} finally {
			DAO.close(DAO.getRs(), ps, ct);
		}
		return true;
	}

	/**
	 * 将teacher_id信息存入数据库中
	 * 
	 * @param map
	 * @return 若成功插入表格，则返回true；否则返回false
	 */
	public boolean teacheridTable(HashMap<String, UserVO> map) {
		String sql = "insert into bjxypingjiao.teacher(id)VALUES(?)";
		Connection ct = DAO.getConnection();
		PreparedStatement ps = null;
		try {
			ps = ct.prepareStatement(sql);
			for (Entry<String, UserVO> entry : map.entrySet()) {
				UserVO vo = entry.getValue();
				ps.setObject(1, vo.getId());
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (Exception e1) {
			return false;
		} finally {
			DAO.close(DAO.getRs(), ps, ct);
		}
		return true;
	}

	/**
	 * 将teacherUser信息存入数据库中
	 * 
	 * @param map
	 * @return 若成功插入表格，则返回true；否则返回false
	 */
	public boolean teacherUser(HashMap<String, UserVO> map) {
		String sql = "insert into bjxypingjiao.user(id,name,password,level)VALUES(?,?,?,?)";
		Connection ct = DAO.getConnection();
		PreparedStatement ps = null;
		try {
			ps = ct.prepareStatement(sql);
			for (Entry<String, UserVO> entry : map.entrySet()) {
				UserVO vo = entry.getValue();
				ps.setObject(1, vo.getId());
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (Exception e1) {
			return false;
		} finally {
			DAO.close(DAO.getRs(), ps, ct);
		}
		return true;
	}

	/**
	 * 将class信息存入数据库中
	 * 
	 * @param lt
	 * @return 若成功插入表格，则返回true；否则返回false
	 */
	public boolean classTable(List<PingjiaoStatusVO> lt) {
		String sql = "insert into bjxypingjiao.class(student_id,teacher_id,course_name,course_grade,course_semester,class)VALUES(?,?,?,?,?,?)";
		Connection ct = DAO.getConnection();
		PreparedStatement ps = null;
		try {
			ps = ct.prepareStatement(sql);
			for (int i = 0; i < lt.size(); i++) {
				PingjiaoStatusVO vo = lt.get(i);
				ps.setObject(1, vo.getStudent_id());
				ps.setObject(2, vo.getTeacher_id());
				ps.setObject(3, vo.getCourse_name());
				ps.setObject(4, vo.getCourse_grade());
				ps.setObject(5, vo.getCourse_semester());
				ps.setObject(6, vo.getClassName());
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (Exception e1) {
			return false;
		} finally {
			DAO.close(DAO.getRs(), ps, ct);
		}
		return true;
	}

}