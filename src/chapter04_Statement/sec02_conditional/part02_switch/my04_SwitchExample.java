package chapter04_Statement.sec02_conditional.part02_switch;

public class my04_SwitchExample {

	/*
	 * switch문은 if문 처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라, 
	 * 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
	 */

	// if문은 조건식의 결과가 true, false 두가지 밖에 없기 때문에 경우의 수가 많을 수록 else if 블록을 반복적으로 추가해야 한다.
	// switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 같은 기능의 if문 보다 코드가 간결하다.
	public static void main(String[] args) {
		String position = "과장";
		
		//자바 6까지는 switch문의 괄호에는 정수타입(byte, char, short, int, long) 변수나 정수값을 산출하는 연산식만 올 수 있었다.
		//자바 7부터는 String 타입의 변수도 올 수 있다.
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;							
			default:
				System.out.println("300만원");
		} //end switch

	} // end main

} // end class
