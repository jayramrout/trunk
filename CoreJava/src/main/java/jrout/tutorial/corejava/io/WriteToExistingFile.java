package jrout.tutorial.corejava.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Jayram
 *
 */
public class WriteToExistingFile {
	public static void main(String[] args) {
		appendTextToFile();
		appendTextToFileWithoutFinally();
	}

	private static void appendTextToFile() {
		PrintWriter out = null;
		try {
			/**
			 * The second parameter to the FileWriter constructor will tell it
			 * to append to the file (as opposed to clearing the file)
			 */
			out = new PrintWriter(new BufferedWriter(new FileWriter(
					"ExistingFile.txt", true)));
			out.println("the text");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	/**
	 * try-with-resource statement : jdk 1.7 
	 * No finally block is required for closing the
	 * declared resource(s) because it is handled automatically,
	 */
	private static void appendTextToFileWithoutFinally() {

		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter("ExistingFile.txt", true)))) {
			out.println("the text");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}