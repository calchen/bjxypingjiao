package com.chenky.service;
/**
 * 
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class UploadService {

	
	/**
	 * 获取文件路径
	 * @param fileName
	 * @return
	 */
	private String getFilePath(String fileName) {
		String path = System.getProperty("user.dir")+"\\WebContent\\upload\\data\\"+fileName;
		return path;
	}
}
