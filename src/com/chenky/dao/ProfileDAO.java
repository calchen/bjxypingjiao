package com.chenky.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chenky.vo.StudentVO;

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
	public StudentVO getProfile(String id) {
		StudentVO studentVO = null;
		String sql = "select * from studentInfo where id=?";
		String[] parameters = {id};
		ResultSet rs = DAO.executeQuery(sql, parameters);
		try {
			if(rs.next()) {
				String idString = rs.getString("id"); 
				String name= rs.getString("name"); 
				String password = rs.getString("password");
				String level = rs.getString("level");
				String professionalName = rs.getString("professionalName");
				String executiveClass = rs.getString("executiveClass");
				String idCardNumber = rs.getString("IdCardNumber");
				String telNumber = rs.getString("telNumber");
				String email= rs.getString("email");
				studentVO = new StudentVO(idString, password, name, level, professionalName, executiveClass, idCardNumber, telNumber, email);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentVO;
	}
	
	/**
	 * 设置用户信息
	 * @param user
	 */
	public boolean setProfile(StudentVO user) {
		String sql= "";
		String[] parameters;
		if(user.getIdCardNumber() == "") {
			sql = "update studentInfo set telNumber=?,email=?";
			parameters = new String[2];
			parameters[0] = user.getTelNumber();
			parameters[1] = user.getEmail();
		}else {
			sql = "update studentInfo set telNumber=?,email=?,IdCardNumber=?";
			parameters = new String[3];
			parameters[0] = user.getTelNumber();
			parameters[1] = user.getEmail();
			parameters[2] = user.getIdCardNumber();
		}
		DAO.executeUpdate(sql, parameters);
		return true;
	}
}
