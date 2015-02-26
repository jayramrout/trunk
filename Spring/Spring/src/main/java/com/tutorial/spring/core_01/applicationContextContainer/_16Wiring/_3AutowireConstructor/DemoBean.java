package com.tutorial.spring.core_01.applicationContextContainer._16Wiring._3AutowireConstructor;

public class DemoBean implements Demo {
	TestBean tb = null;

	public DemoBean() {
		System.out.println("Zero arg constructor of DemoBean class");
	}

	/*public DemoBean(TestBean tb) {
		System.out.println("One arg constructor of DemoBean class");
		this.tb = tb;
	}*/

	public void setTb(TestBean tb) {
		System.out.println("setTb() of DemoBean class");
		this.tb = tb;
	}

	public String hi() {
		return "Hi..." + tb.toString();
	}

}
