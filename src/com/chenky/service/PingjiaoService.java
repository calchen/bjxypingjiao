package com.chenky.service;

import java.util.ArrayList;

import com.chenky.dao.PingjiaoDAO;
import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;

/**
 * 
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoService {
	public PingjiaoResultVO getPingjiaoResult() {
		return null;
	}
	public void setPingjiao() {
		
	}
	
	public ArrayList<CourseVO> getCoursesList(String id) {
		PingjiaoDAO dao = new PingjiaoDAO();
		
		return dao.getCourses(id);
	}
}
