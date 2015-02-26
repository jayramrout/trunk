package com.tutorial.spring.aop_04._05AllAdvicesWithLog4j.aop;

import org.aopalliance.intercept.*;

public class LogAroundAdvice implements MethodInterceptor{

    public Object invoke(MethodInvocation i1) throws Throwable {

        Object arguments[] = i1.getArguments();

        int number1 = ((Integer)arguments[0]).intValue();
        int number2 = ((Integer)arguments[1]).intValue();
	
        if (number1 == 0 && number2 == 0){
            throw new Exception("Dont know how to add 0 and 0 !!!");	     
        }

        return i1.proceed();
    }
}
