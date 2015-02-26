package com.tutorial.spring.core_01.applicationContextContainer._00singleton;

//Designing our own singleton java class

public class SingletonClass {

	private static SingletonClass t = null;
	static {
		t = new SingletonClass();
	}

	// private constructor
	// so no one can create object from outside the class
	private SingletonClass() {
		System.out.println("Private constructor of Test class invoked");
	}

	// static factory method
	public static synchronized SingletonClass getInstance() {
		// singleton logic
		if (t == null){
			t = new SingletonClass();
		}
		return t;
	}

	protected Object clone() // throws CloneNotSupportedException {
	{
		return t;
		// return new CloneNotSupportedException ("Its singleton class");
	}
}