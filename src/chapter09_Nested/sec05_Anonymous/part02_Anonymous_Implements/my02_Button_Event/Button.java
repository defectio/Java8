package chapter09_Nested.sec05_Anonymous.part02_Anonymous_Implements.my02_Button_Event;

public class Button {
	
	//인터페이스 타입의 필드
	OnClickListener listener;
	
	//setter ->외부에서 구현객체를 받아 필드에 대입
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	/**
	 * touch 이벤트 발생 시 인터페이스를 통해 구현 객체의 메소드를 호출
	 */
	public void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스
	interface OnClickListener {
		void onClick();
	}
	
} //end class