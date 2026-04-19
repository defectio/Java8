package chapter16_Stream.sec08_matching.part02;

public class Item {

	public static final int DRAFT = 0;
	public static final int REJECT = 1000;
	public static final int WORKING = 2000;
	public static final int COMPLETE = 3000;
	
	private int id;
	private String title;
	private int status;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, String title, int status) {
		this.id = id;
		this.title = title;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
