package com.tutorial.spring.core_01.applicationContextContainer._16Wiring._3AutowireConstructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class   DemoClient {
        public static void main(String args[]) {
        	ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/applicationContextContainer/_16Wiring/_3AutowireConstructor/applicationContext.xml");
        	DemoBean d = (DemoBean) ctx.getBean("db");
        	System.out.println(d.hi());
    }
}