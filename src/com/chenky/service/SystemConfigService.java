package com.chenky.service;
/**
 * 用于读取修改系统配置
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class SystemConfigService {
	public String getPublicMessage() {
		return "评教进行中";
	}
	public boolean setPublicMessage(String message) {
		return true;
	}
}
