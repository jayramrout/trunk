package com.tutorial.spring.core_01.iocContainer._01FirstApp;

public class DemoInterImpl implements DemoInter {
	private String message;

	public DemoInterImpl() {
		System.out.println("Constructor executed");
	}

	public void setMessage(String message) { 
		System.out.println("setter method executed");
		this.message = message;
	}
	
	/* (non-Javadoc)
	 * @see com.tutorial.spring.core_01.iocContainer._01FirstApp.DemoInter#wish(java.lang.String)
	 */
	@Override
	public String wish(String uname) {
		return message + " " + uname + " Have a great day";
	}
}