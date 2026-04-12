package chapter04_Statement.sec03_loop.part04_break;

public class my02_OutterBreakExample {
	/*
	 * break문은 반복문을 실행 중지할 때 사용한다.
	 * if문과 같이 사용해서 반복문을 종료할 때 사용함
	 */
	public static void main(String[] args) {
		/*
		 * 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료 시키지 않는다.
		 * 바깥쪽 반복문을 종료 시키고 싶다면 라벨을 붙이고 "break 라벨"로 바깥쪽 반복문을 종료한다.
		 */
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
