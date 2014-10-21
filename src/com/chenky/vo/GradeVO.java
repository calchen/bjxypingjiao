package com.chenky.vo;

/**
 * 学年 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class GradeVO {
	private int gradeID;
	private String gradeValue;

	public GradeVO(int gradeID, String gradeValue) {
		super();
		this.gradeID = gradeID;
		this.gradeValue = gradeValue;
	}

	/**
	 * 获取gradeID
	 * 
	 * @return gradeID
	 */
	public int getGradeID() {
		return gradeID;
	}

	/**
	 * 获取gradeValue
	 * 
	 * @return gradeValue
	 */
	public String getGradeValue() {
		return gradeValue;
	}

}
