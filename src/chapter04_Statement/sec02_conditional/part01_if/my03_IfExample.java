package chapter04_Statement.sec02_conditional.part01_if;

public class my03_IfExample {

	/*
	 * 조건문이 여러개인 if문도 있다. 조건식의 결과에 따라 실행할 블록만 실행하고 전체 if문을 벗어난다.
	 * else if 블록의 개수는 제한이 없고, 모든 조건식을 만족하지 않을 경우 else 블록을 실행한다.
	 */
	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else { //score < 70 일 경우
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}

	}

}
