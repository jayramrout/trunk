package com.tutorial.spring.core_01.applicationContextContainer.PostProcessor;
public class Init11{

	int p1;
	
	public Init11() {
		super();
		System.out.println("In  constructor");
	}

	public void setP1(int p1) {
		
		System.out.println("In setter method");
		this.p1 = p1;
	}

	public void init(){
	
		System.out.println("in user defined call back method");
		
	}
	
}
