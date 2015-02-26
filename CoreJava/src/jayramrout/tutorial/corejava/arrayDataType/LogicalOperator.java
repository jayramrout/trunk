package jayramrout.tutorial.corejava.arrayDataType;
public class LogicalOperator {

	public static void main(String[] args) {
		int i = 20;
		int j = 30;

		/*if((i == 30 && j == 40) || i != j) {
			System.out.println("TRUE");
		}else {
			System.out.println("False");
		}*/
		
		int k = (i == 30 && j == 40) ? 10 : 20;
		
/*		if(i == 20){
			k =10;
		}else{
			k = 20;
		}
*/		
		System.out.println(k);
	}
}
