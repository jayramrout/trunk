package com.tutorial.spring.aop_04._06Annotation.customer;


public class CustomerImpl implements Customer {

	public void addCustomer(){
		System.out.println("addCustomer() is running $$$$$$$$$$$$$$$$$$$\n");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running $$$$$$$$$$$$$$$$$$$\n");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running $$$$$$$$$$$$$$$$$$$\n");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name+" $$$$$$$$$$$$$$$$$$$\n");
	}
}