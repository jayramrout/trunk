package jrout.tutorial.corejava.exception;

public class ArithematicExceptionTwo {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		String name = "Divide";

		int finalValue = divide(a, b, name) + add(a, b);

		System.out.println(finalValue);

		calculateTax(finalValue);

		System.out.println("Exiting my application");
	}

	public static int divide(int a, int b, String message) {
		int intArray[] = { 12, 13, 14 };

		int i = 0;
		
		try {
			i = a / b;
			int j = intArray[i];
			i = j + i;

			System.out.println(message.toString());

		} catch (ArrayIndexOutOfBoundsException aioobe) {

			try {
				i = 20;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ArithmeticException ae) {
			i = 20; // ArrayIndex
		} catch (Exception exp) {
			exp.printStackTrace();
			i = 10; // arithematic
		} finally {
			System.out.println("This is my finally Block");
		}
		return i;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static void calculateTax(int finalValue) {

	}
}
