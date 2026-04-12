package chapter04_Statement.sec02_conditional.part01_if;

public class my02_IfExample {

	/*
	 * if문은 else 블록과 함께 사용되어 조건식의 결과에 따라 실행 블록을 선택한다.
	 * if문의 조건식이 true면 if 블록이 실행되고, if문의 조건식이 false면 else 블록이 실행된다.
	 * -> 조건식의 결과에 따라 이 두개의 블록 중 어느 한 블록의 내용만 실해하고 전체 if문을 벗어난다.
	 */
	public static void main(String[] args) {
		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {  //score < 90 일 경우 실행됨.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
