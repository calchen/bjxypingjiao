package com.chenky.vo;

/**
 * 评教状态，对应class表 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class PingjiaoStatusVO {
	/**
	 * 学生学号
	 */
	private String student_id;
	/**
	 * 老师工资号
	 */
	private String teacher_id;
	/**
	 * 学年
	 */
	private String course_grade;
	/**
	 * 学期
	 */
	private String course_semester;
	/**
	 * 课程
	 */
	private String course_name;
	/**
	 * 学生得分
	 */
	private float stuFraction;
	/**
	 * 老师得分
	 */
	private float tchFraction;
	/**
	 * 老师评学生的结果
	 */
	private String sturesult;
	/**
	 * 学生评老师的结果
	 */
	private String tchresult;
	/**
	 * 分班班级
	 */
	private String className;
	/**
	 * 学生是否评教，已评1未评0
	 */
	private int stustatus;
	/**
	 * 老师是否评教，已评1未评0
	 */
	private int tchstatus;
	/**
	 * 专业
	 */
	private String professionalName;
	/**
	 * 行政班
	 */
	private String executiveClass;

	/**
	 * 
	 */
	public PingjiaoStatusVO() {
		super();
	}

	/**
	 * 
	 * @param student_id
	 * @param teacher_id
	 * @param course_grade
	 * @param course_semester
	 * @param course_name
	 * @param className
	 */
	public PingjiaoStatusVO(String student_id, String teacher_id,
			String course_grade, String course_semester, String course_name,
			String className) {
		super();
		this.student_id = student_id;
		this.teacher_id = teacher_id;
		this.course_grade = course_grade;
		this.course_semester = course_semester;
		this.course_name = course_name;
		this.className = className;
	}

	/**
	 * 获取student_id
	 * 
	 * @return student_id
	 */
	public String getStudent_id() {
		return student_id;
	}

	/**
	 * 设置student_id
	 * 
	 * @param student_id
	 *            student_id
	 */
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	/**
	 * 获取teacher_id
	 * 
	 * @return teacher_id
	 */
	public String getTeacher_id() {
		return teacher_id;
	}

	/**
	 * 设置teacher_id
	 * 
	 * @param teacher_id
	 *            teacher_id
	 */
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	/**
	 * 获取course_grade
	 * 
	 * @return course_grade
	 */
	public String getCourse_grade() {
		return course_grade;
	}

	/**
	 * 设置course_grade
	 * 
	 * @param course_grade
	 *            course_grade
	 */
	public void setCourse_grade(String course_grade) {
		this.course_grade = course_grade;
	}

	/**
	 * 获取course_semester
	 * 
	 * @return course_semester
	 */
	public String getCourse_semester() {
		return course_semester;
	}

	/**
	 * 设置course_semester
	 * 
	 * @param course_semester
	 *            course_semester
	 */
	public void setCourse_semester(String course_semester) {
		this.course_semester = course_semester;
	}

	/**
	 * 获取course_name
	 * 
	 * @return course_name
	 */
	public String getCourse_name() {
		return course_name;
	}

	/**
	 * 设置course_name
	 * 
	 * @param course_name
	 *            course_name
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	/**
	 * 获取stuFraction
	 * 
	 * @return stuFraction
	 */
	public float getStuFraction() {
		return stuFraction;
	}

	/**
	 * 设置stuFraction
	 * 
	 * @param stuFraction
	 *            stuFraction
	 */
	public void setStuFraction(float stuFraction) {
		this.stuFraction = stuFraction;
	}

	/**
	 * 获取tchFraction
	 * 
	 * @return tchFraction
	 */
	public float getTchFraction() {
		return tchFraction;
	}

	/**
	 * 设置tchFraction
	 * 
	 * @param tchFraction
	 *            tchFraction
	 */
	public void setTchFraction(float tchFraction) {
		this.tchFraction = tchFraction;
	}

	/**
	 * 获取sturesult
	 * 
	 * @return sturesult
	 */
	public String getSturesult() {
		return sturesult;
	}

	/**
	 * 设置sturesult
	 * 
	 * @param sturesult
	 *            sturesult
	 */
	public void setSturesult(String sturesult) {
		this.sturesult = sturesult;
	}

	/**
	 * 获取tchresult
	 * 
	 * @return tchresult
	 */
	public String getTchresult() {
		return tchresult;
	}

	/**
	 * 设置tchresult
	 * 
	 * @param tchresult
	 *            tchresult
	 */
	public void setTchresult(String tchresult) {
		this.tchresult = tchresult;
	}

	/**
	 * 获取className
	 * 
	 * @return className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * 设置className
	 * 
	 * @param className
	 *            className
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * 获取stustatus
	 * 
	 * @return stustatus
	 */
	public int getStustatus() {
		return stustatus;
	}

	/**
	 * 设置stustatus
	 * 
	 * @param stustatus
	 *            stustatus
	 */
	public void setStustatus(int stustatus) {
		this.stustatus = stustatus;
	}

	/**
	 * 获取tchstatus
	 * 
	 * @return tchstatus
	 */
	public int getTchstatus() {
		return tchstatus;
	}

	/**
	 * 设置tchstatus
	 * 
	 * @param tchstatus
	 *            tchstatus
	 */
	public void setTchstatus(int tchstatus) {
		this.tchstatus = tchstatus;
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

}
