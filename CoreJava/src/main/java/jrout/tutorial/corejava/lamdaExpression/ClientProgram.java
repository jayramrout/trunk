package jrout.tutorial.corejava.lamdaExpression;

public class ClientProgram {

	public static void main(String[] args) {
		
		/**
		 * 
		 */
		/*WorkerInterface itWorker = new ITWorker();
		itWorker.working();
		*/
		
		/**
		 * 
		 */
		/*WorkerInterface itWorker = new ITWorker()
		{
			@Override
			public void working() {
				System.out.println("I am a JAVA IT Worker");
				callMe();
			}
			public void callMe(){
				System.out.println("Please call me");
			}
		};
		itWorker.working();*/
		
		/**
		 * 
		 */
		WorkerInterface nonItWorker = () -> System.out.println("I am non IT Worker");
		//Lamda Expression
		nonItWorker.working();
		
		Calculate calc = (a,b) -> a/b;
		
		System.out.println(calc.calc(20, 10));
		calc(new Calculate(){
			@Override
			public int calc(int a, int b) {
				return a+b+10;
			}
			
		});
	}
	
	public static void calc(Calculate calc){
		System.out.println(calc.calc(10, 20));;
	}
}