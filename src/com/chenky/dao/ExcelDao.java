package com.chenky.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.chenky.dao.DAO;
import com.chenky.vo.PingjiaoStatusVO;
import com.chenky.vo.StudentVO;
import com.chenky.vo.UserVO;

/**
 * 将解析的数据存入到Excel
 * 
 * @周山胜
 * 
 */
public class ExcelDao {
	
	/**
	 * 将学生User信息存入数据库中
	 * 
	 * @param lt
	 * @return 若成功插入表格，则返回true；否则返回false
	 */
	public boolean stuUserdb(List<UserVO> lt) {
		String sql = "insert into bjxypingjiao.user(id,name,password,level)VALUES(?,?,?,?)";
		for (int i = 0; i < lt.size(); i++) {
			UserVO uvo = lt.get(i);

			Object[] parameters = { uvo.getId(), uvo.getName(),
					uvo.getPassword(), uvo.getLevel() };
			try {
				DAO.executeUpdate(sql, parameters);
			} catch (Exception e) {
			}

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
		String sql = "insert into bjxypingjiao.student(id,professionalName,executiveClass,IdCardNumber)VALUES(?,?,?,?)";
		for (int i = 0; i < lt.size(); i++) {
			StudentVO uvo = lt.get(i);

			Object[] parameters = { uvo.getId(), uvo.getProfessionalName(),
					uvo.getExecutiveClass(), uvo.getIdCardNumber() };
			try {
				DAO.executeUpdate(sql, parameters);
			} catch (Exception e) {
			}
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
		for (Entry<String, UserVO> entry : map.entrySet()) {

			UserVO uvo = entry.getValue();

			Object[] parameters = { uvo.getId() };
			try {
				DAO.executeUpdate(sql, parameters);
			} catch (Exception e) {
			}
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
		for (Entry<String, UserVO> entry : map.entrySet()) {

			UserVO uvo = entry.getValue();

			Object[] parameters = { uvo.getId(), uvo.getName(),
					uvo.getPassword(), uvo.getLevel() };
			try {
				DAO.executeUpdate(sql, parameters);
			} catch (Exception e) {
			}		}

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
		for (int i = 0; i < lt.size(); i++) {
			PingjiaoStatusVO uvo = lt.get(i);

			Object[] parameters = { uvo.getStudent_id(), uvo.getTeacher_id(),
					uvo.getCourse_name(), uvo.getCourse_grade(),
					uvo.getCourse_semester(), uvo.getClassName() };
			try {
				DAO.executeUpdate(sql, parameters);
			} catch (Exception e) {
			}
		}

		return true;

	}

}