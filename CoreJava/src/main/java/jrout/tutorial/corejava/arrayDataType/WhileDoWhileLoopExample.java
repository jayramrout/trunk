package jrout.tutorial.corejava.arrayDataType;
public class WhileDoWhileLoopExample {

	public static void main(String[] args) {
		
		int j = 0;
		System.out.println("WhileDoWhileLoopExample.main()");
		
		while (j<10) {
			System.out.print("-" + j);
			j++;
		}
		
		System.out.println("\n*************************    Hello World !!");
		System.out.println("\n*************************   Hello World 3");
		int k = 0;
		do {
			System.out.print("-"+ k);
			k++;
		} while (k < 10);
	}
}