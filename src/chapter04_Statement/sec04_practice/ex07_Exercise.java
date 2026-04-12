package chapter04_Statement.sec04_practice;

import java.util.Scanner;

public class ex07_Exercise {

	public static void main(String[] args) {
		//while문과 Scanner를 이용해서 키보드로 부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하시오
		boolean run = true;
		int balance = 0; //잔액
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");

			int menu = scan.nextInt();
			int money = 0;
			switch (menu) {
			case 1:
				System.out.print("예금액>");
				money = scan.nextInt();
				balance += money;
				break;
			case 2:
				System.out.println("츨금액>");
				money = scan.nextInt();
				if (balance < money) {
					System.out.println("출금불가");
				} else {
					balance -= money;
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			default:
				run = false;
			} // end switch
		} //end while
		
		System.out.println("프로그램 종료");
	}

}
