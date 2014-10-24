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
		Map<String, Object> session = ActionContext.getContext().getSession();
		Map<String, Object> application =ActionContext.getContext().getApplication();
		application.remove(session.get("USER_ID"));
		session.remove("USER_ID");
		session.remove("USER_NAME");
		session.remove("USER_LEVEL");
		
		Integer ONLINEUSER = (Integer) application.get("ONLINEUSER");
		if(ONLINEUSER == null || ONLINEUSER <= 0) {
			ONLINEUSER = new Integer(1);
		}
		ONLINEUSER--;
		application.put("ONLINEUSER", ONLINEUSER);
		return SUCCESS;
	}

}
