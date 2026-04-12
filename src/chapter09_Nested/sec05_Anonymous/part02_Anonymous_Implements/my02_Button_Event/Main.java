package chapter09_Nested.sec05_Anonymous.part02_Anonymous_Implements.my02_Button_Event;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * [Window 객체 생성] - 생성자를 통해서 버튼의 listener가 설정됨
		 *   	(1) 필드의 초기값으로 익명 구현 객체 대입
		 *   	(2) 매개값으로 익명 구현 객체 대입
		 */
		Window w = new Window();
		
		//Window 버튼 터치
		// -> Button 객체의 touch() 메소드 호출
		// -> listener에 대입된 Onclick() 메소드 호출
		//	-> OnClickListener(중첩인터페이스)를 구현한 구현 객체의 touch() 메소드 실행
		w.button1.touch();
		w.button2.touch();
		
	} //end main
	
} //end class