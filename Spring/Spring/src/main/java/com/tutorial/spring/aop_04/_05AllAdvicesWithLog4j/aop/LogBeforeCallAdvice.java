package com.tutorial.spring.aop_04._05AllAdvicesWithLog4j.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeCallAdvice implements MethodBeforeAdvice {
	Class c1 = LogBeforeCallAdvice.class;

	public LogBeforeCallAdvice()
	{
//		System.out.println("LogBeforeCallAdvice.LogBeforeCallAdvice()");
	}

	public void before(Method method, Object[] args, Object target)throws Throwable {
		System.out.println("LogBeforeCallAdvice.before()");
	}
}
