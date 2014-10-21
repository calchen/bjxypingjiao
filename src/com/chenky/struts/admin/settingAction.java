package com.chenky.struts.admin;

import java.util.ArrayList;
import java.util.List;

import com.chenky.vo.GradeVO;
import com.chenky.vo.PingjiaoStatusVo;
import com.chenky.vo.SemesterVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class settingAction extends ActionSupport {

	// 学年列表
	private List<GradeVO> gradeList;
	// 当前学年
	private GradeVO currentGrade;
	// 学期列表
	private List<SemesterVO> semesterList;
	// 当前学期
	private SemesterVO currentSemester;
	//评教状态
	private String pjStatus = "end";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		gradeList = new ArrayList<GradeVO>();
		gradeList.add(new GradeVO(20132014, "2013-2014"));
		gradeList.add(new GradeVO(20142015, "2014-2015"));
		gradeList.add(new GradeVO(20152016, "2015-2016"));
		currentGrade = new GradeVO(20142015, "2014-2015");

		semesterList = new ArrayList<SemesterVO>();
		semesterList.add(new SemesterVO(1, "第1学期"));
		semesterList.add(new SemesterVO(2, "第2学期"));
		currentSemester = new SemesterVO(2, "第2学期");
		
		return SUCCESS;
	}

	public String setting() throws Exception {

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
	 * 获取currentGrade
	 * 
	 * @return currentGrade
	 */
	public GradeVO getCurrentGrade() {
		return currentGrade;
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
	 * 获取currentSemester
	 * 
	 * @return currentSemester
	 */
	public SemesterVO getCurrentSemester() {
		return currentSemester;
	}

	/** 
	 * 获取pjStatus 
	 * @return pjStatus 
	 */
	public String getPjStatus() {
		return pjStatus;
	}

}
