package com.tutorial.struts.service;

import com.tutorial.struts.exception.LoginException;

public class LoginService {
	public boolean isValidUser
	(String userName,String password )
			throws LoginException{
		if(userName==null
				&& password==null)
			throw new LoginException
			("UserName and Password  are required fields");
		else if("".equals(userName)
				&& "".equals(password))
			throw new LoginException
			("UserName and Password are required fields");

		else
			return true;
	}
}
