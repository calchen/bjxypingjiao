package com.chenky.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 一门课的评教结果 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoResultVO {
	/**
	 * 学年
	 */
	private String grade;
	/**
	 * 学期
	 */
	private String semester;

	/**
	 * 课程名
	 */
	private String course;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 用户ID
	 */
	private String userID;

	/**
	 * 评教结果
	 */
	private List<String> result =new ArrayList<String>();
	/**
	 * 评教得分
	 */
	private double mark;

	public PingjiaoResultVO() {
		
	}

	public PingjiaoResultVO(String grade, String semester, String course,
			String status, String userID, List<String> result) {
		super();
		this.grade = grade;
		this.semester = semester;
		this.course = course;
		this.status = status;
		this.userID = userID;
		this.result = result;
	}

	
	public PingjiaoResultVO(String grade, String semester, String course,
			String status, List<String> result) {
		super();
		this.grade = grade;
		this.semester = semester;
		this.course = course;
		this.status = status;
		this.result = result;
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

	/**
	 * 获取userID
	 * 
	 * @return userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * 设置userID
	 * 
	 * @param userID
	 *            userID
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * 获取result
	 * 
	 * @return result
	 */
	public List<String> getResult() {
		return result;
	}

	/**
	 * 设置result
	 * 
	 * @param result
	 *            result
	 */
	public void setResult(List<String> result) {
		this.result = result;
	}

	/** 
	 * 获取mark 
	 * @return mark 
	 */
	public double getMark() {
		return mark;
	}

	/** 
	 * 设置mark 
	 * @param mark mark 
	 */
	public void setMark(double mark) {
		this.mark = mark;
	}

}
