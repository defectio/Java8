package chapter09_Nested.sec04_Nested_Interface;

public class ButtonExample {
	/**
	 * 어떤 구현 객체를 생성해서 Button 객체의 setOnClickListener() 메소드로 세팅하느냐에 따라서
	 * Button의 touch() 메소드의 실행결과가 달라진다.
	 */
	public static void main(String[] args) {
		//Button 객체 생성
		Button btn = new Button();
		
		/**
		 * OnClickListener를 구현한 객체를 Button 클래스의 필드로 setting
		 */
		btn.setOnClickListener(new CallListener());
		btn.touch();	//CallListener의 touch() 메소드 호출
		
		System.out.println();
		
		/**
		 * OnClickListener를 구현한 객체를 Button 클래스의 필드로 setting
		 */
		btn.setOnClickListener(new MessageListener());
		btn.touch();	//MessageListener의 touch() 메소드 호출
	
	} //end main
	
} //end class