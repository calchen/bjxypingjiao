package com.chenky.service;

import com.chenky.dao.ProfileDAO;
import com.chenky.util.IdCardNumberUtil;
import com.chenky.vo.StudentVO;
import com.chenky.vo.TeacherVO;

/**
 * 修改个人信息，包含修改密码 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class ProfileService {
	/**
	 * 获取学生信息
	 * 
	 * @param id
	 *            学生学号
	 * @return 学生信息或null
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
	 * 
	 * @param student
	 *            学生信息
	 * @return 是否设置成功
	 */
	public boolean setStudentProfile(StudentVO student) {
		if (student == null) {
			return false;
		}
		// 如果输入的身份证号已经被模糊，说明该用户的身份证号已经存在数据库中，故不因再设置
		if (IdCardNumberUtil.hasFuzzied(student.getIdCardNumber())) {
			student.setIdCardNumber("");
		}
		// 如果输入的身份证号不合法则将其置为空
		if (!IdCardNumberUtil.isLegal(student.getIdCardNumber())) {
			student.setIdCardNumber("");
		}
		ProfileDAO dao = new ProfileDAO();
		return dao.setStudentProfile(student);
	}

	/**
	 * 获取老师个人信息
	 * 
	 * @param id
	 *            老师工资号
	 * @return 老师个人信息或null
	 */
	public TeacherVO getTeacherProfile(String id) {
		TeacherVO teacher = null;
		if (id != null) {
			ProfileDAO dao = new ProfileDAO();
			teacher = dao.getTeacherProfile(id);
		}
		return teacher;
	}

	/**
	 * 设置老师个人信息
	 * 
	 * @param teacher
	 *            老师信息
	 * @return 是否设置成功
	 */
	public boolean setTeacherProfile(TeacherVO teacher) {
		if (teacher == null) {
			return false;
		}
		// 如果输入的身份证号已经被模糊，说明该用户的身份证号已经存在数据库中，故不因再设置
		if (IdCardNumberUtil.hasFuzzied(teacher.getIdCardNumber())) {
			teacher.setIdCardNumber("");
		}
		// 如果输入的身份证号不合法则将其置为空
		if (!IdCardNumberUtil.isLegal(teacher.getIdCardNumber())) {
			teacher.setIdCardNumber("");
		}
		ProfileDAO dao = new ProfileDAO();
		return dao.setTeacherProfile(teacher);
	}

	/**
	 * 仅用于重置密码
	 * 
	 * @param id
	 *            用户名（学号或工资号）
	 * 
	 * @param idcardNum
	 *            身份证号
	 * @param newPassword
	 *            新密码
	 */
	public boolean resetPassword(String id, String idcardNum, String newPassword) {
		ProfileDAO dao = new ProfileDAO();
		// 该id对应的真实身份证号
		String idcard = dao.getidcardNum(id);
		if (idcard == null || "".equals(idcard)) {
			return false;
		}
		if (!idcard.equals(idcardNum)) {
			return false;
		}
		if (!dao.setPassword(id, newPassword)) {
			return false;
		}
		return true;
	}
}
