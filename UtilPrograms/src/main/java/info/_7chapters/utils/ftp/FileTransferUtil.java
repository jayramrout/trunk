package info._7chapters.utils.ftp;


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 * @author jrout
 * This Program Does File Transfer.
 */
public class FileTransferUtil {
	static String localFileName = "";
	static String remoteFileName = "";
	static FTPClient ftpClient = null;
	static OutputStream downloadStream = null;
	static InputStream uploadStream = null;

	public static void main(String[] credentials) throws IOException {
		uploadFileUsingFTP(credentials);
//		downloadFileUsingFTP(credentials);
	}
	
	/**
	 * 
	 * @param credentials
	 */
	public static void openConnections(String[] credentials){

		if(credentials.length < 2) {
			System.out.println("Please give ur dac userID and pwd Usage : FileTransferUtil <dacid> <dacpwd>");
			System.exit(0);
		}
		String server = "";
		int port = 21;
		String dacUserName = credentials[0];
		String dacPassword = credentials[1];
		if(ftpClient == null) {
			ftpClient = new FTPClient();
			try {
				System.out.println("Getting FTP Connection...");
				ftpClient.connect(server, port);
				ftpClient.login(dacUserName, dacPassword);
				ftpClient.enterLocalPassiveMode();
				System.out.println("Connection Successfull...");
				ftpClient.setFileType(FTP.ASCII_FILE_TYPE);
			} catch (IOException ex) {
				ex.printStackTrace();
			}	
		}
	}
	
	/**
	 * 
	 * @param credentials
	 */
	public static void uploadFileUsingFTP(String[] credentials) {
		openConnections(credentials);
		try {
			boolean success = false;
			
			uploadStream = new FileInputStream(localFileName);
			success = ftpClient.storeFile(remoteFileName, uploadStream);

			if (success) {
				System.out.println("Uploaded successfully...");
			} else {
				System.out.println("Uploading Failed...");
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			closeConnections();
		}
	}
	
	/**
	 * 
	 * @param credentials
	 */
	public static void downloadFileUsingFTP(String[] credentials) {
		openConnections(credentials);
		try {
			boolean success = false;
			downloadStream = new BufferedOutputStream(
					new FileOutputStream(localFileName));
			success = ftpClient.retrieveFile(remoteFileName, downloadStream);

			if (success) {
				 System.out.println("Downloaded successfully...");
			} else {
				System.out.println("Downloaded Failed...");
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			closeConnections();
		}
	}
	
	/**
	 * 
	 */
	public static void closeConnections(){
		try {
			if (ftpClient != null && ftpClient.isConnected()) {
				ftpClient.logout();
				ftpClient.disconnect();
			}
			if(downloadStream != null ){
				downloadStream.close();
			}
			if(uploadStream != null ){
				uploadStream.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Connection Closed...");
	}
}