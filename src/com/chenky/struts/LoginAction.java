package com.chenky.struts;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class LoginAction extends ActionSupport {

	private String id;
	private String password;
	private String nextCheck;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		Map<String, Object> session = ActionContext.getContext().getSession();
		
		if(nextCheck != null && nextCheck.equals("on")) {
			
		}
		if(id == null || id.equals("")) {
			return ERROR;
		}
		if(password == null || password.equals("")) {
			return ERROR;
		}
		
		if(id.equals("admin")) {
			session.put("login_user", "admin");
			session.put("login_user_name", "管理员");
			session.put("user_level", 4);
		}
		if(id.equals("stu")) {
			session.put("login_user", "stu");
			session.put("login_user_name", "学生");
			session.put("user_level", 1);
		}
		if(id.equals("tch")) {
			session.put("login_user", "tch");
			session.put("login_user_name", "老师");
			session.put("user_level", 2);
		}
		Map<String, Object> application =ActionContext.getContext().getApplication();
		Integer onlineUser = (Integer) application.get("onlineUser");
		if(onlineUser == null) {
			onlineUser = new Integer(0);
		}
		onlineUser++;
		application.put("onlineUser", onlineUser);
		// 登录成功
		return SUCCESS;

	}

	/** 
	 * 获取id 
	 * @return id 
	 */
	public String getId() {
		return id;
	}

	/** 
	 * 设置id 
	 * @param id id 
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** 
	 * 获取password 
	 * @return password 
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * 设置password 
	 * @param password password 
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * 获取nextCheck 
	 * @return nextCheck 
	 */
	public String getNextCheck() {
		return nextCheck;
	}

	/** 
	 * 设置nextCheck 
	 * @param nextCheck nextCheck 
	 */
	public void setNextCheck(String nextCheck) {
		this.nextCheck = nextCheck.toLowerCase();
	}
}
