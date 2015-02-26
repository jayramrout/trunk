package com.tutorial.spring.core_01.applicationContextContainer._13XmlDestroy;

public class Destroy
{
	int p1;
	
	public Destroy() {
		super();
		System.out.println("In  constructor  of Destroy class");
	}

	public void setP1(int p1) {
		
		System.out.println("In setter method");
		this.p1 = p1;
	}

	public void destroy() {
		System.out.println("In  destructor of Destroy class");
		
	}
}
