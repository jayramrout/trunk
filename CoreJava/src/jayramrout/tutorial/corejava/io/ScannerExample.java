package jayramrout.tutorial.corejava.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ScannerExample {

	public static void main(String[] args) throws IOException {
		readFileUsingScanner();
		jFileChooser();
	}
	
	public static void readFileUsingScanner() throws IOException {
		File file = new File("C:/Users/Jayram/git/roottutorial/CoreJava/src/com/h2kinfosys/java/io/CopyFileCharaterStreamTwo.java");
		Scanner scan = new Scanner(file);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	}
	
	public static void jFileChooser() throws IOException {
		JFileChooser chooser = new JFileChooser();
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();	
		}
		
	}
}