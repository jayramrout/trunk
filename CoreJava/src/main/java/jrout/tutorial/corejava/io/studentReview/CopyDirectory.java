package jrout.tutorial.corejava.io.studentReview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDirectory {
	public static String sourceFolder;
	public static String destinationFolder;

	public static void main(String arg[]) {
		if(arg.length != 2) {
			System.err.println("Run Program with the Source and Destination Folder as Arguments");
			System.exit(0);
		}
		sourceFolder = arg[0];
		destinationFolder = arg[1];
		try {
			
			unZipFolder(destinationFolder);
			copyDirectory(new File(sourceFolder), new File(destinationFolder));
			zipFolder(destinationFolder);
			deleteDirectory(destinationFolder);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void zipFolder(String directoryToZip) {
		try{
			Zip.zip(directoryToZip);	
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}

	public static void unZipFolder(String directoryToZip) {
		try{
			UnZip.unZip(directoryToZip);	
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void copyDirectory(File sourceLocation, File targetLocation)
			throws IOException {
		System.out.println("Copying folders from "+sourceFolder + " to "+destinationFolder+" ...");
		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]), new File(
						targetLocation, children[i]));
			}
		} else {

			InputStream in = new FileInputStream(sourceLocation);
			if (targetLocation.exists())
				return;
			OutputStream out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
		System.out.println("Copying done...");
	}
	
	/**
	 * 
	 * @param sourceLocation
	 * @throws IOException
	 */
	public static void deleteDirectory(String sourceLocation)
			throws IOException {
		File srcLocationDirectory = new File(sourceLocation);
		
		String[] children = srcLocationDirectory.list();
		if(children != null) {
			System.out.println("Deleting Folders started...");
			for (int i = 0; i < children.length; i++) {
				File file  = new File(srcLocationDirectory, children[i]);
				if(file.isDirectory()) {
					deleteDirectory(file);
				}
			}
			System.out.println("Deleting Folders Ends...");
		}
	}
	/**
	 * 
	 * @param path
	 * @return
	 */
	static public boolean deleteDirectory(File path) {
	    if (path.exists()) {
	        File[] files = path.listFiles();
	        for (int i = 0; i < files.length; i++) {
	            if (files[i].isDirectory()) {
	                deleteDirectory(files[i]);
	            } else {
	                files[i].delete();
	            }
	        }
	    }
	    return (path.delete());
	}
}
