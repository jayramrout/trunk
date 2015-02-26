package com.tutorial.spring.core_01.applicationContextContainer.PostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor
			implements BeanPostProcessor
{
public Object postProcessBeforeInitialization(Object obj,String str)
{
	System.out.println("before initializing "+str);
//	System.out.println(obj.toString());
	return obj;
}

public Object postProcessAfterInitialization(Object obj,String str)
{
	System.out.println("after initializing "+str);
//	System.out.println(obj.toString());
	return obj;
}

}
