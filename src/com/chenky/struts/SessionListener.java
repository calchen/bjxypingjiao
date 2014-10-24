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
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		// TODO Auto-generated method stub
		ONLINEUSERInit(sessionEvent);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		ONLINEUSERSub1(sessionEvent);
	}

	/**
	 * 会话销毁后将application中的在线人数减1
	 * @param sessionEvent
	 */
	private void ONLINEUSERSub1(HttpSessionEvent sessionEvent) {
		ServletContext servletContext = sessionEvent.getSession()
				.getServletContext();
		Integer ONLINEUSER = (Integer) servletContext
				.getAttribute("ONLINEUSER");

		if (ONLINEUSER == null || ONLINEUSER <= 0) {
			ONLINEUSER = new Integer(1);
		}
		ONLINEUSER--;
		servletContext.setAttribute("ONLINEUSER", ONLINEUSER);
	}
	
	/**
	 * 会话创建的时初始化application中的在线人数
	 * @param sessionEvent
	 */
	private void ONLINEUSERInit(HttpSessionEvent sessionEvent) {
		ServletContext servletContext = sessionEvent.getSession()
				.getServletContext();
		Integer ONLINEUSER = (Integer) servletContext
				.getAttribute("ONLINEUSER");

		if (ONLINEUSER == null || ONLINEUSER <= 0) {
			ONLINEUSER = new Integer(0);
			servletContext.setAttribute("ONLINEUSER", ONLINEUSER);
		}
		
	}
}
