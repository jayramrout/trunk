package com.tutorial.spring.core_01.iocContainer._12InstanceFactory;

public class TestBean {

	String msg;

	public TestBean() {
		super();
	}

	TestBean(String msg) {
		this.msg = msg;
		System.out.println("Constructor of TestBean class invoked");
	}

	public String toString() // to dispaly results
	{
		return msg;
	}

}
