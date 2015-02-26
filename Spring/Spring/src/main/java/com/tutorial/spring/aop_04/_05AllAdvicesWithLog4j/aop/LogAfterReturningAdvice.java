package com.tutorial.spring.aop_04._05AllAdvicesWithLog4j.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{    


	public LogAfterReturningAdvice() {
//		System.out.println("LogAfterReturningAdvice.LogAfterReturningAdvice()");
	}


	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("LogAfterReturningAdvice.afterReturning()");
	}
}
