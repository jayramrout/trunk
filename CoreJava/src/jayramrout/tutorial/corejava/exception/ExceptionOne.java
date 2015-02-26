package jayramrout.tutorial.corejava.exception;

public class ExceptionOne {

	public static void main(String[] args) {
		System.out.println("--------1");
		int i[] = {12,13,14};
		System.out.println("--------2");
		
		int anyValueFromArray = 0;
		
		try{
			anyValueFromArray = i[5];
		}catch(Exception exp){
			anyValueFromArray = 5;
			exp.printStackTrace();
		}

		System.out.println("--------3");
		
		int finalValue = anyValueFromArray + 10;
		System.out.println("--------4");
		System.out.println(finalValue);
	}
}