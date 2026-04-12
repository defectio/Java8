package chapter04_Statement.sec02_conditional.part01_if;

public class my01_IfExample {

	public static void main(String[] args) {
		int score = 93;

		//if문은 조건식의 결과에 따라 실행 여부가 결정된다.
		//조건식의 결과가 참일 경우 if문 내부 실행문들을 실행한다.
		//조선식에는 true, false 값을 산출할 수 있는 연산식이나, boolean 변수가 올 수 있다.
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}

		//만약 if문 내부에서 실행할 문장이 1개 밖에 없다면, {} 중괄호 블록을 생략할 수 있다.
		//하지만 코드의 가독성을 위해서 {} 중괄호 블록은 항상 쓰는 것을 권장.
		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		
		//if문에 걸리지 않은 실행문 -> 무조건 실행됨.
		System.out.println("등급은 B 입니다.");

	}

}
