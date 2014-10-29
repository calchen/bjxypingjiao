package com.chenky.struts.stu;

import java.util.Map;

import com.chenky.service.ProfileService;
import com.chenky.util.IdCardNumberUtil;
import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生编辑个人信息的Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class ProfileAction extends ActionSupport {

	/**
	 * 学生信息
	 */
	private StudentVO studentInfo = new StudentVO();
	/**
	 * 状态
	 */
	private String status;

	@Override
	public String execute() throws Exception {
		// 获取session
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 获取老师信息
		studentInfo = new ProfileService().getStudentProfile((String) session
				.get("USER_ID"));
		// 对合法身份证号进行模糊
		studentInfo.setIdCardNumber(IdCardNumberUtil.fuzzy(studentInfo
				.getIdCardNumber()));
		return SUCCESS;
	}
	
	/**
	 * 设置学生信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public String setting() throws Exception {
		// 获取session
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 实例化相关service
		ProfileService service = new ProfileService();
		// 获取当前登录的学生信息
		StudentVO student = service.getStudentProfile((String) session
				.get("USER_ID"));
		// 如果获取不到说明产生了错误，提示修改失败
		if (student == null) {
			status = "修改失败";
			return SUCCESS;
		}
		// 设置电话号码新的值
		student.setTelNumber(studentInfo.getTelNumber());
		// 设置邮箱新的值
		student.setEmail(studentInfo.getEmail());
		// 如果身份证号新的值合法就设置
		if (IdCardNumberUtil.isLegal(studentInfo.getIdCardNumber())
				&& !IdCardNumberUtil.isLegal(student.getIdCardNumber())) {
			student.setIdCardNumber(studentInfo.getIdCardNumber());
		}
		// 保存用户信息，如果保存失败则提示修改失败
		if (!service.setStudentProfile(student)) {
			studentInfo = student;
			status = "修改失败";
			return SUCCESS;
		}
		// 将数据传给JSP用来显示
		studentInfo = student;
		// 对合法身份证号进行模糊
		studentInfo.setIdCardNumber(IdCardNumberUtil.fuzzy(student
				.getIdCardNumber()));

		status = "修改成功";
		return SUCCESS;
	}

	/**
	 * 获取studentInfo
	 * 
	 * @return studentInfo
	 */
	public StudentVO getStudentInfo() {
		return studentInfo;
	}

	/**
	 * 设置studentInfo
	 * 
	 * @param studentInfo
	 *            studentInfo
	 */
	public void setStudentInfo(StudentVO studentInfo) {
		this.studentInfo = studentInfo;
	}

	/**
	 * 获取status
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

}
