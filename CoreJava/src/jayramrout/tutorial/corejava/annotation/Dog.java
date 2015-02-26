package jayramrout.tutorial.corejava.annotation;

public class Dog extends Animal {
	
	@Override
	public void printMyBehaviour() {
		System.out.println("I am a Dog");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printMyBehaviour();
	}
}