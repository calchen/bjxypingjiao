package com.chenky.service;

/**
 * 用于读取修改系统配置 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SystemConfigService {
	/**
	 * 获取信息公告的内容（未完成）
	 * 
	 * @return
	 */
	public String getPublicMessage() {
		return "评教进行中";
	}

	/**
	 * 设置信息公告的内容（未完成）
	 * 
	 * @param message
	 *            需要显示的信息
	 * @return 是否设置成功
	 */
	public boolean setPublicMessage(String message) {
		return true;
	}
}
