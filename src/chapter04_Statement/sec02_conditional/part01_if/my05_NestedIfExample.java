package chapter04_Statement.sec02_conditional.part01_if;

public class my05_NestedIfExample {

	public static void main(String[] args) {
		//[81, 101) 사이의 정수 난수 값
		int score = (int) (Math.random() * 20) + 81;
		
		System.out.println("점수: " + score);

		String grade;

		/* 중첩 if문 */
		//중첩 if문 보다는 if-else if-else 문으로 작성하는 것을 권장.
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else { // 90 <= score < 95
				grade = "A";
			}
		} else { //score < 90
			if (score >= 85) { // 85 <= score < 90
				grade = "B+";
			} else { // score < 85
				grade = "B";
			}
		}

		System.out.println("학점: " + grade);

	}

}
