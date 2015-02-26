package com.tutorial.spring.orm_03.SelectAll;

//client.java
import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;

public class client 
{
	public static void main(String[] args) 
	{
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("demo.xml"));
		eventdao ed =(eventdao)factory.getBean("id4");


		eventpojo  ep=new eventpojo();
		ep.setEventid(new Integer(4));
		ep.setEventname("ActionEvent");
		ed.saveObject(ep); 



		ed.selectAll();
		System.out.println("completed...");
	
	}

}
