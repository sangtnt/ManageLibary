package ManageLibary;

public class Newspaper extends Document{
	private int releaseDate;
	public Newspaper(String id, String producerName, int circulation, int realeaseDate) {
		super(id,  producerName, circulation);
		this.releaseDate=realeaseDate;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
