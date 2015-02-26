package com.tutorial.spring.core_01.applicationContextContainer._15DiffConstructors;

public class Bean {
	int sno;
	String sname;
	public Bean() {}

	public Bean(String sname) {	
		this.sname = sname;
	}

	public Bean(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return sno+" "+sname;
	}
}