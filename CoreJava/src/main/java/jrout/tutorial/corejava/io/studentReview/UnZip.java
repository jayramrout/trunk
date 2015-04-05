package jrout.tutorial.corejava.io.studentReview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {
	
	public static void unZip(String outputFolder) {
		UnZip unZip = new UnZip();
		File rootFolder = new File(outputFolder);
		String[] children = rootFolder.list();
		if(children != null) {
			System.out.println("Unzipping Starts...");
			for (int i = 0; i < children.length; i++) {
				File sourceFolderFile = new File(rootFolder, children[i]);
				if(sourceFolderFile.getName().endsWith(".zip"))
					unZip.unZipIt(sourceFolderFile.getAbsolutePath(), outputFolder);
			}
			System.out.println("Unzipping Ends...");
		}
		
	}

	/**
	 * Unzip it
	 * 
	 * @param zipFile
	 *            input zip file
	 * @param output
	 *            zip file output folder
	 */
	public void unZipIt(String zipFile, String outputFolder) {

		byte[] buffer = new byte[1024];

		try {

			// create output directory is not exists
			File folder = new File(outputFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipFile));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();

			while (ze != null) {

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator
						+ fileName);

				//System.out.println("file unzip : " + newFile.getAbsoluteFile());

				// create all non exists folders
				// else you will hit FileNotFoundException for compressed folder
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();

			System.out.println("UnZipping Done :"+zipFile);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}