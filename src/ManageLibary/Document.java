package ManageLibary;

public class Document {
	protected String id;
	protected String producerName;
	protected int circulation;
	protected Document(String id, String producerName, int numberOfCopies){
		this.id=id;
		this.producerName=producerName;
		this.circulation=numberOfCopies;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public int getCirculation() {
		return circulation;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.circulation = numberOfCopies;
	}
}
