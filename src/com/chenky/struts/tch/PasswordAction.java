package com.chenky.struts.tch;

import java.util.Map;

import com.chenky.service.ProfileService;
import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生修改密码的Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class PasswordAction extends ActionSupport {

	/**
	 * 学生信息
	 */
	private String oldPawword;
	/**
	 * 学生新密码
	 */
	private String newPassword;
	/**
	 * 错误信息
	 */
	private String status;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String setting() throws Exception {
		//获取session
		Map<String, Object> session = ActionContext.getContext().getSession();
		ProfileService service = new ProfileService();
		String id = (String) session.get("USER_ID");
		StudentVO studentInfo = service.getStudentProfile(id);
		if (oldPawword == null || oldPawword.equals("")) {
			status = "旧密码不能为空";
			return SUCCESS;
		}
		if (newPassword == null || newPassword.equals("")) {
			status = "新密码不能为空";
			return SUCCESS;
		}
		if (!oldPawword.equals(studentInfo.getPassword())) {
			status = "密码修改失败，旧密码错误";
			return SUCCESS;
		}
		if(oldPawword.equals(newPassword)) {
			status = "密码修改失败，新旧密码不能相同";
			return SUCCESS;
		}
		studentInfo.setPassword(newPassword);
		service.setPassword(studentInfo);
		status = "密码修改成功";
		return SUCCESS;
	}

	/**
	 * 获取oldPawword
	 * 
	 * @return oldPawword
	 */
	public String getOldPawword() {
		return oldPawword;
	}

	/**
	 * 设置oldPawword
	 * 
	 * @param oldPawword
	 *            oldPawword
	 */
	public void setOldPawword(String oldPawword) {
		this.oldPawword = oldPawword;
	}

	/**
	 * 获取newPassword
	 * 
	 * @return newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * 设置newPassword
	 * 
	 * @param newPassword
	 *            newPassword
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
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
