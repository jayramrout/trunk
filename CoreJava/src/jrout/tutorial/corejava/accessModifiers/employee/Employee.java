package jrout.tutorial.corejava.accessModifiers.employee;

import jrout.tutorial.corejava.accessModifiers.person.Person;

public class Employee extends Person{
	public Employee(String name, int age , int ssn) {
		super(name, age , ssn);
		this.id = 10;
	}
	
	public void printBehaviour(){
		System.out.println(id);
	}
}