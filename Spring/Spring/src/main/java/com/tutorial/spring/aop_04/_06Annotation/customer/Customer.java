package com.tutorial.spring.aop_04._06Annotation.customer;

public interface Customer {

	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);
}