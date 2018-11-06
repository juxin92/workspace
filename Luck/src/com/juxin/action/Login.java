package com.juxin.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public String execute() {
		return "success";
		// if ("admin".equals(this.username) && "123456".equals(this.password))
		// return "success";
		// else
		// return "fail";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}