package com.chenky.struts;

import java.util.Map;

import com.chenky.service.LoginService;
import com.chenky.vo.UserVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	/**
	 * 用户名
	 */
	private String id;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 免登陆
	 */
	private String nextCheck;
	/**
	 * 验证码
	 */
	private String securityCode;
	/**
	 * 错误类型
	 */
	private String error;
	/**
	 * 错误次数
	 */
	private Integer logintimes;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		Map<String, Object> application = ActionContext.getContext()
				.getApplication();

		if (nextCheck != null && nextCheck.equals("on")) {

		}
		if (id == null || id.equals("")) {
			return ERROR;
		}
		if (password == null || password.equals("")) {
			return ERROR;
		}

		// 获取登录次数
		logintimes = (Integer) application.get(id);
		if (logintimes == null) {
			logintimes = 0;
		}
		if (logintimes > 2) {
			if (securityCode == null) {
				error = "请输入验证码";
				return ERROR;
			}
			if (!securityCode.equals(session.get("SESSION_SECURITY_CODE"))) {
				error = "验证码错误";
				return ERROR;
			}
		}
		LoginService loginService = new LoginService();
		UserVO user = loginService.check(id, password);
		if (user != null) {
			session.put("USER_ID", user.getId());
			session.put("USER_NAME", user.getName());
			session.put("USER_LEVEL", user.getLevel());
			// 在线用户加1
			Integer ONLINEUSER = (Integer) application.get("ONLINEUSER");
			if (ONLINEUSER == null) {
				ONLINEUSER = new Integer(0);
			}
			ONLINEUSER++;
			application.put("ONLINEUSER", ONLINEUSER);
			application.remove(id);
			// 登录成功
			return SUCCESS;
		} else {
			logintimes++;
			application.put(id, logintimes);
			error = "用户名或密码错误";
			return ERROR;
		}
	}

	/**
	 * 获取id
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置password
	 * 
	 * @param password
	 *            password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取nextCheck
	 * 
	 * @return nextCheck
	 */
	public String getNextCheck() {
		return nextCheck;
	}

	/**
	 * 设置nextCheck
	 * 
	 * @param nextCheck
	 *            nextCheck
	 */
	public void setNextCheck(String nextCheck) {
		this.nextCheck = nextCheck.toLowerCase();
	}

	/**
	 * 设置securityCode
	 * 
	 * @param securityCode
	 *            securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode.toLowerCase();
	}

	/**
	 * 获取error
	 * 
	 * @return error
	 */
	public String getError() {
		return error;
	}

	/**
	 * 获取logintimes
	 * 
	 * @return logintimes
	 */
	public Integer getLogintimes() {
		return logintimes;
	}

}
