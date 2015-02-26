package com.tutorial.spring.core_01.iocContainer._11StaticFactory;

public class TestBean {

	String msg;

	public TestBean() {
		super();
	}

	private TestBean(String msg) {
		this.msg = msg;
		System.out.println("Private Constructor invoked");
	}

	// static factory method
	public static TestBean getTestBean(String msg) {
		System.out.println("static factory method invoked");
		return new TestBean(msg);
	}

	public String toString() {
		return msg;
	}
}
