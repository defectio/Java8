package chapter08_Interface.sec03_Implement.part03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		/**
		 * RemoteControl, Searchable 인터페이스를 모두 구현한 SmartTelevision() 객체 생성
		 */
		SmartTelevision tv = new SmartTelevision();
		
		System.out.println("[SmartTelevision 구현]");
		// RemoteControl의 메소드 호출
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOn();

		// Searchable의 메소드 호출
		tv.search("java");
		
		System.out.println();
		
		
		/**
		 * 인터페이스 타입에 구현 객체를 대입하면??
		 * 	  - 부모(상위)타입으로 자동 타입 변환
		 *   - 해당 인터페이스에 있는 추상메소드에만 접근 가능하다.
		 */
		RemoteControl rc = tv;
		
		System.out.println("[RemoteControl 타입에 구현객체 대입]");
		// RemoteControl의 메소드 호출
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		// Searchable의 메소드 호출 불가
//		rc.search("java");	
		
		System.out.println();
		
		
		/**
		 * 인터페이스 타입에 구현 객체를 대입하면??
		 * 	  - 부모(상위)타입으로 자동 타입 변환
		 *   - 해당 인터페이스에 있는 추상메소드에만 접근 가능하다.
		 */
		Searchable searchable = tv;
		
		
		System.out.println("[Searchable 타입에 구현객체 대입]");
		// RemoteControl의 메소드 호출
		// RemoteControl의 메소드 호출 불가
//		searchable.turnOn();
//		searchable.setVolume(10);
//		searchable.turnOff();
		
		// Searchable의 메소드 호출
		searchable.search("java");
		
	}// end main

} // end class