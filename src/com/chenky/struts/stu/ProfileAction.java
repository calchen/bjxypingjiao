package com.chenky.struts.stu;

import java.util.Map;

import com.chenky.service.ProfileService;
import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionContext;
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
	private StudentVO studentInfo = new StudentVO();
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		studentInfo = new ProfileService().getProfile((String)sessionMap.get("USER_ID"));
		return super.execute();
	}

	public String setting() throws Exception {
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		studentInfo.setId((String)sessionMap.get("USER_ID"));
		new ProfileService().setProfile(studentInfo);
		studentInfo = new ProfileService().getProfile((String)sessionMap.get("USER_ID"));
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
