package com.tutorial.spring.dao_02._04NamedParameter;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class   SelectClient {
        public static void main(String args[]) {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/dao_02/_04NamedParameter/applicationContext.xml");
			SelectImple s=(SelectImple)ctx.getBean("sel");
			System.out.println("Employees in between empid 100 to 130 count is: "+s.getEmpCount(100, 130));
        }
}