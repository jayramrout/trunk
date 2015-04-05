package jrout.tutorial.corejava.abstractinterfaceExample.itemployee;

import jrout.tutorial.corejava.abstractinterfaceExample.interfaces.RockSinger;

public class JAVAITEmployee extends ITEmployee implements RockSinger {

	public JAVAITEmployee(String name, int age, int ssn) {
		super(name, age, ssn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void computerExperience() {
		// TODO Auto-generated method stub

	}

	@Override
	public void employmentType() {
		System.out.println("I am an IT-JAVA Employee");
	}

	@Override
	public void singGoodMusic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void singRock() {
		// TODO Auto-generated method stub
		
	}
	
}