package jrout.tutorial.corejava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java Byte streams are used to perform input and output of 8-bit bytes, where
 * as Java Character streams are used to perform input and output for 16-bit
 * unicode.
 * 
 * @author Jayram
 *
 */
public class CharaterStreamExample {

	public static void main(String args[]) throws IOException {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(
					"C:\\Users\\Jayram\\git\\trunk\\CoreJava\\src\\jrout\\tutorial\\corejava\\io\\Person.java");
			bufferedReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter(
					"C:/Users/Jayram/git/trunk/CoreJava/src/jrout/tutorial/corejava/io/PersonTemp.txt");

			int c;
			while ((c = bufferedReader.read()) != -1) {
				/*
				 * If you want to print the output in the console then use (char)c) i.e. casting the int back to char 
				 */
//				System.out.print(((char)c));
				fileWriter.write(c);
			}
			System.out.println("Written Succesfully");
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
			if (fileWriter != null) {
				fileWriter.close();
			}
		}
	}

}
