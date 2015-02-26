package com.tutorial.spring.aop_04._02BasedonReturnValue;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation i1) throws Throwable {
		System.out.println("good mng everybody..");	
		int n = ((Integer)i1.proceed()).intValue();
		System.out.println("Goodbye! ");
		if(n  <=100)
			return  new Integer(0);
		else 
			return  new Integer(n);
		
		//return  new Integer(2000);         
	}
}