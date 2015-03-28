package jrout.tutorial.corejava.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Java byte streams are used to perform input and output of 8-bit bytes. Though
 * there are many classes related to byte streams but the most frequently used
 * classes are , FileInputStream and FileOutputStream. Following is an example
 * which makes use of these two classes to copy an input file into an output
 * file:
 * 
 * @author Jayram
 *
 */
public class ByteStreamExample {

	public static void main(String args[]) throws Exception {

		/*
		 * File inputFile = new File(
		 * "C:/Users/Jayram/git/April-2014-Batch/CoreJava/src/com/h2kinfosys/java/io/Person.javaj"
		 * ); System.out.println(inputFile.exists());
		 */

		FileInputStream in = null;
		FileOutputStream out = null;
		BufferedInputStream binStream = null;
		try {
			File inputFile = new File(
					"C:\\Users\\Jayram\\git\\trunk\\CoreJava\\src\\jrout\\tutorial\\corejava\\io\\Person.java");
			
			in = new FileInputStream(inputFile);
			binStream = new BufferedInputStream(in);
			
			out = new FileOutputStream(
					"C:/Users/Jayram/git/trunk/CoreJava/src/jrout/tutorial/corejava/io/PersonTemp2.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			// do some logic here..and it breaks...
			
			System.out.println("Written Successfully!!!");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
