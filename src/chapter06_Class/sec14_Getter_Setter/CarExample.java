package chapter06_Class.sec14_Getter_Setter;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//private 필드에 직접 접근 불가
		//The field Car.speed is not visible
		//myCar.speed = 10;
		
		//잘못된 속도 변경 시 0으로 초기화
		myCar.setSpeed(-50);
		System.out.println("현재 속도(-50) : " + myCar.getSpeed());

		// 올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도(60) : " + myCar.getSpeed());

		//달리고 있으면 멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " +myCar.getSpeed());

	} //end main

} //end class
