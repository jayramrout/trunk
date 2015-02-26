package com.tutorial.spring.core_01.iocContainer._09ConstructorInjection;

public class Bean {

	private int a;
	private float b;
	private String c;

	public Bean() {
	}

	public Bean(int a, float b, String c) {
		// super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String toString() {
		return a + " -- " + b + " -- " + c;
	}

}
