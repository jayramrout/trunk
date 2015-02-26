package com.tutorial.spring.core_01.applicationContextContainer._01FirstApplicationContext;

public class DemoInterImpl implements DemoInter {
	private String message;

	public DemoInterImpl() {
		System.out.println("Constructor executed");
	}

	public void setMessage(String s) {
		message = s;
		System.out.println("setter executed");
	}

	public String wish(String uname) {
		return message + " " + uname + " Have a great day";
	}
}