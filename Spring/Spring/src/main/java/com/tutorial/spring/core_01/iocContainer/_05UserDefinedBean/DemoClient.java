package com.tutorial.spring.core_01.iocContainer._05UserDefinedBean;

import org.springframework.core.io.Resource;

import org.springframework.core.io.ClassPathResource;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class   DemoClient
{
        public static void main(String args[])
        {
			Resource  res=new ClassPathResource("com/tutorial/core_01/iocContainer/_05UserDefinedBean/spring.cfg.xml");
			BeanFactory  factory=new XmlBeanFactory(res);
			DemoInter d1=(DemoInter)factory.getBean("demo");
			d1.show();
        }
}