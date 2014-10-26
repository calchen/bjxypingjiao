package com.chenky.struts.tch;

import java.util.Map;

import com.chenky.service.PingjiaoService;
import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
@SuppressWarnings("serial")
public class TchpjAction extends ActionSupport {

	private PingjiaoResultVO result;
	/**
	 * 课程名
	 */
	private String name;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		String userId = (String) session.get("USER_ID");
		String[] ac = ActionContext.getContext().getName().split("_");
		result = new PingjiaoService().getTeacherPjResult(new CourseVO(ac[1],
				ac[2], name, userId));
		return SUCCESS;
	}

	public String setting() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String userId = (String) session.get("USER_ID");
		result.setStatus("1");
		result.setUserID(userId);
		new PingjiaoService().setTeacherPjResult(result);
		return SUCCESS;
	}

	/**
	 * 获取result
	 * 
	 * @return result
	 */
	public PingjiaoResultVO getResult() {
		return result;
	}

	/**
	 * 设置result
	 * 
	 * @param result
	 *            result
	 */
	public void setResult(PingjiaoResultVO result) {
		this.result = result;
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

}
