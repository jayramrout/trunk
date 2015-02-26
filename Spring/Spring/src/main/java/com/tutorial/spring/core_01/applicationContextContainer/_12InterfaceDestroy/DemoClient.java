package com.tutorial.spring.core_01.applicationContextContainer._12InterfaceDestroy;
/*import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
*/

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassPathResource res = new ClassPathResource("applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(res);
		*/

		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/applicationContextContainer/_12InterfaceDestroy/applicationContext.xml");
		Destroy d = (Destroy) ctx.getBean("de");
		
		System.out.print(d);		
		//d=null;
		ctx.close();
		System.out.print("After closing container");		
	}

}
