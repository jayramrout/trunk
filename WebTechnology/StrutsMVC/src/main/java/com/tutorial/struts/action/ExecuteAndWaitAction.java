package com.tutorial.struts.action;

public class ExecuteAndWaitAction {
	public String execute() throws Exception {
		Thread.sleep(50000);
		return "success";
	}
}