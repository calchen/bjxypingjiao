package com.chenky.service;

import com.chenky.dao.LoginDAO;
import com.chenky.vo.UserVO;

/**
 * 登陆相关服务 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class LoginService {
	/**
	 * 用于检查用户登录是否合法，如果不合法就返回null，如果合法就返回该用户的信息
	 * 
	 * @param id
	 *            用户名（学号或工资号）
	 * @param password
	 *            密码
	 * @return 用户基本信息，或者null
	 */
	public UserVO check(String id, String password) {
		UserVO user1, user2;
		LoginDAO loginDAO = new LoginDAO();

		// 将用户名和加密后的密码都转为小写
		id = id.toLowerCase();
		password = password.toLowerCase();
		user1 = new UserVO(id, password);
		user2 = loginDAO.check(user1);
		if (user2 != null && !user1.equals(user2)) {
			return null;
		}
		return user2;
	}
}
