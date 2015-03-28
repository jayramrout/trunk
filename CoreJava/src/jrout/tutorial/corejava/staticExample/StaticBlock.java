package jrout.tutorial.corejava.staticExample;

public class StaticBlock {
	
	/**
	 * Static Block
	 */
	static {
		System.out.println("I am the static block");
	}
	
	public StaticBlock() {
		System.out.println("I am the constructor");
	}
	
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
	}
}