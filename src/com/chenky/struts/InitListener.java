package com.chenky.struts;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.chenky.service.SystemConfigService;

/**
 * 用于系统初始化的Listener <br />
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
		ServletContext servletContext = servletContextEvent.getServletContext();
		SystemConfigService scs = new SystemConfigService();
		// 设置位于application中的一些变量
		// 信息公告的内容
		servletContext.setAttribute("PUBLICMESSAGE", scs.getPublicMessage());
		// 当前评教状态，-1为终止，0为准备，1为进行中
		servletContext.setAttribute("PINGJIAOSTATUS", "1");
		// 评教开始时间
		servletContext.setAttribute("STRAT_DATETIME", "2014-10-27 08:00");
		// 评教结束时间
		servletContext.setAttribute("END_DATETIME", "2014-10-27 08:00");

	}

}
