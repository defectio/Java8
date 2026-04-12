package chapter09_Nested.sec04_Nested_Interface;

public class Button {
	/**
	 * [중첩 인터페이스]
	 * 	 - 중첩 인터페이스는 클래스의 멤버로 선언된 인터페이스를 말한다.
	 * 	 - 인터페이스를 클래스 내부에 선언한 이유는 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해서이다.
	 * 	   ex) UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용 된다.
	 */
	interface OnClickListener {
		//중첩인터페이스의 추상메소드 -> OnClickListener를 구현한 객체에서 반드시 재정의
		void onClick();
	}
	
	// 중첩 인터페이스로 선언한 인터페이스 타입의 필드
	OnClickListener listener;
	
	/** 
	 * 매개변수의 다형성 -> OnClickListener를 구현한 객체들 모두가 매개변수로 대입될 수 있다.
	 * @param listener
	 */
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	/**
	 * touch() 메소드가 실행되었을 때(버튼 이벤트 발생 시) 인터페이스를 통해 구현 객체의 메소드(listener.onClick)를 호출한다.
	 */
	void touch() {
		//구현 객체의 onClick() 메소드 호출
		listener.onClick();
	}

} //end class
