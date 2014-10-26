package com.chenky.service;

import com.chenky.dao.ProfileDAO;
import com.chenky.util.IdCardNumberUtil;
import com.chenky.vo.StudentVO;
import com.chenky.vo.TeacherVO;

/**
 * 修改个人信息，包含修改密码
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class ProfileService {
	/**
	 * 获取学生信息
	 * @param id
	 * @return
	 */
	public StudentVO getStudentProfile(String id) {
		StudentVO student = null;
		if (id != null) {
			ProfileDAO dao = new ProfileDAO();
			student = dao.getStudentProfile(id);
		}
		return student;
	}
	/**
	 * 设置学生信息
	 * @param student
	 * @return
	 */
	public boolean setStudentProfile(StudentVO student) {
		if(student == null) {
			return false;
		}
		if(IdCardNumberUtil.hasFuzzied(student.getIdCardNumber())) {
			student.setIdCardNumber("");
			
		}
		if(!IdCardNumberUtil.isLegal(student.getIdCardNumber()) 
				&& !student.getIdCardNumber().equals("")) {
			return false;
		}
		ProfileDAO dao = new ProfileDAO();
		return dao.setStudentProfile(student);
	}
	/**
	 * 修改密码
	 * @param user
	 * @return
	 */
	
	public boolean setPassword(StudentVO user) {
		ProfileDAO dao = new ProfileDAO();
		return dao.setPassword(user);
	}
	
	/**
	 * 获取老师个人信息
	 * @return
	 */
	public TeacherVO getTeacherProfile(String id) {
		TeacherVO teacher = null;
		if(id != null) {
			ProfileDAO dao = new ProfileDAO();
			teacher = dao.getTeacherProfile(id);
		}
		return teacher;
	}
	/**
	 * 设置老师个人信息
	 * @param teacher
	 * @return
	 */
	public boolean setTeacherProfile(TeacherVO teacher) {
		if(teacher == null) {
			return false;
		}
		if(!IdCardNumberUtil.isLegal(teacher.getIdCardNumber()) 
				&& !teacher.getIdCardNumber().equals("")) {
			return false;
		}
		ProfileDAO dao = new ProfileDAO();
		return dao.setTeacherProfile(teacher);
	}
}
