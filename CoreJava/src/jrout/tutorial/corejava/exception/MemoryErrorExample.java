package jrout.tutorial.corejava.exception;

import java.util.ArrayList;
import java.util.List;

public class MemoryErrorExample {

	public static void main(String[] args) {
//		int i[] = new int[10];
		
		List list = new ArrayList();
		
		try {
			System.out.println("I m here 0...");
			if(true){
				for(;;){
				list.add(new String("Memory"));	
				}	
			}
		} catch (Exception e) {
			System.out.println("in Exception block");
			e.printStackTrace();
		}finally{
			System.out.println("I am in Finally Block");
		}
		
		System.out.println("I m here 1...");
		System.out.println(list);
	}

}
