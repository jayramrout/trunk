package com.tutorial.spring.core_01.iocContainer._05UserDefinedBean;

import java.util.Date;

public class DemoInterImpl implements DemoInter {
	private int age;
	private Date dt = null; // pre defined class
	private TestBean tb = null; // user defined class

	public DemoInterImpl() {
		System.out.println("DemoInterImpl zero argument constructor");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public void show() {
		System.out.println("Age is: " + age);
		System.out.println("Date is: " + dt);
		System.out.println("Message is: " + tb);
	}
}