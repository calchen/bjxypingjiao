package com.chenky.service;

import java.util.ArrayList;
import java.util.List;

import com.chenky.dao.PingjiaoDAO;
import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoService {
	/**
	 * 获取学生评教结果
	 * 
	 * @param course
	 * @return
	 */
	public PingjiaoResultVO getStudentPjResult(CourseVO course) {
		PingjiaoDAO dao = new PingjiaoDAO();

		return dao.getStudentPjResult(course);
	}

	/**
	 * 保存评教数据
	 * 
	 * @param result
	 */
	public void setStudentPjResult(PingjiaoResultVO result) {
		PingjiaoDAO dao = new PingjiaoDAO();
		List<String> list = result.getResult();
		int mark = 0;
		if (list != null) {
			for (String i : list) {
				mark += Integer.parseInt(i);
			}
		}
		result.setMark(mark);
		dao.saveStudentPjRasult(result);
	}

	/**
	 * 获取老师课程列表
	 * 
	 * @param id
	 * @return
	 */
	public ArrayList<CourseVO> getStudentCoursesList(String id) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getStudentCourses(id);
	}

	/**
	 * 获取老师评教结果
	 * 
	 * @param course
	 * @return
	 */
	public PingjiaoResultVO getTeacherPjResult(CourseVO course) {
		PingjiaoDAO dao = new PingjiaoDAO();

		return dao.getTeacherPjResult(course);
	}

	/**
	 * 保存评教数据
	 * 
	 * @param result
	 */
	public void setTeacherPjResult(PingjiaoResultVO result) {
		PingjiaoDAO dao = new PingjiaoDAO();
		List<String> list = result.getResult();
		double[] weight = { 0.1, 0.15, 0.3, 0.25, 0.2 };
		double mark = 0;
		if (list != null) {
			for (int i = 0;i < list.size();i++) {
				mark += (Integer.parseInt(list.get(i))*weight[i]);
			}
		}
		result.setMark(mark);
		dao.saveTeacherPjRasult(result);
	}

	/**
	 * 获取学生课程列表
	 * 
	 * @param id
	 * @return
	 */
	public ArrayList<CourseVO> getTeacherCoursesList(String id) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getTeacherCourses(id);
	}
}
