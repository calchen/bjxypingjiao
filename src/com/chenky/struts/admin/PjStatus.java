package com.chenky.struts.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.chenky.service.PingjiaoService;
import com.chenky.vo.PingjiaoStatusVo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理员界面评教查看Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
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
	private int pre = 1;
	/**
	 * 后页
	 */
	private int next = 6;
	/**
	 * 步长
	 */
	private int Step = 5;
	/**
	 * 状态列表
	 */
	private List<PingjiaoStatusVo> statusList = new ArrayList<PingjiaoStatusVo>();

	/**
	 * 行政班列表
	 */
	private List<String> professionalNameList = new ArrayList<String>();
	/**
	 * 行政班
	 */
	private String professionalName;
	/**
	 * 行政班列表
	 */
	private List<String> executiveClassList = new ArrayList<String>();
	/**
	 * 行政班
	 */
	private String executiveClass;
	/**
	 * 课程列表
	 */
	private List<String> courseList = new ArrayList<String>();
	/**
	 * 课程
	 */
	private String course;

	@Override
	public String execute() throws Exception {
		PingjiaoService service = new PingjiaoService();
		Map<String, Object> application = ActionContext.getContext()
				.getApplication();
		professionalNameList = service.getProfessionalNameList(
				(String) application.get("CURRENT_GRADE"),
				(String) application.get("CURRENT_SEMESTER"));
		executiveClassList = service.getExecutiveClassList(
				(String) application.get("CURRENT_GRADE"),
				(String) application.get("CURRENT_SEMESTER"));
		courseList = service.getCourseList(
				(String) application.get("CURRENT_GRADE"),
				(String) application.get("CURRENT_SEMESTER"));
		
		PingjiaoStatusVo vo = new PingjiaoStatusVo();
		vo.setExecutiveClass("总计");
		vo.setGrade("2014-2015");
		vo.setSemester("1");
		vo.setCourse("CE1");
		vo.setHavePj(0);
		vo.setHaventPj(2372);

		statusList.add(vo);
		statusList.add(vo);
		statusList.add(vo);

		pageList.add("1");
		pageList.add("2");
		pageList.add("3");
		pageList.add("4");
		pageList.add("5");
		pre = 1;
		next = 6;

		return SUCCESS;
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
	public List<PingjiaoStatusVo> getStatusList() {
		return statusList;
	}

	/**
	 * 设置statusList
	 * 
	 * @param statusList
	 *            statusList
	 */
	public void setStatusList(List<PingjiaoStatusVo> statusList) {
		this.statusList = statusList;
	}

	/**
	 * 获取professionalNameList
	 * 
	 * @return professionalNameList
	 */
	public List<String> getProfessionalNameList() {
		return professionalNameList;
	}

	/**
	 * 设置professionalNameList
	 * 
	 * @param professionalNameList
	 *            professionalNameList
	 */
	public void setProfessionalNameList(List<String> professionalNameList) {
		this.professionalNameList = professionalNameList;
	}

	/**
	 * 获取professionalName
	 * 
	 * @return professionalName
	 */
	public String getProfessionalName() {
		return professionalName;
	}

	/**
	 * 设置professionalName
	 * 
	 * @param professionalName
	 *            professionalName
	 */
	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}

	/**
	 * 获取executiveClassList
	 * 
	 * @return executiveClassList
	 */
	public List<String> getExecutiveClassList() {
		return executiveClassList;
	}

	/**
	 * 设置executiveClassList
	 * 
	 * @param executiveClassList
	 *            executiveClassList
	 */
	public void setExecutiveClassList(List<String> executiveClassList) {
		this.executiveClassList = executiveClassList;
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
	 * 获取courseList
	 * 
	 * @return courseList
	 */
	public List<String> getCourseList() {
		return courseList;
	}

	/**
	 * 设置courseList
	 * 
	 * @param courseList
	 *            courseList
	 */
	public void setCourseList(List<String> courseList) {
		this.courseList = courseList;
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

}
