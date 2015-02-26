package jayramrout.tutorial.corejava.abstractinterfaceExample.client;

import jayramrout.tutorial.corejava.abstractinterfaceExample.Employee;
import jayramrout.tutorial.corejava.abstractinterfaceExample.interfaces.Jumpable;
import jayramrout.tutorial.corejava.abstractinterfaceExample.reliance.RelianceEmployee;
import jayramrout.tutorial.corejava.abstractinterfaceExample.reliance.clothing.RelianceClothingEmployee;
import jayramrout.tutorial.corejava.abstractinterfaceExample.reliance.oil.RelianceOilEmployee;

public class CompanyToHireExperiencedGuys {
	public static void main(String[] args) {
		
		CompanyToHireExperiencedGuys company = new CompanyToHireExperiencedGuys();
		
//		Person per = new Person("Jayram", 30, 12345);
//		abc.printPersonBehaviour();
		
//		XYZEmployee xyz = new XYZEmployee("JayramXYZ", 35, 1111);
//		xyz.printPersonBehaviour();
		
//		RelianceEmployee relE = new RelianceEmployee("", 12, 1212);
		Employee rce = new RelianceClothingEmployee("Dishu", 15, 12345);
		//rce.employmentType();
		//rce.printName();
		
		Employee oilEmp = new RelianceOilEmployee("Jay", 30, 12345);
		
		//rce.employmentType();
		//oilEmp.employeeBehaviour();
		
		Jumpable jump =  new RelianceClothingEmployee("Dishu", 15, 12345);
		//jump.jumpBehaviour();
		
		RelianceClothingEmployee emp = ((RelianceClothingEmployee)jump);
				//emp.employeeBehaviour("dfdf");
//		System.out.println(Jumpable.index);
		
//		showJumpBehaviour(oilEmp);
	}
	
	public static void showJumpBehaviour(Jumpable relianceEmp){
		if(relianceEmp != null)
			relianceEmp.jumpBehaviour();
	}
}