package com.sxxsjwl.pojo;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int u_id;// 索引
	private String u_name;// 用户名
	private String u_pwd;// 密码
	private int u_power;// 权限

	public void setU_power(int u_power) {
		this.u_power = u_power;
	}

	public int getU_power() {
		return u_power;
	}

	public int getU_id() {
		return u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public User(String u_name, String u_pwd) {
		super();
		this.u_name = u_name;
		this.u_pwd = u_pwd;
	}

	public User(int u_id, String u_name, String u_pwd, int u_power) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_power = u_power;
	}

}
