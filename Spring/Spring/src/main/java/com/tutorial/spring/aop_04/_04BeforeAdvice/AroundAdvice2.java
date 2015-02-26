package com.tutorial.spring.aop_04._04BeforeAdvice;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;
public class AroundAdvice2 implements MethodInterceptor {
   public Object invoke(MethodInvocation i1) throws Throwable {
      System.out.println(" AroundAdvice : good mng. everybody..");	
      i1.proceed();     
      System.out.println("AroundAdvice : Goodbye! ");     
	  return null;      
   }
}