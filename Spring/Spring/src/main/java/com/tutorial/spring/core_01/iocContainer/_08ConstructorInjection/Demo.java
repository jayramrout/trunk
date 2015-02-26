package com.tutorial.spring.core_01.iocContainer._08ConstructorInjection;
public class  Demo {	
	private String  message;
	private int age;
	
	public Demo() {
		System.out.println("Zero arg constructor");
	}

	public Demo(String message)	{
		this.message = message;
		System.out.println("One arg constructor");
	}
	
	public Demo(String message, int age)	{
		this.message = message;
		this.age = age;
		System.out.println("One arg constructor");
	}

	public Demo(int age ,String message)	{
		this.message = message;
		this.age = age;
		System.out.println("One arg constructor");
	}

	public String toString() {
		return message + " "+age;
	}
}