package ManageLibary;

public class Book extends Document{
	private String authorName;
	private int numberOfPages;
	public Book(String id, String producerName, int circulation, String authorName,int numberOfPages) {
		super(id,  producerName, circulation);
		this.authorName=authorName;
		this.numberOfPages=numberOfPages;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
}
