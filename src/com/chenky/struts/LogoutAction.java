package com.chenky.struts;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class LogoutAction extends ActionSupport {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		session.remove("login_user");
		session.remove("user_level");
		Map<String, Object> applicationMap =ActionContext.getContext().getApplication();
		Integer onlineUser = (Integer) applicationMap.get("onlineUser");
		if(onlineUser == null || onlineUser <= 0) {
			onlineUser = new Integer(1);
		}
		onlineUser--;
		applicationMap.put("onlineUser", onlineUser);
		return SUCCESS;
	}

}
