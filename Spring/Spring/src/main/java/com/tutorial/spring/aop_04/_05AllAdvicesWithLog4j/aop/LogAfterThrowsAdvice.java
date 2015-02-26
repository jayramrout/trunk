package com.tutorial.spring.aop_04._05AllAdvicesWithLog4j.aop;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowsAdvice implements ThrowsAdvice{

    public void afterThrowing(Method method, Object[] args, Object target, 
    Exception exception){        

     System.out.println("Exception is thrown on method "+method.getName());
     System.out.println("Exception raised is  " +exception.toString());
    }    
}
