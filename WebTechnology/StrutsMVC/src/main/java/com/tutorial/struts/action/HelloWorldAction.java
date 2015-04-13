package com.tutorial.struts.action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Either you can extend ActionSupport or simply have HelloWorldAction as a simple class
 * @author Jayram
 *
 */
public class HelloWorldAction extends ActionSupport {
//public class HelloWorldAction {
	private String name;
	
	public String execute() throws Exception {
		return SUCCESS; // Either user hardcoding value as success or use SUCCESS from Action Interface
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}