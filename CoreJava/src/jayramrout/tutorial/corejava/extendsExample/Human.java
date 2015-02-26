package jayramrout.tutorial.corejava.extendsExample;

public class Human {
	String name;
	int height;
	String country;
	
	public void run(){
		System.out.println("I am running");
	}
	/**
	 * 
	 */
	public Human() {
		name = "Human";
		height = 10;
		country = "India";
	}
	/**
	 * One Argument constructor
	 * @param country
	 */
	public Human(String country) {
		this.country = country;
	}
	/**
	 * 
	 * @param name
	 * @param height
	 * @param country
	 */
	public Human(String name, int height , String country) {
		this.name = name ;
		this.height = height;
		this.country = country;
	}
	
	public void printHumanDetails(){
		System.out.println("name = "+ name +" Country = "+country+"Height ="+height);
	}
	
	/*@Override
	public boolean equals(Object paramObject) {
		Human humanObject = (Human) paramObject;
		if (this.country == humanObject.country
				&& this.height == humanObject.height
				&& this.name == humanObject.name) {
			return true;
		}else 
			return false;
		return this.country == humanObject.country
				&& this.height == humanObject.height
				&& this.name == humanObject.name;
	}*/

	public boolean equals(Object object) {
		Human humanObject = (Human) object;
		/*if (this.country == humanObject.country
				&& this.height == humanObject.height
				&& this.name == humanObject.name) {
			return true;
		}else 
			return false;*/
		return this.country == humanObject.country
				&& this.height == humanObject.height
				&& this.name == humanObject.name;
	}
}
