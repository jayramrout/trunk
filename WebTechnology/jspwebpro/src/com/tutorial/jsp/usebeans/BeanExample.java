package com.tutorial.jsp.usebeans;


public class BeanExample {
 public static void main(String ...arg){
	 	GetEmployeeDetails detail = new GetEmployeeDetails();
	 	detail.setId(100);
	 	detail.setName("Jayram");
	 	
	 	System.out.println("BeanExample.main()" + detail.getId());
	 	System.out.println("BeanExample.main()" + detail.getName());
 }
}