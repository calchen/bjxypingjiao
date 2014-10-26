package com.chenky.struts.tch;

import java.util.ArrayList;
import java.util.Map;

import com.chenky.service.PingjiaoService;
import com.chenky.service.ProfileService;
import com.chenky.vo.CourseVO;
import com.chenky.vo.StudentVO;
import com.chenky.vo.TeacherVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class PjAction extends ActionSupport {

	/**
	 * 老师信息
	 */
	private TeacherVO teacher;
	/**
	 * 评教课程信息
	 */
	private ArrayList<CourseVO> courses;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		Map<String, Object> sessionMap = ActionContext.getContext()
				.getSession();
		courses = new PingjiaoService()
				.getTeacherCoursesList((String) sessionMap.get("USER_ID"));
		teacher = new TeacherVO();
		teacher.setCourses(courses);

		return SUCCESS;
	}

	/**
	 * 获取teacher
	 * 
	 * @return teacher
	 */
	public TeacherVO getTeacher() {
		return teacher;
	}

	/**
	 * 设置teacher
	 * 
	 * @param teacher
	 *            teacher
	 */
	public void setTeacher(TeacherVO teacher) {
		this.teacher = teacher;
	}

	/**
	 * 获取courses
	 * 
	 * @return courses
	 */
	public ArrayList<CourseVO> getCourses() {
		return courses;
	}

	/**
	 * 设置courses
	 * 
	 * @param courses
	 *            courses
	 */
	public void setCourses(ArrayList<CourseVO> courses) {
		this.courses = courses;
	}

}
