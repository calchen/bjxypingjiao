package com.chenky.struts.stu;

import java.util.ArrayList;
import java.util.Map;

import com.chenky.service.PingjiaoService;
import com.chenky.service.ProfileService;
import com.chenky.vo.CourseVO;
import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PjAction extends ActionSupport {
	
	/**
	 * 学生信息
	 */
	private StudentVO student;
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
		// TODO Auto-generated method stub

		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		
		
		courses = new PingjiaoService().getCoursesList((String)sessionMap.get("USER_ID"));
		student = new StudentVO(); 
		student.setCourses(courses);

		return SUCCESS;
	}

	/**
	 * 获取student
	 * 
	 * @return student
	 */
	public StudentVO getStudent() {
		return student;
	}

	/**
	 * 设置student
	 * 
	 * @param student
	 *            student
	 */
	public void setStudent(StudentVO student) {
		this.student = student;
	}

	/** 
	 * 获取courses 
	 * @return courses 
	 */
	public ArrayList<CourseVO> getCourses() {
		return courses;
	}

	/** 
	 * 设置courses 
	 * @param courses courses 
	 */
	public void setCourses(ArrayList<CourseVO> courses) {
		this.courses = courses;
	}

}
