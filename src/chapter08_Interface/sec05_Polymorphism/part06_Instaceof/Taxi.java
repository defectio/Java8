package chapter08_Interface.sec05_Polymorphism.part06_Instaceof;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

} // end class