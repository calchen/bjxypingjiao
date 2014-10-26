package com.chenky.struts;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 检查session中sessionAttribute是否存在,若存在就继续执行，若不存在就跳转到Result <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SessionCheckInterceptor implements Interceptor {

	// session属性
	private String sessionAttribute;
	private String result;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// 获取session
		Map<String, Object> session = invocation.getInvocationContext()
				.getSession();

		if (!session.containsKey(sessionAttribute)) {
			return result;
		}
		Object object = session.get(sessionAttribute);
		if (object == null) {
			return result;
		}
		if ("".equals((String) object)) {
			return result;
		}
		// 若已登录就直接跳转到访问页面
		String resultCode = invocation.invoke();
		return resultCode;
	}

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
	 * 设置result
	 * 
	 * @param result
	 *            result
	 */
	public void setResult(String result) {
		this.result = result;
	}

}
