package jayramrout.tutorial.corejava.passingObjects;


public class ObjectParameterPassing {

	public static void main(String[] args) {
		
		Computer comp = new Computer("HP",24,"1024");
		
		/*PrintComputer printer = new PrintComputer();
		printer.printComputer(comp);
		printer.printAgain(comp);*/
		System.out.println(comp);
		System.out.println("Hello");
	}
}