package com.tutorial.struts.action;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport {
	private String userName;
	private String pass;
	private int age;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String execute(){
		return SUCCESS;
	}
}
