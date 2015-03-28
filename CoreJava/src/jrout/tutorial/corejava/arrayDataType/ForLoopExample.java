package jrout.tutorial.corejava.arrayDataType;
public class ForLoopExample {

	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5,6,7,8,9};
		
		for(int index=0;index < intArray.length;index++){
			System.out.print(" "+ intArray[index]);
		}
		System.out.println("*******************************");
		/**
		 * Below is the enhanced For Loop
		 */
		for(int aInt : intArray){
			System.out.println("  " + aInt);
		}
		
		byte b1 = 127;
		
		byte byteArray[] = {12,13,14,15};

		for(int b : byteArray) {
			System.out.println(b);
		}
		
		// How will you loop infinite time
		int infiniteIndex = 0;
		for(;;){
			System.out.println("Infinite" + infiniteIndex++);
		}
	}
}
