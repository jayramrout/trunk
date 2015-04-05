package com.tutorial.spring.aop_04._06Annotation.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LoggingAspect {
	private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class);

	@Before("execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {
		LOGGER.info("logBefore() is running!");
		LOGGER.info("hijacked : " + joinPoint.getSignature().getName());
		LOGGER.info("****** ");
	}

	@After("execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {
		LOGGER.info("logAfter() is running!");
		LOGGER.info("hijacked : " + joinPoint.getSignature().getName());
		LOGGER.info("******");
	}

	@AfterReturning( pointcut = "execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomerReturnValue(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		LOGGER.info("logAfterReturning() is running!");
		LOGGER.info("hijacked : " + joinPoint.getSignature().getName());
		LOGGER.info("Method returned value is : " + result);
		LOGGER.info("******");
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomerThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		LOGGER.info("logAfterThrowing() is running!");
		LOGGER.info("hijacked : " + joinPoint.getSignature().getName());
		LOGGER.info("Exception : " + error);
		LOGGER.info("******");
	}
	
	@Around("execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		LOGGER.info("logAround() is running!");
		LOGGER.info("hijacked method : " + joinPoint.getSignature().getName());
		LOGGER.info("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));

		LOGGER.info("Around before is running!");
		joinPoint.proceed();
		LOGGER.info("Around after is running!");

		LOGGER.info("******");
	}

}