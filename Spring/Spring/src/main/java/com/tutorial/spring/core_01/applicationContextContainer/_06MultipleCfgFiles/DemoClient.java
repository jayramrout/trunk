package com.tutorial.spring.core_01.applicationContextContainer._06MultipleCfgFiles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   DemoClient
{
        public static void main(String args[]) {
		String cfg[] = {
				"com/tutorial/spring/core_01/applicationContextContainer/_06MultipleCfgFiles/applicationContext1.xml",
				"com/tutorial/spring/core_01/applicationContextContainer/_06MultipleCfgFiles/applicationContext2.xml" };

        	ApplicationContext  ctx = new ClassPathXmlApplicationContext(cfg);
	
        	/*DemoBean d = (DemoBean) ctx.getBean("d1");
	
        	System.out.println(d);*/

			System.out.println(ctx.getBean("d1"));
        }
}




