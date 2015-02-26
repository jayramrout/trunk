package com.tutorial.spring.core_01.applicationContextContainer.PostProcessor;

import org.springframework.beans.factory.InitializingBean;


public class Init implements InitializingBean{

	int p1;
	
	public Init() {
		super();
		System.out.println("In  constructor");
	}

	public void setP1(int p1) {
		System.out.println("In setter method of INIT.java");
		this.p1 = p1;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("in after proeprties set "+p1);
	}
/*
	public void init(){
	
		System.out.println("in user defined call back method");
		
	}*/
	
}
