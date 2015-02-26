package jayramrout.tutorial.corejava.staticExample;

public class Calculate {
	
	final static float pie = 3.14f;

	static int countCall = 0;
	int nonStatic = 0;
	public Calculate() {
		// TODO Auto-generated constructor stub
	}
	
	public static void add(int i , int j){
		System.out.println(i+j);
		countCall++;
	}
	
	public void multi() {
		nonStatic = 10;
	}
	
	public static void sub(int i , int j) {
		System.out.println(countCall +" "+ (i+j));
	}
	
	public static void main(String[] args) {
		/**
		 * Accessing Static methods
		 */
		Calculate.add(23, 2);
		Calculate.add(3, 2);
		Calculate.add(3, 2);
		
		System.out.println("Total Count is " + Calculate.countCall);
		
	}
}