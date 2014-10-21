package com.chenky.struts.stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		List<String> list = new ArrayList<String>();
		for(int i = 0;i <= 10;i++) {
			list.add(i+"");
		}

		result = new PingjiaoResultVO("20142015", "1", "体育", "未评", list);
		return SUCCESS;
	}

	public String setting() throws Exception {
		result.setStatus("已评");
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

}
