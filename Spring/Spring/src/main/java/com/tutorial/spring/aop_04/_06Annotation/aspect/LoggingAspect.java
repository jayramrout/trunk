package com.tutorial.spring.aop_04._06Annotation.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
	private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class);

	//execution(* set*(..))  :the execution of any method with a name beginning with "set":
	//execution(public * *(..)) :the execution of any public method
	// execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.*(..)) : the execution of any method defined by the Customer interface
	//execution(* com.xyz.service.*.*(..)) :the execution of any method defined in the service package
	//execution(* com.xyz.service..*.*(..)) :execution of any method defined in the service package or a sub-package
	//within(com.xyz.service.*) :any join point (method execution only in Spring AOP) within the service package
	//within(com.xyz.service..*) :ny join point (method execution only in Spring AOP) within the service package or a sub-package
	//this(com.xyz.service.AccountService) :any join point (method execution only in Spring AOP) where the proxy implements the AccountService interface
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