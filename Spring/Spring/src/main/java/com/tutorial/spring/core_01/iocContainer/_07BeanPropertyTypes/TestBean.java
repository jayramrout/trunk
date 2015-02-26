package com.tutorial.spring.core_01.iocContainer._07BeanPropertyTypes;

import java.util.Date;


public class TestBean {
	String msg;
	Date dt;
	
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString()
	{
		return msg;
	}
}
