package com.tutorial.spring.core_01.iocContainer._02SingletonDemo;

public class DemoInterImpl implements DemoInter {

	private String message;

	public DemoInterImpl() {
		System.out.println("Object created");
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setter method executed");
	}

	void hi() {
		System.out.println("Hi friends Gmg :)");
	}

	public String wish(String uname) {
		return message + " " + uname + " Have a great day :)";
	}
}