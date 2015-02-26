package com.tutorial.spring.core_01.iocContainer._03MoreMethods;


public class DemoClient2 {
	public static void main(String args[]) {
		DemoInterImpl demo = new DemoInterImpl();
//		demo.setMessage("Hello");//Injecting some value 
		System.out.println(demo.wish("Jayram"));
	}
}