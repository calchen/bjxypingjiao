package com.chenky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import com.chenky.vo.StudentVO;
import com.chenky.vo.TeacherVO;

/**
 * 
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class ProfileDAO {
	/**
	 * 获取用户信息
	 * @param id
	 * @return
	 */
	public StudentVO getStudentProfile(String id) {
		String sql = 
			"SELECT "
				+ "`name`, "
				+ "`password`, "
				+ "`level`, "
				+ "`professionalName`, "
				+ "`executiveClass`, "
				+ "`IdCardNumber`, "
				+ "`telNumber`, "
				+ "`email` "
			+ "FROM "
				+ "`studentinfo`"
			+ "WHERE "
				+ "`id`=?;";
		String[] parameters = {id};
		ResultSet rs = DAO.executeQuery(sql, parameters);
		StudentVO student = null;
		try {
			if(rs.next()) {
				student = new StudentVO();
				student.setId(id);
				student.setName(rs.getString("name"));
				student.setPassword(rs.getString("password"));
				student.setLevel(rs.getString("level"));
				student.setProfessionalName(rs.getString("professionalName"));
				student.setExecutiveClass(rs.getString("executiveClass"));
				student.setIdCardNumber(rs.getString("IdCardNumber"));
				student.setTelNumber(rs.getString("telNumber"));
				student.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}
	
	/**
	 * 设置用户信息
	 * @param user
	 */
	public boolean setStudentProfile(StudentVO user) {
		String sql = 
			"UPDATE "
				+ "`user` "
			+ "SET "
				+ "`password` = ?, "
				+ "`level` = ? "
			+ "WHERE "
				+ "`id` = ?;";
		String[] parameters = new String[3]; 
		parameters[0] = user.getPassword();
		parameters[1] = user.getLevel();
		parameters[2] = user.getId();
		DAO.executeUpdate(sql, parameters);
		//身份证号设定后就不能随意修改，因此要对身份证号就行检查
		if(user.getIdCardNumber() != null 
				&& !user.getIdCardNumber().equals("")) {
			sql = "UPDATE "
					+ "`student` "
				+ "SET "
					+ "`telNumber` = ?, "
					+ "`email` = ? ,"
					+ "`IdCardNumber` = ? "
				+ "WHERE "
					+ "`id` = ?; ";
			parameters = new String[4];
			parameters[0] = user.getTelNumber()+"";
			parameters[1] = user.getEmail()+"";
			parameters[2] = user.getIdCardNumber()+"";
			parameters[3] = user.getId();
		}else {
			sql = "UPDATE "
					+ "`student` "
				+ "SET "
					+ "`telNumber` = ?, "
					+ "`email` = ? "
				+ "WHERE "
					+ "`id` = ?; ";
			parameters = new String[3];
			parameters[0] = user.getTelNumber();
			parameters[1] = user.getEmail();
			parameters[2] = user.getId();
		}
		System.out.println(Arrays.toString(parameters));
		DAO.executeUpdate(sql, parameters);
		return true;
	}

	/**
	 * 获取老师个人信息
	 * @param id
	 * @return
	 */
	public TeacherVO getTeacherProfile(String id) {
		String sql = 
			"SELECT "
				+ "`name`, "
				+ "`password`, "
				+ "`level`, "
				+ "`IdCardNumber`, "
				+ "`telNumber`, "
				+ "`email` "
			+ "FROM "
				+ "`teacherinfo` "
			+ "WHERE "
				+ "`id` = ?;";
		String[] parameters = {id};
		ResultSet rs = DAO.executeQuery(sql, parameters);
		TeacherVO teacher = null;
		try {
			if(rs.next()) {
				teacher = new TeacherVO();
				teacher.setId(id);
				teacher.setName(rs.getString("name"));
				teacher.setPassword(rs.getString("password"));
				teacher.setLevel(rs.getString("level"));
				teacher.setIdCardNumber(rs.getString("IdCardNumber"));
				teacher.setTelNumber(rs.getString("telNumber"));
				teacher.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
	}
	
	/**
	 * 设置老师个人信息
	 * @param teacher
	 * @return
	 */
	public boolean setTeacherProfile(TeacherVO teacher) {
		String sql = 
			"UPDATE "
				+ "`user` "
			+ "SET "
				+ "`password` = ?, "
				+ "`level` = ? "
			+ "WHERE "
				+ "`id` = ?;";
		String[] parameters = new String[3]; 
		parameters[0] = teacher.getPassword();
		parameters[1] = teacher.getLevel();
		parameters[2] = teacher.getId();
		DAO.executeUpdate(sql, parameters);
		//身份证号设定后就不能随意修改，因此要对身份证号就行检查
		if(teacher.getIdCardNumber()!=null 
				&& !teacher.getIdCardNumber().equals("")) {
			sql = "UPDATE "
					+ "`teacher` "
				+ "SET "
					+ "`IdCardNumber` = ?, "
					+ "`telNumber` = ?, "
					+ "`email` = ? "
				+ "WHERE "
					+ "`id` = ?;";
			parameters = new String[4];
			parameters[0] = teacher.getIdCardNumber();
			parameters[1] = teacher.getTelNumber();
			parameters[2] = teacher.getEmail();
			parameters[3] = teacher.getId();
		}else {
			sql = "UPDATE "
					+ "`teacher` "
				+ "SET "
					+ "`telNumber` = ?, "
					+ "`email` = ? "
				+ "WHERE "
					+ "`id` = ?;";
			parameters = new String[3];
			parameters[0] = teacher.getTelNumber();
			parameters[1] = teacher.getEmail();
			parameters[2] = teacher.getId();
		}
		DAO.executeUpdate(sql, parameters);
		return true;
	}
	
	/**
	 * 获取用户身份证号,当前只能获取学生的身份证号
	 */
	public String getidcardNum(String id) {
		String sql = 
				"SELECT "
				+ "`IdCardNumber` "
			+ "FROM "
				+ "`student` "
			+ "WHERE "
				+ "`id` = ?;";
		String[] parameters = {id};
		String idcardNum = null;
		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			if(rs.next()) {
				idcardNum = rs.getString("IdCardNumber").toLowerCase();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idcardNum;
	}
	public boolean setPassword(String id,String password) {
		String sql = 
			"UPDATE "
				+ "`user` "
			+ "SET "
				+ "`password` = ? "
			+ "WHERE "
				+ "`id` = ?;";
		String[] parameters = {password,id};
		DAO.executeUpdate(sql, parameters);
		return true;
	}
}
