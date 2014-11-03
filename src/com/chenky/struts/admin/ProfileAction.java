package com.chenky.struts.admin;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理员编辑个人信息的Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class ProfileAction extends ActionSupport {

	/**
	 * 用户操作类型
	 */
	private int operation;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 账户权限
	 */
	private int level;

	@Override
	public String execute() throws Exception {
		// 获取session
		Map<String, Object> session = ActionContext.getContext().getSession();

		return SUCCESS;
	}

	/**
	 * 获取operation
	 * 
	 * @return operation
	 */
	public int getOperation() {
		return operation;
	}

	/**
	 * 设置operation
	 * 
	 * @param operation
	 *            operation
	 */
	public void setOperation(int operation) {
		this.operation = operation;
	}

	/**
	 * 获取username
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 设置username
	 * 
	 * @param username
	 *            username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/** 
	 * 获取level 
	 * @return level 
	 */
	public int getLevel() {
		return level;
	}

	/** 
	 * 设置level 
	 * @param level level 
	 */
	public void setLevel(int level) {
		this.level = level;
	}

}
