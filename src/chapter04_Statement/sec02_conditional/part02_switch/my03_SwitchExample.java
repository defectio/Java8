package chapter04_Statement.sec02_conditional.part02_switch;

public class my03_SwitchExample {

	/*
	 * switch문은 if문 처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라, 
	 * 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
	 */

	// if문은 조건식의 결과가 true, false 두가지 밖에 없기 때문에 경우의 수가 많을 수록 else if 블록을 반복적으로 추가해야 한다.
	// switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 같은 기능의 if문 보다 코드가 간결하다.
	public static void main(String[] args) {
		char grade = 'B';
		
		//char 타입의 변수도 switch문에 사용될 수 있다.
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;							
			default:
				System.out.println("손님입니다.");
		} //end switch

	} // end main

} // end class
