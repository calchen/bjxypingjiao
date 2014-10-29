package com.chenky.service;

/**
 * 文件相关服务，提供导入导出功能 <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class FileService {

	/**
	 * 获取文件路径（待定）
	 * 
	 * @param fileName
	 * @return
	 */
	private String getFilePath(String fileName) {
		String path = System.getProperty("user.dir")
				+ "\\WebContent\\upload\\data\\" + fileName;
		return path;
	}
}
