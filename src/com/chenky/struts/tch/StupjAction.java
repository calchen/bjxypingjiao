package com.chenky.struts.tch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.chenky.service.PingjiaoService;
import com.chenky.vo.CourseVO;
import com.chenky.vo.PingjiaoResultVO;
import com.chenky.vo.StudentVO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class StupjAction extends ActionSupport {

	private PingjiaoResultVO result;
	private String name;
	private String type;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		String userId = (String) session.get("USER_ID");
		
		String[] ac = ActionContext.getContext().getName().split("_");
		type = ac[3];
		result = new PingjiaoService().getPingjiaoResult(new CourseVO(ac[1], ac[2], name, userId));

		return SUCCESS;
	}

	public String setting() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String userId = (String) session.get("USER_ID");
		result.setStatus("1");
		result.setUserID(userId);
		new PingjiaoService().setPingjiao(result);
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
	 * @return name 
	 */
	public String getName() {
		return name;
	}

	/** 
	 * 设置name 
	 * @param name name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * 获取type 
	 * @return type 
	 */
	public String getType() {
		return type;
	}

	/** 
	 * 设置type 
	 * @param type type 
	 */
	public void setType(String type) {
		this.type = type;
	}
	

}
