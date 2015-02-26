/**
 * 
 */
package com.tutorial.spring.aop_04;

/**
 * @author Jayram
 *
 */
public class TaxCalculator {

	//print()
	public void calcSalary(){
		//print()
		System.out.println("Business functionalySalary is IMPORTANT");
		//print()
	}
	
	public void print(){
		System.out.println("Hello ur salary is 1 ");
		System.out.println("Hello ur salary is 2 ");
		System.out.println("Hello ur salary is 3");
	}
	public int calcBusinessIncome(){
		System.out.println("Hello ur Business is");
		System.out.println("Hello ur Business is");
		System.out.println("Hello ur Business is");
		return 100;
	}
	
	public void calcTax(){
		//int salary = calcSalary();
		int businessInc = calcBusinessIncome();
		//System.out.println((salary+businessInc));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator();
		calc.calcTax();
	}

}
