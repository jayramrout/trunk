package com.tutorial.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class AutoCompleterAction extends ActionSupport{

	private List<String> webframeworks = new ArrayList<String>();

	private String yourFavWebFramework;
	private String yourLuckyNumber;

	public AutoCompleterAction(){
		webframeworks.add("Spring MVC");
		webframeworks.add("Struts 1.x");
		webframeworks.add("Struts 2.x");
		webframeworks.add("JavaServer Faces (JSF)");
		webframeworks.add("Google Web Toolkit (GWT)");
		webframeworks.add("Apache Wicket");
		webframeworks.add("Apache Click");
		webframeworks.add("Apache Cocoon");
		webframeworks.add("JBoss Seam");
		webframeworks.add("Stripes");
		webframeworks.add("Apache Tapestry");
		webframeworks.add("Others");
	}

	public String getYourLuckyNumber() {
		return yourLuckyNumber;
	}

	public void setYourLuckyNumber(String yourLuckyNumber) {
		this.yourLuckyNumber = yourLuckyNumber;
	}

	public String getYourFavWebFramework() {
		return yourFavWebFramework;
	}

	public void setYourFavWebFramework(String yourFavWebFramework) {
		this.yourFavWebFramework = yourFavWebFramework;
	}

	public List<String> getWebframeworks() {
		return webframeworks;
	}

	public void setWebframeworks(List<String> webframeworks) {
		this.webframeworks = webframeworks;
	}

	public String display() {
		return NONE;
	}

}