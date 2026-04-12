package chapter08_Interface.sec05_Polymorphism.part05_Casting;

public class VehicleExample {
	public static void main(String[] args) {

		/**
		 * [자동 타입 변환] 
		 *  구현 객체가 인터페이스 타입으로 자동타입변환되면, 인터페이스에 선언된 메소드만 사용 가능하다는 제약사항이 따른다
		 *   -> 예를들어, 인터페이스에는 3개의 메소드가 선언되어 있고, 구현객체에는 5개(오버라이딩메소드3개+2개)의 메소드가 선언되어 있다면
		 *       인터페이스로 호출가능한 메소드는 3개 뿐이다.
		 */
		Vehicle vehicle = new Bus();

		/**
		 *  인터페이스 타입으로 자동타입변환
		 *   -> 인터페이스에 선언된 메소드만 사용 가능하다.
		 */
		vehicle.run();
		
		// 구현 객체만의 메소드 호출 불가능
//		vehicle.checkFare();

		/**
		 * 인터페이스 타입 변수를 구현 클래스 타입 변수에 담는다.(강제타입변환, casting)
		 * 
		 * 구현클래스	변수 = (구현클래스) 인터페이스참조변수;
		 */
		Bus bus = (Bus) vehicle;  

		/**
		 * 구현객체타입으로 casting 해야 구현객체의 모든 메소드 호출 가능
		 */
		bus.run();
		bus.checkFare();
		
	} //end main
	
} //end class