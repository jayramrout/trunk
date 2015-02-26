package com.tutorial.spring.core_01.applicationContextContainer._05MultiplePropertiesFiles;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   DemoClient {
        public static void main(String args[]) {
        	ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/applicationContextContainer/_05MultiplePropertiesFiles/applicationContext.xml");
        	DemoBean d = (DemoBean) ctx.getBean("db");
        	System.out.println(d.hi());
        }
}

/**
 * Note: If same property is available in both the properties files then first
 * property file value will be replaced by last property file value.
 */