package chapter07_Inheritance.sec04_Override.part02_Super_Method;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();		
		
		// 자식객체에 정의된 takeOff() 메소드 없음 ->  부모의 takeOff() 메소드 호출
		sa.takeOff();  
		
		/**
		 * default flyMode
		 * 오버라이딩된 자식의 fly() 메소드 호출(flyMode==NORMAL)
		 */
		sa.fly();			
		
		/**
		 * flyMode 변경
		 * 오버라이딩된 자식의 fly() 메소드 호출(flyMode==SUPERSONIC)
		 */
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		/**
		 * flyMode 변경
		 * 오버라이딩된 자식의 fly() 메소드 호출(flyMode==NORMAL)
		 */
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		// 자식객체에 정의된 land() 메소드 없음 ->  부모의 land() 메소드 호출
		sa.land();		
	}
	
	/**
	 * 정리
	 *   (1) 상속 받은 자식 객체는 부모의 자원(필드, 메소드 등)을 자유롭게 사용할 수 있다.
	 *   (2) 부모의 메소드를 자식객체에서 재정의(overriding) 했다면, 자식 객체의 메소드가 호출된다.
	 *   (3) 오버라이딩된 메소드에서 부모 메소드를 호출하려면, super 키워드를 사용한다.
	 */

}