package com.chenky.struts.tch;

import java.util.Map;

import com.chenky.service.ProfileService;
import com.chenky.util.IdCardNumberUtil;
import com.chenky.vo.TeacherVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 老师编辑个人信息的Action <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class ProfileAction extends ActionSupport {

	/**
	 * 老师信息
	 */
	private TeacherVO teacherInfo = new TeacherVO();
	/**
	 * 状态
	 */
	private String status;

	@Override
	public String execute() throws Exception {
		// 获取session
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 获取老师信息
		teacherInfo = new ProfileService().getTeacherProfile((String) session
				.get("USER_ID"));
		// 对合法身份证号进行模糊
		teacherInfo.setIdCardNumber(IdCardNumberUtil.fuzzy(teacherInfo
				.getIdCardNumber()));
		return SUCCESS;
	}

	/**
	 * 设置老师信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public String setting() throws Exception {
		// 获取session
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 实例化相关service
		ProfileService service = new ProfileService();
		// 获取当前登录的老师信息
		TeacherVO teacher = service.getTeacherProfile((String) session
				.get("USER_ID"));
		// 如果获取不到说明产生了错误，提示修改失败
		if (teacher == null) {
			status = "修改失败";
			return SUCCESS;
		}
		// 设置电话号码新的值
		teacher.setTelNumber(teacherInfo.getTelNumber());
		// 设置邮箱新的值
		teacher.setEmail(teacherInfo.getEmail());
		// 如果身份证号新的值合法就设置
		if (IdCardNumberUtil.isLegal(teacherInfo.getIdCardNumber())
				&& !IdCardNumberUtil.isLegal(teacher.getIdCardNumber())) {
			teacher.setIdCardNumber(teacherInfo.getIdCardNumber());
		}
		// 保存用户信息，如果保存失败则提示修改失败
		if (!service.setTeacherProfile(teacher)) {
			teacherInfo = teacher;
			status = "修改失败";
			return SUCCESS;
		}
		// 将数据传给JSP用来显示
		teacherInfo = teacher;
		// 对合法身份证号进行模糊
		teacherInfo.setIdCardNumber(IdCardNumberUtil.fuzzy(teacher
				.getIdCardNumber()));

		status = "修改成功";
		return SUCCESS;
	}

	/**
	 * 获取teacherInfo
	 * 
	 * @return teacherInfo
	 */
	public TeacherVO getTeacherInfo() {
		return teacherInfo;
	}

	/**
	 * 设置teacherInfo
	 * 
	 * @param teacherInfo
	 *            teacherInfo
	 */
	public void setTeacherInfo(TeacherVO teacherInfo) {
		this.teacherInfo = teacherInfo;
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
