package jrout.tutorial.corejava.io.studentReview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip { 

	private static List<String> fileList;
	private static String sourceFolder = "";
	
	/**
	 * 
	 * @param rootFolderPath
	 */
	public static void zip(String rootFolderPath) {
		Zip appZip = new Zip();
		File rootFolder = new File(rootFolderPath);
		String[] children = rootFolder.list();
		if(children != null) {
			System.out.println("Zipping Started...");
			for (int i = 0; i < children.length; i++) {
				fileList = new ArrayList<String>();
				File sourceFolderFile = new File(rootFolder, children[i]);
				sourceFolder = sourceFolderFile.getAbsolutePath();
				if (sourceFolderFile.isDirectory()) {
					appZip.generateFileList(sourceFolderFile);
					appZip.zipIt(sourceFolderFile + ".zip");
				}
			}
			System.out.println("Zipping Ends...");
		}
	}
	/**
	 * 
	 * @param zipFile
	 */
	private static void zipIt(String zipFile) {
		byte[] buffer = new byte[1024];
		String source = "";
		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		try {
			try {
				source = sourceFolder.substring(
						sourceFolder.lastIndexOf("\\") + 1,
						sourceFolder.length());
			} catch (Exception e) {
				source = sourceFolder;
			}
			fos = new FileOutputStream(zipFile);
			zos = new ZipOutputStream(fos);

			FileInputStream in = null;

			for (String file : fileList) {
				ZipEntry ze = new ZipEntry(source + File.separator + file);
				zos.putNextEntry(ze);
				try {
					in = new FileInputStream(sourceFolder + File.separator
							+ file);
					int len;
					while ((len = in.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
				} finally {
					if (in != null)
						in.close();
				}
			}

			zos.closeEntry();
			System.out.println(zipFile+" successfully compressed");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				zos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @param node
	 */
	private static void generateFileList(File node) {
		if (node.isFile()) {
			fileList.add(generateZipEntry(node.toString()));
		}
		if (node.isDirectory()) {
			String[] subNote = node.list();
			for (String filename : subNote) {
				generateFileList(new File(node, filename));
			}
		}
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	private static String generateZipEntry(String file) {
		return file.substring(sourceFolder.length() + 1, file.length());
	}
}