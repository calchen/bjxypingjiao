package com.chenky.struts.stu;

import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生编辑个人信息的Action
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class ProfileAction extends ActionSupport {

	/**
	 * 学生信息
	 */
	private StudentVO studentInfo;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		studentInfo = new StudentVO("20112308039", "qwe", "陈恺垣", "计算机科学与技术",
				"11计科2", "320102199302085016", "15651699051",
				"674447097@qq.com");
		studentInfo.setIdCardNumber(studentInfo.getIdCardNumber().substring(0, 14)+"****");
		return super.execute();
	}

	public String setting() throws Exception {
		studentInfo = new StudentVO("20112308039", "qwe", "陈恺垣", "计算机科学与技术", "11计科2", "320102199302085016", studentInfo.getTelNumber(), studentInfo.getEmail());
		studentInfo.setIdCardNumber(studentInfo.getIdCardNumber().substring(0, 14)+"****");
		return SUCCESS;
	}

	/** 
	 * 获取studentInfo 
	 * @return studentInfo 
	 */
	public StudentVO getStudentInfo() {
		return studentInfo;
	}

	/** 
	 * 设置studentInfo 
	 * @param studentInfo studentInfo 
	 */
	public void setStudentInfo(StudentVO studentInfo) {
		this.studentInfo = studentInfo;
	}

}
