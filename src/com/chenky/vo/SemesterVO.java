package com.chenky.vo;

/**
 * 学期 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SemesterVO {
	private String value;

	public SemesterVO() {
		super();
	}

	public SemesterVO(String value) {
		super();
		this.value = value;
	}

	/**
	 * 获取value
	 * 
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置value
	 * 
	 * @param value
	 *            value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
