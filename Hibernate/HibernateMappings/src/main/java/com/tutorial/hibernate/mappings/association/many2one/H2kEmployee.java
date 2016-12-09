package com.tutorial.hibernate.mappings.association.many2one;

public class H2kEmployee{
	private int id; 
	private String firstName; 
	private String lastName; 
	private int salary; 
	private HomeAddress address;
	
	public H2kEmployee() {}
	
	public H2kEmployee(String firstName, String lastName, int salary,
			HomeAddress address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public HomeAddress getAddress() {
		return address;
	}

	public void setAddress(HomeAddress address) {
		this.address = address;
	}
}