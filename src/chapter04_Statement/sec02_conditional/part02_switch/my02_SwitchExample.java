package chapter04_Statement.sec02_conditional.part02_switch;

public class my02_SwitchExample {

	/*
	 * switch문은 if문 처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라, 
	 * 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
	 */

	// if문은 조건식의 결과가 true, false 두가지 밖에 없기 때문에 경우의 수가 많을 수록 else if 블록을 반복적으로 추가해야 한다.
	// switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 같은 기능의 if문 보다 코드가 간결하다.
	public static void main(String[] args) {
		//8, 9, 10, 11의 정수만 입력
		int time = 8;
		//int time = 9;
		//int time = 10;
		//int time = 11;
		
		System.out.println("[현재시간: " + time + " 시]");

		//case문 끝에 break가 붙어있는 이유는 다음 case를 실행하지 말고 switch문을 빠져 나가기 위해서 이다.
		//만약 break가 없다면 실행되 case 블록 이후의 case 블록들이 연달아 실행된다. 이때는 case 값과는 상관없이 실행된다.
		//특별한 경우가 아니면 break문을 사용하는 것을 권장함.
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}

	} // end main

} // end class
