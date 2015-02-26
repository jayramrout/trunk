package jayramrout.tutorial.corejava.io;

import java.io.File;
import java.io.IOException;

public class Writer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { // warning: exceptions possible
			boolean newFile = false;
			File file = new File("H2kInfosys.txt");
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			System.out.println(newFile); // already there?
			System.out.println(file.exists()); // look again
			} catch(IOException e) { 
				e.printStackTrace();
			}
	}
}