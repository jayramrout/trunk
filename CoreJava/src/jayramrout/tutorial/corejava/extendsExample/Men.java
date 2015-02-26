package jayramrout.tutorial.corejava.extendsExample;

public class Men extends Human {
	
	public void run(){
		System.out.println("I am running Fast");
	}
	
	public static void main(String[] args) {
		Men men = new Men();
		men.run();

//		System.out.println(men.country + " " + men.height +" " + men.name);
	}
}
