package chapter08_Interface.sec04_Use_Interface.part01_Abstract_Method;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		/**
		 * [인터페이스 사용]
		 * 	 - 인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현객체를 대입해야 한다.
		 *  - 인터페이스 변수는 참조 타입이기 때문에 구현객체가 대입될 경우 구현 객체의 번지를 저장한다.
		 */
		RemoteControl rc = null;
		
		/* Television 객체를 인터페이스 타입에 대입 */
		//rc에는 RemoteControl 인터페이스를 구현한 Television 객체의 번지가 저장됨
		rc = new Television();		
		
		/**
		 * 인터페이스의 turnOn(), setVolume(), turnOff() 메소드 호출 -> Television 객체의 재정의된 메소드 실행
		 */
		System.out.println("[TV]");
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		/* Audio 객체를 인터페이스 타입에 대입 */
		//rc에는 RemoteControl 인터페이스를 구현한 Audio 객체의 번지가 저장됨
		rc = new Audio();
		
		/**
		 * 인터페이스의 turnOn(), setVolume(), turnOff() 메소드 호출 -> Audio객체의 재정의된 메소드 실행
		 */
		System.out.println("[Audio]");
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	
	} //end main
	
} //end class