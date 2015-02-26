package jayramrout.tutorial.corejava.classes;

public class Employee {
	int age;
	int salary;
	String name;
	String occupation;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.name="Rohan";
		emp1.age=20;
		emp1.salary = 2000;
		
		Employee emp2 = new Employee();
		emp2.name="Rajesh";
		emp2.age = 30;
		emp2.salary = 300;

		System.out.println("Emp 1 " + emp1.age + " " + emp1.salary + " " + emp1.name +" " + emp1.occupation);
		System.out.println("Emp 1 " + emp1.age + " " + emp1.salary + " " + emp1.name +" " + emp1.occupation);
	}
}