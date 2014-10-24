package com.chenky.struts.stu;

import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生修改密码的Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class PasswordAction extends ActionSupport {

	/**
	 * 学生信息
	 */
	private StudentVO studentInfo;
	/**
	 * 学生新密码
	 */
	private String newPassword;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String setting() throws Exception {
//		System.out.println(studentInfo.getPassword());
//		System.out.println(newPassword);
		return SUCCESS;
	}

	/**
	 * 获取studentInfo
	 * 
	 * @return studentInfo
	 */
	public StudentVO getStudentInfo() {
		return studentInfo;
	}

	/**
	 * 设置studentInfo
	 * 
	 * @param studentInfo
	 *            studentInfo
	 */
	public void setStudentInfo(StudentVO studentInfo) {
		this.studentInfo = studentInfo;
	}

	/**
	 * 获取newPassword
	 * 
	 * @return newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * 设置newPassword
	 * 
	 * @param newPassword
	 *            newPassword
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
