package chapter09_Nested.sec04_Nested_Interface;

/**
 * 중첩인터페이스 구현 -> "클래스명.중첩인터페이스명"
 * @author defec
 */
public class CallListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

} //end class