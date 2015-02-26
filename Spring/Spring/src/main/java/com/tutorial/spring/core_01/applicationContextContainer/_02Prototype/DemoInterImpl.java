package com.tutorial.spring.core_01.applicationContextContainer._02Prototype;

public class  DemoInterImpl  implements DemoInter {	
	private String  message;

	public DemoInterImpl() {
		System.out.println("Object created..............");
	}
	public void setMessage(String s) {
		message=s;
		System.out.println("setter method executed");
	}

	public String wish(String uname) {
		return   message+" "+uname+" Have a great day";
	}
}