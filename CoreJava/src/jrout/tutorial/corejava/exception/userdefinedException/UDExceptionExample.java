package jrout.tutorial.corejava.exception.userdefinedException;

public class UDExceptionExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		String name = "Divide";
		System.out.println("Exiting my application");
		
		try {
			doDivision(12, 0);
			doCalculation(2, 3);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
		
		/*try {
			doDivision(12, 0);
//			int i = 3;
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
		
		try {
			doCalculation(2, 3);
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			callMe();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			doDivision(12, 0);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void callMe() throws Exception{
		callMeAgain();
	}
	
	private static void callMeAgain() throws Exception{
		
	}
	

	public static int doDivision(int a , int b) throws MyOwnException {
		int i = 0 ;
		
		if(b==0){
			throw new MyOwnException("Please enter valid Value");
		}
		i = a/b;
		
		doCalc();
		/*int i = 0;
		try{
			i = a/b;
		}catch(Exception exp){
//			throw exp;
  			throw new MyOwnException("Please enter valid Value");
		}*/
		
		doCalc();
		
		/*try {
			doCalc();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		doCalculation(a, b);
		
		return i;
		
	}
	
	public static void doCalc() throws MyOwnException {
		// till 2020
		// Code to calculate tax
		// code to calculate score
	}
	
	public static int doCalculation(int a , int b) throws MyOwnException {
		return a/b;
	}
}
