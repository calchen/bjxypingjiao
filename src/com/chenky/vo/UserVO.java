package com.chenky.vo;
/**
 * 数据库中表user
 * <br />
 * @version 1.0 <br />
 * @author  陈恺垣 chenkaiyuan1993@gmail.com
 */
public class UserVO {
	private String id;
	private String name;
	private String password;
	private String level;
	public UserVO() {
		super();
	}
	public UserVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public UserVO(String id, String name, String password, String level) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.level = level;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof UserVO) {
			UserVO user2 = (UserVO) obj;
			if(!user2.getId().equals(id)) {
				return false;
			}
			if(!user2.getPassword().equals(password)) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	/** 
	 * 获取id 
	 * @return id 
	 */
	public String getId() {
		return id;
	}
	/** 
	 * 设置id 
	 * @param id id 
	 */
	public void setId(String id) {
		this.id = id;
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
	 * 获取password 
	 * @return password 
	 */
	public String getPassword() {
		return password;
	}
	/** 
	 * 设置password 
	 * @param password password 
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/** 
	 * 获取level 
	 * @return level 
	 */
	public String getLevel() {
		return level;
	}
	/** 
	 * 设置level 
	 * @param level level 
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
