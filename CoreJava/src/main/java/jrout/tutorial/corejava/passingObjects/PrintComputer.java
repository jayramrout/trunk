package jrout.tutorial.corejava.passingObjects;

public class PrintComputer {

	void printComputer(Computer computer) {
		commmonMethod(computer);
		computer.size = 100;
		System.out.println("I am the real Printer\n");
	}
	
	
	void printAgain(Computer computer) {
		commmonMethod(computer);
		System.out.println("I am here again");
	}
	
	
	void commmonMethod(Computer computer) {
		System.out.println("Value of this is : " + computer.screenResoltion);
		System.out.println("Value of this is : " + computer.size);
		System.out.println("Value of this is : " + computer.type);
	}
}
