package com.tutorial.spring.core_01.applicationContextContainer._04PropertiesFile;
public class DemoBean {
	
	String name, email, address;
	
	int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String hi()
	{
		return name+" "+age+" "+email+" "+address;
	}
}