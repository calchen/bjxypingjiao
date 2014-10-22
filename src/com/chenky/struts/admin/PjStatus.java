package com.chenky.struts.admin;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chenky.vo.ClassVO;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PjStatus extends ActionSupport {

	/**
	 * 当前页面
	 */
	private String page;
	/**
	 * 分页列表
	 */
	private List<String> pageList = new ArrayList<String>();
	/**
	 * 前页
	 */
	private int pre;
	/**
	 * 后页
	 */
	private int next;
	/**
	 * 步长
	 */
	private int Step = 5;
	/**
	 * 状态列表
	 */
	private List<ClassVO> statusList = new ArrayList<ClassVO>();
	/**
	 * 年级列表
	 */
	private List<String> gradeList = new ArrayList<String>();
	/**
	 * 当前年级
	 */
	private String grade;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		createGradeList();
		statusList.add(new ClassVO("11计科1", 35, 24));
		statusList.add(new ClassVO("11计科2", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));
		statusList.add(new ClassVO("11计科3", 35, 24));

		pageList.add("1");
		pageList.add("2");
		pageList.add("3");
		pageList.add("4");
		pageList.add("5");
		pre = 1;
		next = 6;
		return SUCCESS;
	}

	private void createGradeList() {
		if (gradeList == null) {
			gradeList = new ArrayList<String>();
		}
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		if (month <= 8) {
			for (int i = 1; i <= 6; i++) {
				gradeList.add(year - i + "级");
			}
		} else {
			for (int i = 0; i < 6; i++) {
				gradeList.add(year - i + "级");
			}
		}
	}
	
	public String search() {
		return SUCCESS;
	}

	/**
	 * 获取page
	 * 
	 * @return page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * 设置page
	 * 
	 * @param page
	 *            page
	 */
	public void setPage(String page) {
		this.page = page;
	}

	/**
	 * 获取pageList
	 * 
	 * @return pageList
	 */
	public List<String> getPageList() {
		return pageList;
	}

	/**
	 * 设置pageList
	 * 
	 * @param pageList
	 *            pageList
	 */
	public void setPageList(List<String> pageList) {
		this.pageList = pageList;
	}

	/**
	 * 获取pre
	 * 
	 * @return pre
	 */
	public int getPre() {
		return pre;
	}

	/**
	 * 设置pre
	 * 
	 * @param pre
	 *            pre
	 */
	public void setPre(int pre) {
		this.pre = pre;
	}

	/**
	 * 获取next
	 * 
	 * @return next
	 */
	public int getNext() {
		return next;
	}

	/**
	 * 设置next
	 * 
	 * @param next
	 *            next
	 */
	public void setNext(int next) {
		this.next = next;
	}

	/**
	 * 获取step
	 * 
	 * @return step
	 */
	public int getStep() {
		return Step;
	}

	/**
	 * 设置step
	 * 
	 * @param step
	 *            step
	 */
	public void setStep(int step) {
		Step = step;
	}

	/**
	 * 获取statusList
	 * 
	 * @return statusList
	 */
	public List<ClassVO> getStatusList() {
		return statusList;
	}

	/**
	 * 设置statusList
	 * 
	 * @param statusList
	 *            statusList
	 */
	public void setStatusList(List<ClassVO> statusList) {
		this.statusList = statusList;
	}

	/**
	 * 获取gradeList
	 * 
	 * @return gradeList
	 */
	public List<String> getGradeList() {
		return gradeList;
	}

	/**
	 * 设置gradeList
	 * 
	 * @param gradeList
	 *            gradeList
	 */
	public void setGradeList(List<String> gradeList) {
		this.gradeList = gradeList;
	}

	/** 
	 * 获取grade 
	 * @return grade 
	 */
	public String getGrade() {
		return grade;
	}

	/** 
	 * 设置grade 
	 * @param grade grade 
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}
