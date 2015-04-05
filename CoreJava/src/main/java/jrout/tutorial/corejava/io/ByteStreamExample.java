package jrout.tutorial.corejava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
	private static String inputFile = "C:\\Users\\Jayram\\git\\trunk\\CoreJava\\src\\jrout\\tutorial\\corejava\\io\\Person.java";
	private static String outputFile = "C:\\Users\\Jayram\\git\\trunk\\CoreJava\\src\\jrout\\tutorial\\corejava\\io\\Person.java";
	
	public static void main(String args[]) throws IOException {
		byteStreamDirect();
		byteStreamUsingBuffer();
	}

	private static void byteStreamDirect() throws IOException {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(
					inputFile);
			fileOutputStream = new FileOutputStream(
					outputFile);
			int c;
			while ((c = fileInputStream.read()) != -1) {
				/*
				 * If you want to print the output in the console then use (char)c) i.e. casting the int back to char 
				 */
//				System.out.print(((char)c));
				fileOutputStream.write(c);
			}
			System.out.println("Written Succesfully...");
		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}
		}
	}
	
	/**
	 * Using BufferedInputStream
	 * @throws IOException
	 */
	private static void byteStreamUsingBuffer() throws IOException {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		int c;
		try {
			fileInputStream = new FileInputStream(inputFile);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			
			fileOutputStream = new FileOutputStream(outputFile);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			
			while ((c = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write(c);
			}
			System.out.println("Written Succesfully");
		} finally {
			if(bufferedInputStream != null ) {
				bufferedInputStream.close();
			}
			if(bufferedOutputStream != null ) {
				bufferedOutputStream.close();
			}
			
			if (fileInputStream != null) {
				fileInputStream.close();
			}
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}
		}
	}
}