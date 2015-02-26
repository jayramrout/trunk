package com.tutorial.spring.core_01.applicationContextContainer._08SpringI18n;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.GetPackageInfo;

public class I18nApp {
	public static void main(String args[]) throws Exception {
		System.out.println(GetPackageInfo.getInfo(I18nApp.class));
//		Locale locale = new Locale("fr","be");
		Locale locale = new Locale("en","uk");
//		Locale locale = new Locale("en","ca");
//		Locale locale = new Locale("en");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/core_01/applicationContextContainer/_08SpringI18n/applicationContext.xml");

		String msg = ctx.getMessage("str1", new String[] { "hi", "Jayram" },
				"default msg", locale);
		msg += " " + ctx.getMessage("str2", null, "default msg", locale);
		msg += " " + ctx.getMessage("str3", null, "default msg", locale);
		msg += " " + ctx.getMessage("str4", null, "default msg", locale);

		System.out.println("Message is: " + msg);
	}
}
