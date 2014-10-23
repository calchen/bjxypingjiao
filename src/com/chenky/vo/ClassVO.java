package com.chenky.vo;
/**
 * 班级类
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class ClassVO {
	/**
	 * 班级名,行政班名或者分组名
	 */
	private String name;
	/**
	 * 班级总人数
	 */
	private int allNum;
	/**
	 * 已经参与评教的人数
	 */
	private int doneNum;
	public ClassVO() {
		super();
	}
	public ClassVO(String name, int allNum) {
		super();
		this.name = name;
		this.allNum = allNum;
	}
	public ClassVO(String name, int allNum, int doneNum) {
		super();
		this.name = name;
		this.allNum = allNum;
		this.doneNum = doneNum;
	}
	/** 
	 * 获取name 
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	/** 
	 * 设置name 
	 * @param name name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 * 获取allNum 
	 * @return allNum 
	 */
	public int getAllNum() {
		return allNum;
	}
	/** 
	 * 设置allNum 
	 * @param allNum allNum 
	 */
	public void setAllNum(int allNum) {
		this.allNum = allNum;
	}
	/** 
	 * 获取doneNum 
	 * @return doneNum 
	 */
	public int getDoneNum() {
		return doneNum;
	}
	/** 
	 * 设置doneNum 
	 * @param doneNum doneNum 
	 */
	public void setDoneNum(int doneNum) {
		this.doneNum = doneNum;
	}
	
	
}
