package chapter12_Thread.sec04_Synchronized.part02_synchronized;

public class User2 extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
		calculator.setSize(20);
	}
}
