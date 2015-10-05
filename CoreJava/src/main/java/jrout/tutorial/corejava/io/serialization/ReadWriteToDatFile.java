package jrout.tutorial.corejava.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteToDatFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
//		writeObject();
		
		readObject();
	}
	/**
	 * 
	 * @throws Exception
	 */
	public static void writeObject() throws Exception {
		Person per = new Person("Jayram","SOFTWARE","New York", 12345);

		FileOutputStream fileOutputStream = new FileOutputStream("jayramrout.dat");
		ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
		
		output.writeObject(per);
		output.close();
		
		System.out.println("Object has been written successfully...");
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	public static void readObject() throws Exception {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("jayramrout.dat"));
		
		Person perObj = (Person)input.readObject();
		System.out.println(perObj.getName());
		System.out.println(perObj.getPlace());
		System.out.println(perObj.getProfession());
		System.out.println(perObj.getSsn());
		System.out.println(perObj.getGender());
	}
	
	public Object getName() {
		return "";
	}
}