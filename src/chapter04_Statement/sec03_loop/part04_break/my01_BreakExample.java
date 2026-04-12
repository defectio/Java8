package chapter04_Statement.sec03_loop.part04_break;

public class my01_BreakExample {
	/*
	 * break문은 조건문과 반복문에 사용되며, 실행 중지할 때 사용한다.
	 * if문과 같이 사용해서 반복문을 종료할 때 사용함
	 */
	public static void main(String[] args) {
		int num = 0;
		
		while(true) {
			num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			
			//num이 6이면 while문 종료한다
			if(num == 6) {
				break;
			}
		}
		System.out.println("num : "+num);
		System.out.println("프로그램 종료");
	}

}
