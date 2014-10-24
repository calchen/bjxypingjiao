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
	public PingjiaoResultVO getPingjiaoResult(CourseVO course) {
		PingjiaoDAO dao = new PingjiaoDAO();
		
		return dao.getPingjiaoResult(course);
	}
	public void setPingjiao(PingjiaoResultVO result) {
		PingjiaoDAO dao = new PingjiaoDAO();
		dao.savePingjiaoRasult(result);
	}
	
	/**
	 * 获取课程列表
	 * @param id
	 * @return
	 */
	public ArrayList<CourseVO> getCoursesList(String id) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getCourses(id);
	}
}
