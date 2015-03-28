package jrout.tutorial.corejava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteToDatFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fileOutputStream = new FileOutputStream("jayramrout.dat");
		ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);

		Person per = new Person("Jayram","SOFTWARE","New York", 12345);
		System.out.println(per.getPlace());
		
		output.writeObject(per);
		output.close();

		System.out.println("Before " + per);

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("jayramrout.dat"));
		Person perRead = (Person)input.readObject();
		System.out.println(" After "+perRead.getName()+ " "+ perRead.getPlace()+" "+ perRead.getProfession()+""
				+ "  "+ perRead.getSsn());
		
	}
}