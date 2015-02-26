package com.tutorial.spring.aop_04._03Parameters;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;

public class AroundAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation i1) throws Throwable {
		System.out.println("good mng. everybody..");

		int x = ((Integer)i1.getArguments()[0]).intValue();   
		String y=(String)i1.getArguments()[1];
		
		if( x >= 0  )
			i1.getArguments()[0] = new Integer(101);
		if(  y.length() <= 3)
			i1.getArguments()[1]="sathya tech"; 
		
		i1.proceed();      
		
		System.out.println("Goodbye! ");      
		return null;
	}
}
