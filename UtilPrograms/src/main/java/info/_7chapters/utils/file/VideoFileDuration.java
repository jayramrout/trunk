package info._7chapters.utils.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.xuggle.xuggler.IContainer;

public class VideoFileDuration {
	public static void main(String[] args) throws IOException {
		VideoFileDuration vfd = new VideoFileDuration();
		vfd.printFileDetails();
	}


	private void printFileDetails() throws IOException {

		IContainer container = IContainer.make();
		List<FileDetails> list = new ArrayList<>();
		File directory = new File("/Users/jrout/Documents/Recordings");
		List<String> fileList = read(directory);

		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Eastern"));
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy",Locale.US);
	    
	    long totalMinutes = 0;
	    for(String file : fileList) {
			container.open(file, IContainer.Type.READ, null);
			long timeInMinutes = TimeUnit.MICROSECONDS.toMinutes(container.getDuration());//(duration / (60 * 1000))/1000;
			
			Path path = Paths.get(file);
			BasicFileAttributes view = Files.readAttributes(path, BasicFileAttributes.class);
		    calendar.setTimeInMillis(view.creationTime().toMillis());
//		    list.add(sdf.format(calendar.getTime()) + "\t"+timeInMinutes+"\t" + path.getFileName().toString());
			list.add(new FileDetails(sdf.format(calendar.getTime()),timeInMinutes,path.getFileName().toString()));
		    totalMinutes += timeInMinutes;
		}
		Collections.sort(list);

		for(FileDetails detail : list){
			System.out.println(detail.getDate() +"\t" + detail.getTimeInMinutes() +"\t" + detail.getFileName());
		}
		
		long hours = totalMinutes/60;
		long minutes = totalMinutes % 60;
		System.out.println("\tTotal Time in Hours:minutes======");
		System.out.printf("\t%d:%02d",hours,minutes);
	}


	private List<String> filePathList = new ArrayList<String>();

	public List<String> read(File file) {
		if (file.isFile()) {
			String fileName = file.getName();
			if((fileName.toLowerCase().endsWith(".mp4") || fileName.toLowerCase().endsWith(".wmv")))
				filePathList.add(file.getAbsolutePath());
		} else if (file.isDirectory()) {
			File[] listOfFiles = file.listFiles();

			if (listOfFiles != null) {
				for (int i = 0; i < listOfFiles.length; i++){
					read(listOfFiles[i]);
				}
			} else {
				System.out.println("[ACCESS DENIED]");
			}
		}
		return filePathList;
	}

	private class FileDetails implements Comparable {
		private String date;
		private long timeInMinutes;
		private String fileName;

		public FileDetails(String date, long timeInMinutes, String fileName) {
			this.date = date;
			this.timeInMinutes = timeInMinutes;
			this.fileName = fileName;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public long getTimeInMinutes() {
			return timeInMinutes;
		}

		public void setTimeInMinutes(long timeInMinutes) {
			this.timeInMinutes = timeInMinutes;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		@Override
		public int compareTo(Object o) {
			return this.getFileName().compareTo(((FileDetails)o).getFileName());
		}
	}
}