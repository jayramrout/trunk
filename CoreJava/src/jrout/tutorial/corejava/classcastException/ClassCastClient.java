package jrout.tutorial.corejava.classcastException;

public class ClassCastClient {

	public static void main(String[] args) {
		Computer comp = new Computer("Non Living");
		Computer dellcomp = new Computer("Dell computer");
//		comp.company();
		
		Fish fish = new Fish("Living");
//		fish.smimming();
		
		invokeAPI(comp);
		invokeAPI(dellcomp);
		invokeAPI(fish);
		
//		((Fish)objectClass1).smimming();
	}

	public static void invokeAPI(ObjectClass obj){
		if(obj instanceof Computer) {
			((Computer)obj).company();
		}else if(obj instanceof Fish) {
			((Fish)obj).smimming();
		}
	}
	
	/*public static void invokeAPI(Computer comp , Fish fish, Computer dell){
		comp.company();
		fish.smimming();
		dell.company();
	}*/
}