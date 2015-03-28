package jrout.tutorial.corejava.imports;

import java.lang.System;

import jrout.tutorial.corejava.methods.Calculation;

public class MathematicalCalculation {
	
	public static void main(String[] args) {
		String name;
		Calculation calc = new Calculation(0, 0);
		System.out.println(calc.addValue(3, 4));

		System.out.println(Calculation.subValue(4, 5));
	}
}