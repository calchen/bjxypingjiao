package com.chenky.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生信息 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class StudentVO {
	/**
	 * 学号
	 */
	private String id;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 权限
	 */
	private String level;
	/**
	 * 专业
	 */
	private String professionalName;
	/**
	 * 行政班
	 */
	private String executiveClass;
	/**
	 * 身份证号
	 */
	private String idCardNumber;
	/**
	 * 电话
	 */
	private String telNumber;
	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 课程列表
	 */
	private List<CourseVO> courses = new ArrayList<CourseVO>();

	/**
	 * 默认构造
	 */
	public StudentVO() {
	}

	/**
	 * 
	 * @param id
	 * @param password
	 * @param name
	 */
	public StudentVO(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	/**
	 * 
	 * @param id
	 * @param password
	 * @param name
	 * @param professionalName
	 * @param executiveClass
	 * @param idCardNumber
	 */
	public StudentVO(String id, String password, String name,
			String professionalName, String executiveClass, String idCardNumber) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.professionalName = professionalName;
		this.executiveClass = executiveClass;
		this.idCardNumber = idCardNumber;
	}

	/**
	 * 
	 * @param id
	 * @param password
	 * @param name
	 * @param level
	 * @param professionalName
	 * @param executiveClass
	 * @param idCardNumber
	 * @param telNumber
	 * @param email
	 */
	public StudentVO(String id, String password, String name, String level,
			String professionalName, String executiveClass,
			String idCardNumber, String telNumber, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.level = level;
		this.professionalName = professionalName;
		this.executiveClass = executiveClass;
		this.idCardNumber = idCardNumber;
		this.telNumber = telNumber;
		this.email = email;
	}

	public StudentVO(String id, String password, String name, String level,
			String professionalName, String executiveClass,
			String idCardNumber, String telNumber, String email,
			List<CourseVO> courses) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.level = level;
		this.professionalName = professionalName;
		this.executiveClass = executiveClass;
		this.idCardNumber = idCardNumber;
		this.telNumber = telNumber;
		this.email = email;
		this.courses = courses;
	}

	/**
	 * 获取id
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置password
	 * 
	 * @param password
	 *            password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取level
	 * 
	 * @return level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * 设置level
	 * 
	 * @param level
	 *            level
	 */
	public void setLevel(String level) {
		this.level = level;
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

	/**
	 * 获取idCardNumber
	 * 
	 * @return idCardNumber
	 */
	public String getIdCardNumber() {
		return idCardNumber;
	}

	/**
	 * 设置idCardNumber
	 * 
	 * @param idCardNumber
	 *            idCardNumber
	 */
	public void setIdCardNumber(String idCardNumber) {
		if (idCardNumber == null) {
			this.idCardNumber = idCardNumber;
		} else {
			this.idCardNumber = idCardNumber.toLowerCase();
		}
	}

	/**
	 * 获取telNumber
	 * 
	 * @return telNumber
	 */
	public String getTelNumber() {
		return telNumber.toLowerCase();
	}

	/**
	 * 设置telNumber
	 * 
	 * @param telNumber
	 *            telNumber
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 获取email
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置email
	 * 
	 * @param email
	 *            email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取courses
	 * 
	 * @return courses
	 */
	public List<CourseVO> getCourses() {
		return courses;
	}

	/**
	 * 设置courses
	 * 
	 * @param courses
	 *            courses
	 */
	public void setCourses(List<CourseVO> courses) {
		this.courses = courses;
	}

}
