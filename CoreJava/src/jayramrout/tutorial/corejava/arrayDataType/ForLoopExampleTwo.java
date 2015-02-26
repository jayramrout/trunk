package jayramrout.tutorial.corejava.arrayDataType;
public class ForLoopExampleTwo {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int hello;
		int Hello;
		
		outerLoop: for (int index = 0; index < intArray.length; index++) {
			int currentValue = intArray[index];
			/*
			 * if (currentValue == 6){ continue outerLoop; }
			 */

			firstInnerLoop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j == currentValue) {
						continue outerLoop;
					}
					System.out.println(" Verymost inner Loop " + j);
				}
				System.out.println(" FirstInner Loop " + i);
			}

			System.out.println(" outer Loop " + currentValue);
		}
		System.out.println("Final Statement");
	}
}