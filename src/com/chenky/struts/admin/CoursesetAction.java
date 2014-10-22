package com.chenky.struts.admin;

import java.util.ArrayList;
import java.util.List;

import com.chenky.vo.CourseVO;
import com.chenky.vo.GradeVO;
import com.chenky.vo.SemesterVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class CoursesetAction extends ActionSupport {

	/**
	 * 课程列表
	 */
	private List<CourseVO> courses = new ArrayList<CourseVO>();
	/**
	 * 学年列表
	 */
	private List<GradeVO> gradeList = new ArrayList<GradeVO>();;
	/**
	 * 学期列表
	 */
	private List<SemesterVO> semesterList = new ArrayList<SemesterVO>();
	/**
	 * 新增课程
	 */
	private CourseVO newCourse = new CourseVO();
	/**
	 * 当前学年
	 */
	private GradeVO grade;
	/**
	 * 当前学期
	 */
	private SemesterVO semester;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		courses.add(new CourseVO("2014-2015", "1", "体育"));
		courses.add(new CourseVO("2014-2015", "1", "CE1"));
		courses.add(new CourseVO("2014-2015", "1", "CE3"));
		courses.add(new CourseVO("2014-2015", "1", "物理实验"));

		gradeList.add(new GradeVO("2013-2014"));
		gradeList.add(new GradeVO("2014-2015"));
		gradeList.add(new GradeVO("2015-2016"));
		grade = new GradeVO("2014-2015");

		semesterList.add(new SemesterVO("第1学期"));
		semesterList.add(new SemesterVO("第2学期"));
		semester = new SemesterVO("第1学期");

		return SUCCESS;
	}

	public String addcourse() throws Exception {
		courses.add(new CourseVO("2014-2015", "1", "体育"));
		courses.add(new CourseVO("2014-2015", "1", "CE1"));
		courses.add(new CourseVO("2014-2015", "1", "CE3"));
		courses.add(new CourseVO("2014-2015", "1", "物理实验"));

		gradeList.add(new GradeVO("2013-2014"));
		gradeList.add(new GradeVO("2014-2015"));
		gradeList.add(new GradeVO("2015-2016"));
		grade = new GradeVO("2014-2015");

		semesterList.add(new SemesterVO("第1学期"));
		semesterList.add(new SemesterVO("第2学期"));
		semester = new SemesterVO("第1学期");

		courses.add(newCourse);
		return SUCCESS;
	}

	/**
	 * 获取courses
	 * 
	 * @return courses
	 */
	public List<CourseVO> getCourses() {
		return courses;
	}

	/**
	 * 设置courses
	 * 
	 * @param courses
	 *            courses
	 */
	public void setCourses(List<CourseVO> courses) {
		this.courses = courses;
	}

	/**
	 * 获取newCourse
	 * 
	 * @return newCourse
	 */
	public CourseVO getNewCourse() {
		return newCourse;
	}

	/**
	 * 设置newCourse
	 * 
	 * @param newCourse
	 *            newCourse
	 */
	public void setNewCourse(CourseVO newCourse) {
		this.newCourse = newCourse;
	}

	/**
	 * 获取gradeList
	 * 
	 * @return gradeList
	 */
	public List<GradeVO> getGradeList() {
		return gradeList;
	}

	/**
	 * 设置gradeList
	 * 
	 * @param gradeList
	 *            gradeList
	 */
	public void setGradeList(List<GradeVO> gradeList) {
		this.gradeList = gradeList;
	}

	/**
	 * 获取semesterList
	 * 
	 * @return semesterList
	 */
	public List<SemesterVO> getSemesterList() {
		return semesterList;
	}

	/**
	 * 设置semesterList
	 * 
	 * @param semesterList
	 *            semesterList
	 */
	public void setSemesterList(List<SemesterVO> semesterList) {
		this.semesterList = semesterList;
	}

	/**
	 * 获取grade
	 * 
	 * @return grade
	 */
	public GradeVO getGrade() {
		return grade;
	}

	/**
	 * 设置grade
	 * 
	 * @param grade
	 *            grade
	 */
	public void setGrade(GradeVO grade) {
		this.grade = grade;
	}

	/**
	 * 获取semester
	 * 
	 * @return semester
	 */
	public SemesterVO getSemester() {
		return semester;
	}

	/**
	 * 设置semester
	 * 
	 * @param semester
	 *            semester
	 */
	public void setSemester(SemesterVO semester) {
		this.semester = semester;
	}

}
