package com.chenky.struts;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.chenky.service.SystemConfigService;

/**
 * 用于系统初始化
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class InitListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		ServletContext servletContext = servletContextEvent.getServletContext();
		SystemConfigService scs = new SystemConfigService();
		servletContext.setAttribute("PUBLICMESSAGE", scs.getPublicMessage());
		servletContext.setAttribute("PINGJIAOSTATUS", "1");
		servletContext.setAttribute("STRAT_DATETIME", "2014-10-27 08:00");
		servletContext.setAttribute("END_DATETIME", "2014-10-27 08:00");

	}

}
