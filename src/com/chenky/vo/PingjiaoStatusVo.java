package com.chenky.vo;

/**
 * 评教 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoStatusVo {
	/**
	 * 学年
	 */
	private String grade;
	/**
	 * 学期
	 */
	private String semester;
	/**
	 * 课程
	 */
	private String course;
	/**
	 * 行政班级
	 */
	private String executiveClass;
	/**
	 * 已评价人数
	 */
	private int havePj;
	/**
	 * 未评价人数
	 */
	private int haventPj;

	public PingjiaoStatusVo() {
		super();
	}

	public PingjiaoStatusVo(String executiveClass, String grade,
			String semester, String course, int havePj, int haventPj) {
		super();
		this.executiveClass = executiveClass;
		this.grade = grade;
		this.semester = semester;
		this.course = course;
		this.havePj = havePj;
		this.haventPj = haventPj;
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
	 * 获取course
	 * 
	 * @return course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * 设置course
	 * 
	 * @param course
	 *            course
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * 获取executiveClass
	 * 
	 * @return executiveClass
	 */
	public String getExecutiveClass() {
		return executiveClass;
	}

	/**
	 * 设置executiveClass
	 * 
	 * @param executiveClass
	 *            executiveClass
	 */
	public void setExecutiveClass(String executiveClass) {
		this.executiveClass = executiveClass;
	}

	/**
	 * 获取havePj
	 * 
	 * @return havePj
	 */
	public int getHavePj() {
		return havePj;
	}

	/**
	 * 设置havePj
	 * 
	 * @param havePj
	 *            havePj
	 */
	public void setHavePj(int havePj) {
		this.havePj = havePj;
	}

	/**
	 * 获取haventPj
	 * 
	 * @return haventPj
	 */
	public int getHaventPj() {
		return haventPj;
	}

	/**
	 * 设置haventPj
	 * 
	 * @param haventPj
	 *            haventPj
	 */
	public void setHaventPj(int haventPj) {
		this.haventPj = haventPj;
	}

}
