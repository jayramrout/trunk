package com.tutorial.jsp.usebeans;


public class GetEmployeeDetails {
	private int id;
	private String name;
	
	public int getId() {
		System.out.println("GetEmployeeDetails.getId()");
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("GetEmployeeDetails.setId()");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSalary(){
		return EmployeeDAO.getSalary(id,name);
	}

}
