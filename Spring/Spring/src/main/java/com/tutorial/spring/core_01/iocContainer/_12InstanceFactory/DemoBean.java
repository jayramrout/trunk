package com.tutorial.spring.core_01.iocContainer._12InstanceFactory;

public class DemoBean implements DemoInter {

	
	
	private TestBean tb = null;

	public DemoBean() {
		System.out.println("zero parametrized constructor of DemoBean class");
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public String sayHello() {

		return "tb = " + tb.toString();
	}

	// instance factory method
	public TestBean getTestBean(String msg) {
		System.out.println("instance factory method of DemoBean class");
		return new TestBean(msg);
	}
}