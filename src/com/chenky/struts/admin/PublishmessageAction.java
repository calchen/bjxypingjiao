package com.chenky.struts.admin;

import java.util.Map;

import com.chenky.service.SystemConfigService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 发送信息公告 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class PublishmessageAction extends ActionSupport {

	/**
	 * 信息公告
	 */
	private String message;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		SystemConfigService scs = new SystemConfigService();
		Map<String, Object> application = ActionContext.getContext()
				.getApplication();
		if (message != null && !message.equals("") && application != null) {
			scs.setPublicMessage(message);
			application.put("publicmessage", message);
			return SUCCESS;
		}
		return ERROR;
	}

	/**
	 * 获取message
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 设置message
	 * 
	 * @param message
	 *            message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
