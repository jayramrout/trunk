package com.tutorial.spring.core_01.applicationContextContainer._03InterfaceInjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoBean implements Demo, BeanNameAware, ApplicationContextAware {

	String msg, bname;

	ApplicationContext ctx = null;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		
		System.out.println("Application Context  "+ctx.getClass());
		this.ctx = ctx;
	}

	@Override
	public void setBeanName(String bname) {
		System.out.println("Bean Name");
		this.bname = bname;
	}

	public String hi() {
		System.out.println("======================");
		System.out.println("DemoBean.hi()" + ctx.getClass());
		System.out.println("Logical Name of Bean is: " + bname);
		System.out.println("No. of beans managed by underlying container are: "
				+ ctx.getBeanDefinitionCount());
		System.out.println("Current bean is singleton: "
				+ ctx.isSingleton(bname));
		System.out.println("Current bean is proptotype bean: "
				+ ctx.isPrototype(bname));
		return msg;
	}

}
