package com.tutorial.spring.core_01.applicationContextContainer._09EventHandling;
import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


public class Helper implements ApplicationListener {

	long startTime, endTime;

	public void onApplicationEvent(ApplicationEvent ae) {
		System.out.println("control in onApplicationEvent method");
		System.out.println(ae.toString());

		int index = ae.toString().indexOf("ContextRefreshedEvent");
		System.out.println("Index is: "+index);
		if(index != -1) {
			startTime = System.currentTimeMillis();
			System.out.println("Container started at "+new Date().toString());					
		}
		else if(ae.toString().indexOf("ContextClosedEvent") != -1) {
			endTime = System.currentTimeMillis();
			System.out.println("Container is Closed at "+new Date().toString());
			System.out.println("Containeris in  activated mode for "+(endTime - startTime)+" milli seconds");
		}
	}
}