package com.tutorial.spring.core_01.applicationContextContainer._09EventHandling;

public class DemoInterImpl implements DemoInter {
	private String message;

	public DemoInterImpl() {
		System.out.println("Constructor executed");
	}

	public void setMessag(String s) {
		message = s;
	}

	public String wish(String uname) {
		return message + " " + uname + " Have a great day";
	}
}