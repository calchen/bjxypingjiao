package com.chenky.struts;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class InitInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> application = invocation.getInvocationContext().getApplication();
		Integer onlineUser = (Integer) application.get("onlineUser");
		if(onlineUser == null) {
			onlineUser = new Integer(0);
		}
		application.put("onlineUser", onlineUser);
		String resultCode = invocation.invoke();
		return resultCode;
	}



}
