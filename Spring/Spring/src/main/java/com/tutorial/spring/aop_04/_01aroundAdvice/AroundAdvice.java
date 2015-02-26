package com.tutorial.spring.aop_04._01aroundAdvice;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author Jayram
 *
 */
public class AroundAdvice implements MethodInterceptor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept
	 * .MethodInvocation)
	 */
	public Object invoke(MethodInvocation i1) throws Throwable {
		System.out.println("Hi.....");
		i1.proceed(); // calls business logic method
		System.out.println("Goodbye! ");
		return null;
	}
}
