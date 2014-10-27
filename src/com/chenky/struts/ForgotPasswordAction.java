package com.chenky.struts;

import java.util.Map;

import com.chenky.service.ProfileService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生修改密码的Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class ForgotPasswordAction extends ActionSupport {

	/**
	 * 用户名
	 */
	private String id;
	/**
	 * 身份证号
	 */
	private String idcardNum;
	/**
	 * 新密码
	 */
	private String newPassword;
	/**
	 * 验证码
	 */
	private String securityCode;
	/**
	 * 错误信息
	 */
	private String status;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	/**
	 * 修改密码
	 * 
	 * @return
	 * @throws Exception
	 */
	public String setting() throws Exception {
		// 获取session
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 获取服务
		ProfileService service = new ProfileService();
		if (id == null || "".equals(id)) {
			status = "用户名不能为空";
			return SUCCESS;
		}
		if(idcardNum == null || "".equals(idcardNum)){
			status = "身份证号不能为空";
			return SUCCESS;
		}
		if (newPassword == null || newPassword.equals("")) {
			status = "新密码不能为空";
			return SUCCESS;
		}
		if (securityCode == null || "".equals(securityCode)) {
			status = "验证码不能为空";
			return SUCCESS;
		}
		if (!securityCode.equals(session.get("SESSION_SECURITY_CODE"))) {
			status = "验证码错误";
			return ERROR;
		}
		
		// 检查用户信息，如果正确就保存新密码
		if (!service.resetPassword(id,idcardNum,newPassword)) {
			status = "密码修改失败,用户名或身份证号错误";
			return SUCCESS;
		}
		status = "密码修改成功，请重新登录";
		return SUCCESS;
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
	 * 设置id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 设置idcardNum
	 * 
	 * @param idcardNum
	 *            idcardNum
	 */
	public void setIdcardNum(String idcardNum) {
		this.idcardNum = idcardNum;
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
	 * 设置securityCode
	 * 
	 * @param securityCode
	 *            securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

}
