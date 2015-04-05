package jrout.tutorial.corejava.string;

public class StringExample {

	public static void main(String[] args) {
		//int i = 10;//Premetive Data type
		// Integer i = new Integer(10); // Wrapper Data Type
		
		Integer i = 10;
		
		int j = new Integer(10); // AutoBoxing 1.4 = was not there , came in 1.5
		int k = new Integer(10);
		
		System.out.println(j==i);
		
		String place = "NJ";
		String place1 = new String("NJ");
		
		String name1 = new String("ONE");
		String name11 = name1;
		System.out.println(" (name1 == name11) "+(name1 == name11));
		
		String name2 = new String("ONE");
		
		System.out.println(" name1==name2 = "+(name1==name2));
		System.out.println(" name1.equals(name2) = "+name1.equals(name2));
		
		
		if(name1 == name2) {
			System.out.println("Both are same");
		}else {
			System.out.println("Different");
		}

//		String place = "New York";
		
		//System.out.println(name.length());
		
		/*name1 += " TWO";
		System.out.println(name1);
		
		name1 = name1 + " Three";
		
		System.out.println(name1);*/
	}
}