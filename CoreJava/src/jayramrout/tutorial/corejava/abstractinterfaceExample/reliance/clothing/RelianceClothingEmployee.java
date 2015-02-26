package jayramrout.tutorial.corejava.abstractinterfaceExample.reliance.clothing;

import jayramrout.tutorial.corejava.abstractinterfaceExample.interfaces.Singable;
import jayramrout.tutorial.corejava.abstractinterfaceExample.reliance.RelianceEmployee;

public class RelianceClothingEmployee extends RelianceEmployee {//implements Singable {

	public RelianceClothingEmployee(String name, int age, int ssn) {
		super(name, age, ssn);
	}

	@Override
	public void employmentType() {
		System.out.println(" I am Clothing Type");
	}

	@Override
	public void relianceShare() {
		
	}

	@Override
	public void jumpBehaviour() {
		System.out.println("I Know Jumping as a Clothing Guy");
		
	}

	@Override
	public void singGoodMusic() {
		
	}

	@Override
	public void callMe() {
		// TODO Auto-generated method stub
		
	}
}