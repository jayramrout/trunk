package com.tutorial.spring.aop_04._04BeforeAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice1 implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target)throws Throwable {
		System.out.println("before advice");
	}
}