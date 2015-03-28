package jrout.tutorial.corejava.accessModifiers.pack1;

public class ClientPack1 {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		
		Calculation calc2 = new Calculation(12,34);
		
//		System.out.println(calc.firstValue); // private fields cannot be accessed
		System.out.println(calc.type);
		calc.addMe(12, 5);
		calc.subMe(30, 15);
		
		System.out.println(calc.protectedString);
	}
}