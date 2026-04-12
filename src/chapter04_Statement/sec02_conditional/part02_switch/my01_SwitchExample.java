package chapter04_Statement.sec02_conditional.part02_switch;

public class my01_SwitchExample {

	/*
	 * switch문은 if문 처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라,
	 * 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
	 */
	
	//if문은 조건식의 결과가 true, false 두가지 밖에 없기 때문에 경우의 수가 많을 수록 else if 블록을 반복적으로 추가해야 한다.
	//switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 같은 기능의 if문 보다 코드가 간결하다.
	public static void main(String[] args) {
		//[1, 7) 사이의 정수 난수 값
		int num = (int) (Math.random() * 6) + 1;

		//num(변수)가 갖는 값에 따라 선택되는 case 블록이 다르다.
		//case문 끝에 break가 붙어있는 이유는 다음 case를 실행하지 말고 switch문을 빠져 나가기 위해서 이다.
		//만약 break가 없다면 실행되 case 블록 이후의 case 블록들이 연달아 실행된다.
		switch (num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:  //case1, case2, .... case5의 경우가 아닌 경우
				System.out.println("6번이 나왔습니다.");
				break;
		} //end switch

	} //end main

} //end class
