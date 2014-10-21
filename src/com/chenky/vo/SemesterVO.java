package com.chenky.vo;

/**
 * 学期 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SemesterVO {
	private int semesterID;
	private String semesterValue;

	public SemesterVO(int semesterID, String semesterValue) {
		super();
		this.semesterID = semesterID;
		this.semesterValue = semesterValue;
	}

	/**
	 * 获取semesterID
	 * 
	 * @return semesterID
	 */
	public int getSemesterID() {
		return semesterID;
	}

	/**
	 * 获取semesterValue
	 * 
	 * @return semesterValue
	 */
	public String getSemesterValue() {
		return semesterValue;
	}

}
