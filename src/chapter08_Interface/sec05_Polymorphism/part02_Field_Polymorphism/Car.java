package chapter08_Interface.sec05_Polymorphism.part02_Field_Polymorphism;

public class Car {
	
	/**
	 *  구현객체가 인터페이스 타입으로 자동 변환
	 *  
	 *  [선언 방식]
	 *  인터페이스타입 변수 = new 구현객체();
	 */
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	/**
	 * Tire를 구현한 객체의 roll() 메소드 호출
	 * 		- 구현 객체에 따라 다양한 실행결과를 얻을 수 있다.(필드의 다형성)
	 */
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

} // end class