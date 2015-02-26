package com.tutorial.spring.core_01.applicationContextContainer._14InnerBeans;
public class Second {
	First f;

	public void setF(First f) {
		this.f = f;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return f.toString();
	}
	
	

}
