package chapter08_Interface.sec05_Polymorphism.part04_Method_Polymorphism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

} // end class