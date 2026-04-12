package chapter12_Thread.sec04_Synchronized.part02_synchronized;

public class User1 extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
		calculator.setSize(10);
	}
}
