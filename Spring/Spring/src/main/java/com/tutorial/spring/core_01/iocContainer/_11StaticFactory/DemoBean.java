package com.tutorial.spring.core_01.iocContainer._11StaticFactory;

import java.util.Calendar;

public class DemoBean implements DemoInter {

	private Calendar cal = null;
	private TestBean tb = null;

	public DemoBean() {
		System.out.println("DemoBean.DemoBean()");
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	public String sayHello() {
		Calendar cal = Calendar.getInstance();
		return "   cl = " + cal.toString();
	}

}
