package com.tutorial.spring.core_01.applicationContextContainer._09EventHandling;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.GetPackageInfo;

public class   DemoClient {
        public static void main(String args[])throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(GetPackageInfo.getInfo(DemoClient.class)+"spring.cfg.xml");
        	
        	DemoInter d1=(DemoInter)ctx.getBean("demo");
        	//DemoInterImpl d2=(DemoInterImpl)ctx.getBean("demo");
        	System.out.println(d1.wish("friends"));        	        
        	Thread.sleep(5000);
			
        	ctx.close();
        }
}