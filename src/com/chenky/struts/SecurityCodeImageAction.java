package com.chenky.struts;

import java.io.ByteArrayInputStream;
import java.util.Map;

import com.chenky.util.SecurityCode;
import com.chenky.util.SecurityImage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 提供图片验证码
 * 
 * @version 1.0 2012/08/22
 * @author dongliyang
 *         http://www.cnblogs.com/dongliyang/archive/2012/08/24/2654431.html
 *         感謝作者
 * 
 *         对功能进行部分修改 修改者：chenkaiyuan 2014.10.23
 */
@SuppressWarnings("serial")
public class SecurityCodeImageAction extends ActionSupport {

	private String timestamp;

	// 图片流
	private ByteArrayInputStream imageStream;

	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 获取默认难度和长度的验证码
		String securityCode = SecurityCode.getSecurityCode();
		imageStream = SecurityImage.getImageAsInputStream(securityCode);
		// 放入session中
		session.put("SESSION_SECURITY_CODE", securityCode.toLowerCase());
		return SUCCESS;
	}

	/**
	 * 获取imageStream
	 * 
	 * @return imageStream
	 */
	public ByteArrayInputStream getImageStream() {
		return imageStream;
	}

	/**
	 * 设置imageStream
	 * 
	 * @param imageStream
	 *            imageStream
	 */
	public void setImageStream(ByteArrayInputStream imageStream) {
		this.imageStream = imageStream;
	}

	/**
	 * 获取timestamp
	 * 
	 * @return timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * 设置timestamp
	 * 
	 * @param timestamp
	 *            timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}