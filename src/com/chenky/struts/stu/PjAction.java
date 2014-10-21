package com.chenky.struts.stu;

import java.util.ArrayList;

import com.chenky.vo.CourseVO;
import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PjAction extends ActionSupport {

	private StudentVO student;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		student = new StudentVO("20112308039", "qwe", "陈恺垣", "计算机科学与技术",
				"11计科2", "320102199302085016", "15651699051",
				"674447097@qq.com");
		ArrayList<CourseVO> courses = new ArrayList<CourseVO>();
		courses.add(new CourseVO("2014-2015", "1", "体育", "0"));
		courses.add(new CourseVO("2014-2015", "1", "英语", "0"));
		courses.add(new CourseVO("2014-2015", "1", "物理实验", "0"));
		courses.add(new CourseVO("2013-2014", "2", "物理实验", "1"));
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

}
