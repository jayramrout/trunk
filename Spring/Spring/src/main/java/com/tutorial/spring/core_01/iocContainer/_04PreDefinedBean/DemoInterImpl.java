package com.tutorial.spring.core_01.iocContainer._04PreDefinedBean;

import java.util.Date;

public class DemoInterImpl implements DemoInter {
	private String name;
	private Date dt = null;

	public DemoInterImpl() {
		System.out.println("DemoInterImpl zero argument constructor");
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMessage(String s) {
		System.out.println("setMessage() of DemoInterImpl class");
		name = s;
	}

	public void setDt(Date dt) {
		System.out.println("setDt() of DemoInterImpl class");
		this.dt = dt;
	}

	public void show() {
		System.out.println("Mesage is: " + name);
		System.out.println("Date is: " + dt);
	}
}