package com.chenky.service;

import com.chenky.dao.LoginDAO;
import com.chenky.util.Sha1Util;
import com.chenky.vo.UserVO;

/**
 * 登陆服务
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class LoginService {
	public UserVO check(String id,String password) {
		UserVO user1,user2;
		LoginDAO loginDAO = new LoginDAO();
		
		//将用户名和加密后的密码都转为小写
		id = id.toLowerCase();
		password = password.toLowerCase();
		user1 = new UserVO(id, password);
		user2 = loginDAO.check(user1);
		if(user2!=null && !user1.equals(user2)) {
			return null;
		}
		return user2;
	}
}
