package chapter11_API.sec03_java_lang.part04_Class;

public class my02_Car {

	String owner;
	String model;
	
	public my02_Car() {}
	public my02_Car(String owner, String model) {
		this.owner = owner;
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void run() {
		System.out.println("운행 시작");
	}
	
} //end class
