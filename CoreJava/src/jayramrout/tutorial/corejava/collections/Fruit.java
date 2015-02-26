package jayramrout.tutorial.corejava.collections;

public class Fruit {
	private String name;
	private String size;
	
	public Fruit(String name, String size) {
		this.size = size;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
