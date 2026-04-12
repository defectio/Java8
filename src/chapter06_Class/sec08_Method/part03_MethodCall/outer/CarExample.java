package chapter06_Class.sec08_Method.part03_MethodCall.outer;

public class CarExample {

	/* 
	 * [객체 외부 메소드 호출]
	 *   - 객체 생성 후 참조 변수로 메소드 호출
	 */
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//리턴값이 없거나, 있어도 리턴값을 받지 않을 경우
		myCar.keyTurnOn();
		myCar.run();
		
		//리턴값이 있고, 리턴값을 받고 싶을 경우 -> 변수에 받아 저장
		int speed = myCar.getSpeed();
		
		System.out.println("현재 속도: " + speed + "km/h");

	} //end main

} //end class