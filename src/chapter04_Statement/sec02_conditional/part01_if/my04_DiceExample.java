package chapter04_Statement.sec02_conditional.part01_if;

public class my04_DiceExample {

	public static void main(String[] args) {
		/*
		 * 0.0 <= Math.random() < 1.0  사이의 double타입 random값
		 * 0 <= Math.random() * 10 < 10 사이의 double타입 random값
		 * 1 <= Math.random() * 10 +1< 11 사이의 double타입 random값
		 * 1 <= (int) Math.random() * 10 +1< 11 사이의 int타입 random값
		 */
		
		//[1, 7) 사이의 정수 난수 값
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
