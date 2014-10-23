package com.chenky.service;

import com.chenky.dao.ProfileDAO;
import com.chenky.vo.StudentVO;

/**
 * 修改个人信息，包含修改密码
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class ProfileService {
	public StudentVO getProfile(String id) {
		StudentVO studentInfo;
		ProfileDAO dao = new ProfileDAO();
		studentInfo = dao.getProfile(id);
		if(studentInfo==null) {
			return null;
		}
		String idNumber = studentInfo.getIdCardNumber();
		if(idNumber == null || idNumber.equals("")) {
			return studentInfo;
		}
		if(idNumber.length()!=18) {
			studentInfo.setIdCardNumber("");
			return studentInfo;
		}
		studentInfo.setIdCardNumber(studentInfo.getIdCardNumber().substring(0, 14)+"****");
		//System.out.println(studentInfo.getIdCardNumber());
		return studentInfo;
	}
	public boolean setProfile(StudentVO user) {
		if(user == null) {
			return false;
		}
		String idNum = user.getIdCardNumber();
		if(idNum == null) {
			user.setIdCardNumber("");
			idNum = "";
		}
		if(idNum.length()!=18) {
			user.setIdCardNumber("");
		}
		if(idNum.endsWith("****")) {
			user.setIdCardNumber("");
		}
		ProfileDAO dao = new ProfileDAO();
		return dao.setProfile(user);
	}
}
