package com.tutorial.spring.core_01.iocContainer._01FirstApp;


public class DemoClient2 {
	public static void main(String args[]) {
		DemoInterImpl demo = new DemoInterImpl();
		demo.setMessage("HI");
		System.out.println(demo.wish(" Jayram "));
	}
}