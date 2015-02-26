package com.tutorial.spring.core_01.iocContainer._05UserDefinedBean;

public class TestBean {
	private String message;

	public void setMessage(String msg) {
		this.message = msg;
	}

	public String toString() {
		return message;
	}
}