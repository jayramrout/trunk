package jrout.tutorial.corejava.arrayDataType;

public class ArrayExample {
	public static void main(String[] args) {
		int i = 10;
		
		int oneD[] = new int[5];
		oneD[0] = 30;
		oneD[1] = 40;
		oneD[2] = 50;
		oneD[3] = 60;
		oneD[4] = 70;
		
		int twoD[][] = {{30,35},{20,10} , {50,67}};
		
		System.out.println("Two Dimenstion "+twoD[0][1]);
		
//		int twoD[][] = new int[5][4];
		twoD[0][0] = 0;
		
		int iArray[] = {30,40,50,60,70};
		
		System.out.println("Tutorial" + iArray[0]);
		/*		System.out.println("ArrayExample   " + iArray[1] + "     "+iArray.length);
*/		
/*		for(int k = 0 ; k < iArray.length ; k++) {
			System.out.println("" + iArray[k]);	
		}
*/		
		for(int k : oneD) {
			System.out.println("" + k);
		}
	
		}
}
