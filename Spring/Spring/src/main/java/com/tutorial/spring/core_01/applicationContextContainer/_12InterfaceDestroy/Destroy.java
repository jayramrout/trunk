package com.tutorial.spring.core_01.applicationContextContainer._12InterfaceDestroy;
import org.springframework.beans.factory.DisposableBean;

public class Destroy implements DisposableBean{

	int p1;
	
	public Destroy() {
		super();
		System.out.println("In  constructor  of Destroy class");
	}

	public void setP1(int p1) {
		
		System.out.println("Insetter method");
		this.p1 = p1;
	}

	public void destroy() throws Exception {
		System.out.println("In  destructor of Destroy class");
		
	}

	
	
}
