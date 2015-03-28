package jrout.tutorial.corejava.exception.userdefinedException;

public class UDExceptionTwo {

	public static void main(String[] args) {
		UDExceptionExample udee = new UDExceptionExample();
		
		try {
			udee.doCalculation(2, 3);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
		
		
		try {
			udee.doCalculation(1, 3);
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
