package jrout.tutorial.corejava.abstractinterfaceExample;

public abstract class Employee {
	private String name;
	private int ssn;
	private int age;
	
	public Employee(String name, int age , int ssn){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	
	/**
	 * Default Implementation
	 */
	public void printPersonBehaviour() {
		System.out.println("Name "+ name +" SSN "+ ssn + " age "+ age );
	}
	
	public void printName(){
		System.out.println("Name is "+ name);
	}
	/**
	 * Just your Skeleton of the method
	 */
	public abstract void employeeBehaviour();
	
	public abstract void employmentType();
}