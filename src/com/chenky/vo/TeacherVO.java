package com.chenky.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 教师信息
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class TeacherVO {
	/**
	 * 工资号
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
	public TeacherVO() {
	}

	/**
	 * 
	 * @param id
	 * @param password
	 * @param name
	 */
	public TeacherVO(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
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
		return telNumber;
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
