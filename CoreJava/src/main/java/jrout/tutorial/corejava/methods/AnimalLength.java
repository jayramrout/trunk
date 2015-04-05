package jrout.tutorial.corejava.methods;

public enum AnimalLength {
	
	SMALL(1),MEDIUM(2),LARGE(3);
	int size =0;
	
	private AnimalLength(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}
