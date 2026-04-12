package chapter09_Nested.sec04_Nested_Interface;

/**
 * 중첩인터페이스 구현 -> "클래스명.중첩인터페이스명"
 * @author defec
 */
public class MessageListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
	
} //end class