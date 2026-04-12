package chapter07_Inheritance.sec07_Polymorphism.part04_Method_Polymorphism;

public class Bus extends Vehicle {
	
	/**
	 * Vehicle의 run() 메소드 재정의
	 */
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
} //end class
