package com.tutorial.spring.core_01.iocContainer._04PreDefinedBean;


import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class   DemoClient {
	public static void main(String args[])throws Exception {
		Resource  res=new ClassPathResource("com/tutorial/spring/core_01/iocContainer/_04PreDefinedBean/cfg/spring.cfg.xml");
		BeanFactory  factory=new XmlBeanFactory(res);
		DemoInter d1=(DemoInter)factory.getBean("demo");
		
//		DemoInterImpl d12=(DemoInterImpl)factory.getBean("demo");
//		d12.setDt(new Date());
//	
		d1.show();
		/*Thread.sleep(1000);
		
		Date d = (Date)factory.getBean("datte");
		Thread.sleep(1000);
		System.out.println(d);*/
	}
}