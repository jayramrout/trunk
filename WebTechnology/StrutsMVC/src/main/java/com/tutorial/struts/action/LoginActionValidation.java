package com.tutorial.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jayram
 *
 */
public class LoginActionValidation extends ActionSupport {
	private String userName;
	private String password;
	private String confirmPassword;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public void validate() {
		if (userName == null || userName.trim().equals("")) {
			addFieldError("userName", "The UserName is required");
			System.out.println("user1");
		}
		if (password == null || password.trim().equals("")) {
			addFieldError("password", "The password is required");
			System.out.println("pass1");
		}

		if (password !=null && password.length() < 8) {
			addFieldError("password",
					"The password should greater than 8 characters");
			System.out.println("user2");
			
		}
		if (password !=null && !password.equals(confirmPassword)) {
			addActionError("password and confirmPassword should match");
			System.out.println("user and pass");
		}
		addActionMessage(getText("success.msg")); // success.msg is from LoginActionValidation.properties file
	}

	public String execute() {
		System.out.println("success");
		return SUCCESS;

	}

}