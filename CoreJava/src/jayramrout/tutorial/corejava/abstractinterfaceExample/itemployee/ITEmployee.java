package jayramrout.tutorial.corejava.abstractinterfaceExample.itemployee;

import jayramrout.tutorial.corejava.abstractinterfaceExample.Employee;

public abstract class ITEmployee extends Employee {
	
	public ITEmployee(String name, int age, int ssn) {
		super(name, age, ssn);
	}
	
	@Override
	public void employeeBehaviour() {
		System.out.println("I am from ABC Employee AND i work on JAVA");
	}

	@Override
	public void employmentType() {
		System.out.println("I am an IT Employee");
	}
	
	public abstract void computerExperience();
}