package com.chenky.struts;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.opensymphony.xwork2.ActionContext;

/**
 * session监听器，用于会话超时后处理application中数据 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		onlineUserSub1(sessionEvent);
	}

	/**
	 * 会话销毁后将application中的在线人数减1
	 * @param sessionEvent
	 */
	private void onlineUserSub1(HttpSessionEvent sessionEvent) {
		ServletContext servletContext = sessionEvent.getSession()
				.getServletContext();
		Integer onlineUser = (Integer) servletContext
				.getAttribute("onlineUser");

		if (onlineUser == null || onlineUser <= 0) {
			onlineUser = new Integer(1);
		}
		onlineUser--;
		servletContext.setAttribute("onlineUser", onlineUser);
	}
}
