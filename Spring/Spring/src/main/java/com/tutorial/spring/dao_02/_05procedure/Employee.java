package com.tutorial.spring.dao_02._05procedure;

class Employee implements java.io.Serializable {

	private Integer no;
	private String name;
	private String designation;
	private Double salary;	

	public void setNo(Integer no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public String toString() {
			return this.no + "\t" 
				+ this.name + "\t" 
				+ this.designation + "\t" 
				+ this.salary;
		}
	}
