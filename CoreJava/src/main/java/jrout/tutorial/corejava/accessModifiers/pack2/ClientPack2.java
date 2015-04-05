package jrout.tutorial.corejava.accessModifiers.pack2;

import jrout.tutorial.corejava.accessModifiers.pack1.Calculation;

public class ClientPack2 {
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		
//		System.out.println(calc.firstValue);
		System.out.println(calc.type);
		calc.addMe(12, 5);
//		calc.subMe(30, 15);
		
//		System.out.println(calc.protectedString);
	}
}
