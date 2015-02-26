package jayramrout.tutorial.corejava.accessModifiers.company;

import jayramrout.tutorial.corejava.accessModifiers.employee.Employee;
import jayramrout.tutorial.corejava.accessModifiers.person.Person;

public class Company {

	public static void main(String[] args) {
		
		Person jayram = new Employee("Jayram", 30, 123456);
		
		jayram.printMe();
		
		
		checkSSN(jayram);
		
		jayram.printMe();
		
		jayram.setAge(jayram.getAge()+1);
		
		jayram.printMe();
	}
	public static void checkSSN(Person per){
		if(per.getSsn() > 10000) {
			System.out.println("IS a valid SSN");
//			per.setSsn(7890);
//			per.ssn = 7890;
		}
	}
}
