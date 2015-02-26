package com.tutorial.spring.core_01.applicationContextContainer._10InterfaceInit;
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
		
		XmlBeanFactory factory = new XmlBeanFactory(res);*/

		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/applicationContextContainer/_10InterfaceInit/applicationContext.xml");
		Init i1 = (Init) ctx.getBean("in");
		
		System.out.print(i1);
	}

}
