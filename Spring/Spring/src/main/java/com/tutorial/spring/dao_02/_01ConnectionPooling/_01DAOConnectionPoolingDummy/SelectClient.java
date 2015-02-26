package com.tutorial.spring.dao_02._01ConnectionPooling._01DAOConnectionPoolingDummy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class   SelectClient {
        public static void main(String args[]) {
//			FileSystemResource  res =new FileSystemResource("com/tutorial/dao_02/_01ConnectionPooling/_01DAOConnectionPoolingDummy/spring.cfg.xml");
//			XmlBeanFactory  factory=new XmlBeanFactory(res);
//			
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/dao_02/_01ConnectionPooling/_01DAOConnectionPoolingDummy/spring.cfg.xml");
			SelectImple s=(SelectImple)ctx.getBean("sel");
			System.out.println("Employee name is: "+s.fetchEmpName(100));
			System.out.println("Employee salary is: "+s.fetchEmpSalary(110));
        }
}