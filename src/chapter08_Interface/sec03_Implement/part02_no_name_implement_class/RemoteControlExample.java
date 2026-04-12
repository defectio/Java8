package chapter08_Interface.sec03_Implement.part02_no_name_implement_class;

public class RemoteControlExample {
	/**
	 * [익명 구현 객체]
	 *  - 구현클래스를 만들어 사용하는 것이 일반적이고, 클래스를 재사용할 수 있기 때문에 편리하지만, 
	 *     일회성의 구현 객체를 만들기 위해 소스 파일을 만들고 클래스를 선언하는 것인 비효율적이다.
	 *  - 자바는 소스 파일을 만들지 않고도 구현 객체를 만들 수 있는 방법을 제공하는데, 그것이 익명 구현 객체 이다.
	 *  	즉, 구현 클래스를 만들고, 구현 객체로 생성하지 않고 인터페이스 구현 객체를 만들 수 있다.
	 *  - UI 프로그래밍에서 이벤트 처리, 임시 작업 스레드를 만들기 위해(딱 한번 사용할 목적) 익명 구현 객체를 활용한다.
	 */
	public static void main(String[] args) {
		
		/**
		 * 	[선언 방법]
		 * 		인터페이스타입 변수 = new 인터페이스() { 
		 * 			//인터페이스에 선언된 추상메소드의 실체메소드 선언 
		 * 		};
		 * 
		 *   	- 인터페이스() {}; 는 인터페이스를 구현해서 중괄호 {}와 같이 클래스를 선언하라는 뜻이고
		 *     - new 연산자는 이렇게 선언된 클래스를 객체로 생성한다.
		 *     - RemoteControl 인터페이스를 익명 구현 객체로 생성하여 인터페이스 참조 변수인 rc에 담는다.
		 *       즉, 실행문이므로 뒤에 ; 가 있어야 한다.
		 */
		RemoteControl rc = new RemoteControl() {
			/**
			 * 인터페이스에 선언된 모든 추상메소드들의 실체메소드를 작성해야 한다. 
			 * 그렇지 않으면 컴파일 에러
			 */
			@Override
			public void turnOn() { 
				System.out.println("전원을 켭니다.");
			}	
			
			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				/**
				 * 구현할 필요가 없는 로직이면 메소드 overrideing만 해도된다.
				 */
			}
		};
		
		/**
		 *  익명구현 객체의 메소드 실행
		 */
		rc.turnOn();
		rc.turnOff();
		
		/**
		 * 인터페이스의 디폴트 메소드 호출
		 */
		rc.setMute(true);
		
		/**
		 * 인터페이스의 정적 메소드 호출
		 */
		RemoteControl.changeBattery();
	
	} //end main

} //end class