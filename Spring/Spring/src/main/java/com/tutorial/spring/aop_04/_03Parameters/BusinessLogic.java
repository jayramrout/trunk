package com.tutorial.spring.aop_04._03Parameters;

public class BusinessLogic implements IBusinessLogic {
     public void method1(int id,String name) {
		System.out.println("");
       	System.out.println("execution of method1");
		System.out.println(" id :"+id);
		System.out.println("name :"+name);
		System.out.println("");
     }
}