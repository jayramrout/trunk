package com.tutorial.spring.core_01.applicationContextContainer._16Wiring._2AutowireByType;

public class DemoBean implements Demo {
	TestBean tb = null;

	// TestBean tb1 = null;
	public DemoBean() {
		System.out.println("Zero arg constructor of DemoBean class");
	}

	public DemoBean(TestBean tb) {
		System.out.println("One arg constructor of DemoBean class");
		this.tb = tb;
	}

	public void setTb(TestBean tb) {
		System.out.println("setTb() of DemoBean class");
		this.tb = tb;
	}

	/*
	 * public void setTb1(TestBean tb1) {
	 * System.out.println("setTb1() of DemoBean class"); this.tb1 = tb1; }
	 */

	public String hi() {
		return "Hi..." + tb.toString();
	}

}
