package com.chenky.struts;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.chenky.service.SystemConfigService;

/**
 * 用于系统初始化 <br />
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
		// 评教状态，是否在评教中
		servletContext.setAttribute("PINGJIAO_STATUS", "1");
		// 当前评教的学年
		servletContext.setAttribute("GRADE", "2014-2015");
		// 当前评教的学期
		servletContext.setAttribute("SEMESTER", "1");
		// 当前评教的开始时间
		servletContext.setAttribute("STRAT_DATETIME", "2014-10-27 08:00");
		// 当前评教的结束时间
		servletContext.setAttribute("END_DATETIME", "2014-10-27 08:00");

	}

}
