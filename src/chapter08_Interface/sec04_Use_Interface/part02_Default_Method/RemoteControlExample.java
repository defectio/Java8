package chapter08_Interface.sec04_Use_Interface.part02_Default_Method;

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
		 * [디폴트 메소드의 사용]
		 * 	 - 디폴트 메소드는 추상메소드가 아닌 인스턴스 메소드이므로 구현객체가 있어야 사용할 수 있다.
		 * 	    예를들어, RemoteControl 인터페이스는 setMute() 메소드를 가지고 있지만, 다음과 같이 사용할 수 없다.
		 * 			-> RemoteControl.setMute(true); (x)
		 * 			-> rc.setMute(true); 	(o)
		 */
		// 인터페이스의 setMute() 메소드 호출 -> RemoteControl의 디폴드 메소드 실행
		// Television(구현객체)에서 overriding 하지 않았음.
		System.out.println("[TV]");
		rc.setMute(true);
		
		System.out.println();
		
		
		/* Audio 객체를 인터페이스 타입에 대입 */
		//rc에는 RemoteControl 인터페이스를 구현한 Audio 객체의 번지가 저장됨
		rc = new Audio();
		
		System.out.println("[Audio]");
		//인터페이스의 디폴트 메소드를 재정의한 Audio 객체의 setMute() 메소드 실행
		rc.setMute(true);
		
	} //end main
	
} //end class