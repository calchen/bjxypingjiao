package com.chenky.vo;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class CourseVO {
	// 学年
	private String grade;
	// 学期
	private String semester;
	// 课程名
	private String name;
	// 状态
	private String status;
	//ID
	private String id;
	public CourseVO() {
		super();
	}

	public CourseVO(String grade, String semester, String name) {
		super();
		this.grade = grade;
		this.semester = semester;
		this.name = name;
	}

	public CourseVO(String grade, String semester, String name, String status) {
		super();
		this.grade = grade;
		this.semester = semester;
		this.name = name;
		this.status = status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return grade + "_" + semester + "_" + name;
	}

	/**
	 * 获取grade
	 * 
	 * @return grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * 设置grade
	 * 
	 * @param grade
	 *            grade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * 获取semester
	 * 
	 * @return semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * 设置semester
	 * 
	 * @param semester
	 *            semester
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	/**
	 * 获取name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取status
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
