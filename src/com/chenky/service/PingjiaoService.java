package com.chenky.service;

import java.util.ArrayList;
import java.util.List;

import com.chenky.dao.PingjiaoDAO;
import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;
import com.chenky.vo.PingjiaoStatusVO;

/**
 * 评教相关服务 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoService {
	/**
	 * 获取学生评教结果
	 * 
	 * @param course
	 *            课程信息
	 * @return 学生评教结果或null
	 */
	public PingjiaoResultVO getStudentPjResult(CourseVO course) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getStudentPjResult(course);
	}

	/**
	 * 保存学生评教数据
	 * 
	 * @param result
	 *            学生评价结果
	 */
	public void setStudentPjResult(PingjiaoResultVO result) {
		PingjiaoDAO dao = new PingjiaoDAO();
		List<String> list = result.getResult();
		// 学生打分分数的权值
		double[] weight = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		double mark = 0;
		// 根据权值计算学生给老师打分的总值
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				mark += (Integer.parseInt(list.get(i)) * weight[i]);
			}
		}
		result.setMark(mark);
		dao.saveStudentPjRasult(result);
	}

	/**
	 * 获取学生课程列表，若获取不到则返回null
	 * 
	 * @param id
	 *            学生学号
	 * @return 学生需评教的课程信息或null
	 */
	public ArrayList<CourseVO> getStudentCoursesList(String id) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getStudentCourses(id);
	}

	/**
	 * 获取老师评教结果
	 * 
	 * @param course
	 *            课程信息
	 * @return 老师评教结果或null
	 */
	public PingjiaoResultVO getTeacherPjResult(CourseVO course) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getTeacherPjResult(course);
	}

	/**
	 * 保存老师评教数据
	 * 
	 * @param result
	 *            老师评教结果
	 */
	public void setTeacherPjResult(PingjiaoResultVO result) {
		PingjiaoDAO dao = new PingjiaoDAO();
		List<String> list = result.getResult();
		// 老师打分分数的权值
		double[] weight = { 0.1, 0.15, 0.3, 0.25, 0.2 };
		double mark = 0;
		// 根据权值计算老师给学生打分的总值
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				mark += (Integer.parseInt(list.get(i)) * weight[i]);
			}
		}
		result.setMark(mark);
		dao.saveTeacherPjRasult(result);
	}

	/**
	 * 获取老师课程列表
	 * 
	 * @param id
	 *            老师工资号
	 * @return 老师课程列表或null
	 */
	public ArrayList<CourseVO> getTeacherCoursesList(String id) {
		PingjiaoDAO dao = new PingjiaoDAO();
		return dao.getTeacherCourses(id);
	}

	/**
	 * 获取已有专业列表
	 * 
	 * @param grade
	 *            学年，如2014-2015
	 * @param semester
	 *            学期，如1
	 * @return 专业列表
	 */
	public List<String> getProfessionalNameList(String grade, String semester) {
		return getList(grade, semester, "professionalName");
	}

	/**
	 * 获取已有行政班列表
	 * 
	 * @param grade
	 *            学年，如2014-2015
	 * @param semester
	 *            学期，如1
	 * @return 行政班列表
	 */
	public List<String> getExecutiveClassList(String grade, String semester) {
		return getList(grade, semester, "executiveClass");
	}

	/**
	 * 获取已有课程列表
	 * 
	 * @param grade
	 *            学年，如2014-2015
	 * @param semester
	 *            学期，如1
	 * @return 课程列表
	 */
	public List<String> getCourseList(String grade, String semester) {
		return getList(grade, semester, "course_name");
	}

	/**
	 * 获取已有listName列表
	 * 
	 * @param grade
	 *            学年，如2014-2015
	 * @param semester
	 *            学期，如1
	 * @param listName
	 *            列表名，如课程列表（course_name）
	 * @return listName表
	 */
	private List<String> getList(String grade, String semester, String listName) {
		PingjiaoDAO dao = new PingjiaoDAO();
		List<String> list = dao.getList(grade, semester, listName);
		List<String> reallist = new ArrayList<String>();
		reallist.add("全部");
		if (list != null) {
			for (String i : list) {
				reallist.add(i);
			}
		}
		return reallist;
	}
	
	public List<PingjiaoStatusVO> getPingjiaoStatus(int page) {
		return null;
	}
	
}
