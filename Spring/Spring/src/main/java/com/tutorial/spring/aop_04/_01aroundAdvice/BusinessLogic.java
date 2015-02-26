package com.tutorial.spring.aop_04._01aroundAdvice;

public class BusinessLogic implements IBusinessLogic
{
	public void deposit() {
		System.out.println("");
		System.out.println("execution of deposit");
		System.out.println("");
	}
	public void withdraw() {
		System.out.println("");
		System.out.println("execution of withdraw");
		System.out.println("");
	}
}