package ManageLibary;

public class Magazine extends Document{
	private int releaseMonth;
	private int edition;
	public Magazine(String id, String producerName, int circulation, int releaseMonth,int edition) {
		super(id,  producerName, circulation);
		this.releaseMonth=releaseMonth;
		this.edition=edition;
	}
	public int getReleaseMonth() {
		return releaseMonth;
	}
	public void setReleaseMonth(int releaseMonth) {
		this.releaseMonth = releaseMonth;
	}
	public int getRealeaseDate() {
		return edition;
	}
	public void setRealeaseDate(int realeaseDate) {
		this.edition = realeaseDate;
	}
	
}
