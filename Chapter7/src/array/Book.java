package array;

public class Book {
	
	private String bookName;		//멤버변수 
	private String author;		//멤버변수 
	
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName = bookName;	//constructor
		this.author = author;		//constructor
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
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

}
