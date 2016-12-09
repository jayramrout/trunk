package com.tutorial.spring.core_01.coreContainer._08ConstructorInjection;
public class  Demo {	
	private String  message;
	private int age;
	
	public Demo() {
		System.out.println("Zero arg constructor");
	}

	public Demo(String message)	{
		this.message = message;
		System.out.println("One arg constructor with String ");
	}
	
	public Demo(String message, int age)	{
		this.message = message;
		this.age = age;
		System.out.println("Two arg constructor with String and Integer");
	}

	public Demo(int age ,String message)	{
		this.message = message;
		this.age = age;
		System.out.println("Two arg constructor with integer and String ");
	}

	public String toString() {
		return message + " "+age;
	}
}