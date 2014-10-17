package com.chenky.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SessionCheckInterceptor implements Interceptor {

	// session属性
	private String sessionAttribute;
	private String reloginResult;

	/**
	 * 设置sessionAttribute
	 * 
	 * @param sessionAttribute
	 *            sessionAttribute
	 */
	public void setSessionAttribute(String sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}

	/**
	 * 设置reloginResult
	 * 
	 * @param reloginResult
	 *            reloginResult
	 */
	public void setReloginResult(String reloginResult) {
		this.reloginResult = reloginResult;
	}

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
		Map<String, Object> session = invocation.getInvocationContext()
				.getSession();
		if (!session.containsKey(sessionAttribute)) {
			String resultCode = invocation.invoke();
			return resultCode;
		}else {
			return reloginResult;
		}
		
	}

}
