package com.tutorial.spring.aop_04._02BasedonReturnValue;

public class BusinessLogic implements IBusinessLogic {
	public int method1() {
		System.out.println("");
		System.out.println("execution of method1");
		System.out.println("");
		return 10;
	}
}