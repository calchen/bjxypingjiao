package com.chenky.struts.admin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.chenky.vo.CourseVO;
import com.chenky.vo.FileVO;
import com.chenky.vo.GradeVO;
import com.chenky.vo.SemesterVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class UploaddataAction extends ActionSupport {

	private List<FileVO> filelist = new ArrayList<FileVO>();
	private List<GradeVO> gradeList = new ArrayList<GradeVO>();
	private List<SemesterVO> semesterList = new ArrayList<SemesterVO>();
	private List<CourseVO> courseList = new ArrayList<CourseVO>();
	private GradeVO grade;
	private SemesterVO semester;
	private CourseVO course;
	private File file;
	private String fileFileName;
	private String fileContentType;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_学生信息.xls", "/upload/data/2013-2014_第一学期_学生信息.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_体育选课.xls", "/upload/data/2013-2014_第一学期_体育选课.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_CE1.xls", "/upload/data/2013-2014_第一学期_CE1.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_CE3.xls", "/upload/data/2013-2014_第一学期_CE3.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_物理实验.xls", "/upload/data/2013-2014_第一学期_物理实验.xls", "2014-10-20 9：34", "admin"));
		courseList.add(new CourseVO("2014-2015", "1", "2011级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "2012级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "2013级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "2014级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "体育"));
		courseList.add(new CourseVO("2014-2015", "1", "CE1"));
		courseList.add(new CourseVO("2014-2015", "1", "CE3"));
		courseList.add(new CourseVO("2014-2015", "1", "物理实验"));
		course = new CourseVO("2014-2015", "1", "2011级"+"学生信息");
		gradeList.add(new GradeVO("2013-2014"));
		gradeList.add(new GradeVO("2014-2015"));
		gradeList.add(new GradeVO("2015-2016"));
		grade = new GradeVO("2014-2015");
		semesterList.add(new SemesterVO("第1学期"));
		semesterList.add(new SemesterVO("第2学期"));
		semester = new SemesterVO("第1学期");
		
		return SUCCESS;
	}

	public String upload() throws Exception{
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_学生信息.xls", "/upload/data/2013-2014_第一学期_学生信息.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_体育选课.xls", "/upload/data/2013-2014_第一学期_体育选课.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_CE1.xls", "/upload/data/2013-2014_第一学期_CE1.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_CE3.xls", "/upload/data/2013-2014_第一学期_CE3.xls", "2014-10-20 9：34", "admin"));
		filelist.add(new FileVO("asdsad", "2013-2014_第一学期_物理实验.xls", "/upload/data/2013-2014_第一学期_物理实验.xls", "2014-10-20 9：34", "admin"));
		courseList.add(new CourseVO("2014-2015", "1", "2011级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "2012级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "2013级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "2014级"+"学生信息"));
		courseList.add(new CourseVO("2014-2015", "1", "体育"));
		courseList.add(new CourseVO("2014-2015", "1", "CE1"));
		courseList.add(new CourseVO("2014-2015", "1", "CE3"));
		courseList.add(new CourseVO("2014-2015", "1", "物理实验"));
		course = new CourseVO("2014-2015", "1", "2011级"+"学生信息");
		gradeList.add(new GradeVO("2013-2014"));
		gradeList.add(new GradeVO("2014-2015"));
		gradeList.add(new GradeVO("2015-2016"));
		grade = new GradeVO("2014-2015");
		semesterList.add(new SemesterVO("第1学期"));
		semesterList.add(new SemesterVO("第2学期"));
		semester = new SemesterVO("第1学期");	
		
		//文件上传功能
		
		return SUCCESS;
	}
	
	/** 
	 * 获取filelist 
	 * @return filelist 
	 */
	public List<FileVO> getFilelist() {
		return filelist;
	}

	/** 
	 * 设置filelist 
	 * @param filelist filelist 
	 */
	public void setFilelist(List<FileVO> filelist) {
		this.filelist = filelist;
	}

	/** 
	 * 获取gradeList 
	 * @return gradeList 
	 */
	public List<GradeVO> getGradeList() {
		return gradeList;
	}

	/** 
	 * 设置gradeList 
	 * @param gradeList gradeList 
	 */
	public void setGradeList(List<GradeVO> gradeList) {
		this.gradeList = gradeList;
	}

	/** 
	 * 获取semesterList 
	 * @return semesterList 
	 */
	public List<SemesterVO> getSemesterList() {
		return semesterList;
	}

	/** 
	 * 设置semesterList 
	 * @param semesterList semesterList 
	 */
	public void setSemesterList(List<SemesterVO> semesterList) {
		this.semesterList = semesterList;
	}

	/** 
	 * 获取courseList 
	 * @return courseList 
	 */
	public List<CourseVO> getCourseList() {
		return courseList;
	}

	/** 
	 * 设置courseList 
	 * @param courseList courseList 
	 */
	public void setCourseList(List<CourseVO> courseList) {
		this.courseList = courseList;
	}

	/** 
	 * 获取grade 
	 * @return grade 
	 */
	public GradeVO getGrade() {
		return grade;
	}

	/** 
	 * 设置grade 
	 * @param grade grade 
	 */
	public void setGrade(GradeVO grade) {
		this.grade = grade;
	}

	/** 
	 * 获取semester 
	 * @return semester 
	 */
	public SemesterVO getSemester() {
		return semester;
	}

	/** 
	 * 设置semester 
	 * @param semester semester 
	 */
	public void setSemester(SemesterVO semester) {
		this.semester = semester;
	}

	/** 
	 * 获取course 
	 * @return course 
	 */
	public CourseVO getCourse() {
		return course;
	}

	/** 
	 * 设置course 
	 * @param course course 
	 */
	public void setCourse(CourseVO course) {
		this.course = course;
	}

	/** 
	 * 获取file 
	 * @return file 
	 */
	public File getFile() {
		return file;
	}

	/** 
	 * 设置file 
	 * @param file file 
	 */
	public void setFile(File file) {
		this.file = file;
	}
	
	
}
