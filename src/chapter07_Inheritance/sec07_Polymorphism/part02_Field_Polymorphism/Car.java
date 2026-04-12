package chapter07_Inheritance.sec07_Polymorphism.part02_Field_Polymorphism;

public class Car {
	/**
	 * [자동 타입 변환이 필요한 이유?]
	 *  - 다형성이란 동일한 타입을 사용하지만 다양한 결과가 나오는 성질을 말한다.
	 *  - 필드의 값을 다양화함으로써 실행 결과가 다르게 나오도록 구현하는데, 필드의 타입은 변함이 없지만,
	 *      실행 도중에 어떤 객체를 필드로 저장하느냐에 따라 실행 결과가 달라질 수 있다. -> 필드의 다형성
	 */
	// 즉, 부모클래스인 Tire로 필드를 선언하면, Tire를 상속받은 HankookTire, KumhoTire가 부모 타입에 대입될 수 있다.
	// "필드의 타입 변화 없이 다양한 결과 도출"
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		/**
		 * tire가 교체된 이후에는(=자식클래스가 부모 타입에 대입되면, =자동타입변환되면)
		 *  (1) 부모의 필드, 메소드에만 접근 가능
		 *  (2) 오버라이딩된 자식 메소드 호출 가능
		 *  
		 *  즉, roll() 메소드는 자식클래스(HanKookTire, KumhoTire)에서 재정의 되어 있으므로 
		 *  자동타입변환 이후에는 자식 클래스의 roll() 메소드 호출됨.
		 */
		
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}