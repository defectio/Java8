package chapter08_Interface.sec05_Polymorphism.part03_Field_Array;

public class Car {
	
	/**
	 *  구현객체가 인터페이스 타입으로 자동 변환
	 *  
	 *  [선언 방식]
	 *  인터페이스타입 변수 = new 구현객체();
	 */
	//인터페이스 배열로 구현객체 관리
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	/**
	 * HankookTire의 roll() 메소드 호출
	 */
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
	
} //end class