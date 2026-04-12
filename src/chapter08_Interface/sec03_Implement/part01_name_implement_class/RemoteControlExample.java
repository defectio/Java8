package chapter08_Interface.sec03_Implement.part01_name_implement_class;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		//Television tv = new Television();
		//Television타입 변수에 대입한다고 인터페이스를 사용하는 것이 아니다
		
		//인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체(구현 클래스를 객체로 생성해서)를 대입해야 한다.
		//인터페이스 변수는 참조 타입이기 때문에 구현객체가 대입될 경우 구현 객체의 번지를 저장한다.
		RemoteControl rc;
		
		//인터페이스는 개발코드와 구현객체가 서로 통신하는 접점 역할을 한다.
		//개발코드 -> 인터페이스 -> 구현객체 (메소드 호출)
		//왜 인터페이스를 중간에 두는 걸까? 개발코드를 수정하지 않고, 사용하는 객체를 변경할 수 있도록 하기위해!!!
		//인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에 따라 실행 내용과 리턴값이 다를 수 있다.
		//즉, 개발 코드의 수정 없이 객체만 갈아 끼우면 다양한 실행결과를 얻을 수 있다.
		
		rc = new Television();
//		 rc = new Audio();
		
		System.out.println("최대 볼륨 : " +RemoteControl.MAX_VOLUME);
		System.out.println("최소 볼륨 : " +RemoteControl.MIN_VOLUME);
		
		/**
		 * 인터페이스의 필드는 상수(static final)기 때문에 변경 불가
		 */
		// RemoteControl.MAX_VOLUME = 20;
		// RemoteControl.MIN_VOLUME = 20;

		/**
		 * 인터페이스 메소드 호출 순서
		 * 	 (1) 개발코드가 RemoteControl 인터페이스의 추상메소드 호출
		 * 	 (2) RemoteControl 인터페이스는 RemoteControl을 구현한 Television 객체의 실체 메소드 실행
		 *  (3) Television 객체의 실체 메소드 실행 결과 리턴값 있으면 RemoteControl 로 리턴\
		 *  (4) RemoteControl에서 리턴값을 받아 개발코드로 리턴 -> 결국 실체메소드의 리턴값이 개발코드로 넘어 온다.
		 */
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
	} //end main
	
} //end class