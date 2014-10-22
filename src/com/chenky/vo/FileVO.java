package com.chenky.vo;

import java.util.Calendar;

/**
 * 
 * <br />
 * 
 * @version 1.0 <br />
 * @author 陈恺垣 chenkaiyuan1993@gmail.com
 */
public class FileVO {
	/**
	 * 文件的UUID
	 */
	private String id;
	/**
	 * 文件名
	 */
	private String name;
	/**
	 * 文件存储路径
	 */
	private String path;
	/**
	 * 上传日期
	 */
	private String date;
	/**
	 * 上传者
	 */
	private String owner;

	public FileVO() {
		super();
	}

	public FileVO(String id, String name, String path, String date,
			String owner) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
		this.date = date;
		this.owner = owner;
	}


	/**
	 * 获取id
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
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

	/**
	 * 获取path
	 * 
	 * @return path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * 设置path
	 * 
	 * @param path
	 *            path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取date
	 * 
	 * @return date
	 */
	public String getdate() {
		return date;
	}

	/**
	 * 设置date
	 * 
	 * @param date
	 *            date
	 */
	public void setdate(String date) {
		this.date = date;
	}

	/**
	 * 获取owner
	 * 
	 * @return owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * 设置owner
	 * 
	 * @param owner
	 *            owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
