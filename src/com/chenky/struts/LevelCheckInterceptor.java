package com.chenky.struts;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 检查用户的权限，防止用户访问超出权限的页面<br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class LevelCheckInterceptor implements Interceptor {

	private String result = "index";
	
	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext()
				.getSession();
		//获取action
		String actionNameString = invocation.getInvocationContext().getName();
		//System.out.println(actionNameString);
		//获取用户等级
		String level = (String) session.get("login_user_level");
		
		//过滤需要登陆的界面
		if(actionNameString != null && level != null) {
			int levelint = Integer.parseInt(level);
			if(actionNameString.startsWith("admin_") && levelint != 4) {
				// 用户权限为4才能访问admin_开头的action
				return result;
			}
			if(actionNameString.startsWith("tch_") && levelint != 2) {
				// 用户权限为2才能访问tch_开头的action
				return result;
			}
			if(actionNameString.startsWith("stu_") && levelint != 1) {
				// 用户权限为1才能访问stu_开头的action
				return result;
			}
		}
		// 不需要登陆的界面不过滤直接放行
		String resultCode = invocation.invoke();
		return resultCode;

	}

}
