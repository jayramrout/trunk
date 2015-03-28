package jrout.tutorial.corejava.arrayDataType;
public class JumpStatement {

	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6};
		
		for(int j : i) {
			if(j == 3) continue;
			System.out.println("Printing "+ j);
//			if(j == 3) break;
		}
		for(;;){
			System.out.println("JumpStatement.main()");
		}

		/*int k = 2;
		while(true) {
			System.out.println(k++);
		}*/
		
		
	}

}
