package com.chenky.struts.admin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
@SuppressWarnings("serial")
public class SettingAction extends ActionSupport {

	/**
	 * 学年列表
	 */
	private List<GradeVO> gradeList = new ArrayList<GradeVO>();
	/**
	 * 学期列表
	 */
	private List<SemesterVO> semesterList = new ArrayList<SemesterVO>();
	/**
	 * 学年
	 */
	private GradeVO grade = new GradeVO();
	/**
	 * 学期
	 */
	private SemesterVO semester = new SemesterVO();
	/**
	 * 评教状态
	 */
	private String status = "going";

	/**
	 * 开始时间
	 */
	private String start;
	/**
	 * 结束时间
	 */
	private String end;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		gradeList.add(new GradeVO("2013-2014"));
		gradeList.add(new GradeVO("2014-2015"));
		gradeList.add(new GradeVO("2015-2016"));
		grade.setValue("2014-2015");
		semesterList.add(new SemesterVO("第1学期"));
		semesterList.add(new SemesterVO("第2学期"));
		semester.setValue("第1学期");
		start = "2014-10-27 08:00";
		end = "2014-11-09 23:00";
		return SUCCESS;
	}

	public String setting() throws Exception {
		gradeList.add(new GradeVO("2013-2014"));
		gradeList.add(new GradeVO("2014-2015"));
		gradeList.add(new GradeVO("2015-2016"));

		semesterList.add(new SemesterVO("第1学期"));
		semesterList.add(new SemesterVO("第2学期"));
		semester = new SemesterVO("第1学期");

		Calendar startcal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		startcal.setTime(sdf.parse(start));

		return SUCCESS;
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
	 * 获取start
	 * 
	 * @return start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * 设置start
	 * 
	 * @param start
	 *            start
	 */
	public void setStart(String start) {
		this.start = start;
	}

	/**
	 * 获取end
	 * 
	 * @return end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * 设置end
	 * 
	 * @param end
	 *            end
	 */
	public void setEnd(String end) {
		this.end = end;
	}

}
