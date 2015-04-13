package com.tutorial.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	public String welcome() {
		return "welcome";
	}
}