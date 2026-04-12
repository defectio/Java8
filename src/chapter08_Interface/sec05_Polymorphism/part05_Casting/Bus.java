package chapter08_Interface.sec05_Polymorphism.part05_Casting;

public class Bus implements Vehicle {

	// 인터페이스의 추상메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// 구현 객체만 가지고 있는 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크 합니다.");
	}

} // end class
