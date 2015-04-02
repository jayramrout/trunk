import java.io.Serializable;

public class Books implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2865562939754804042L;
	private String bookName;
	private String author;
	private int yearPublished;
	
	public Books(String bookName, String author, int yearPublished) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.yearPublished = yearPublished;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "[bookName=" + bookName + ", author=" + author
				+ ", yearPublished=" + yearPublished + "]";
	}
	
	
	
	
}
