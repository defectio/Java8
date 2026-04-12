package chapter12_Thread.sec04_Synchronized.part01;

public class MainThreadExample {

	/*
	 * User1 스레드가 Calculator 객체의 memory 필드에 100을 먼저 저장하고 2초간 일시 정지 상태가 된다.
	 * User2 스레드가 memory 필드값을 50으로 변경한다.
	 * 2초가 지나 User1 스레드가 다시 실행 상태가 되어 memory 필드의 값을 출력하면 저장한 50이 나온다.
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();  // User1 스레드 생성
		user1.setCalculator(calculator);  // 공유 객체 설정
		user1.start();	  // User1 스레드 시작
		
		User2 user2 = new User2();  // User1 스레드 생성
		user2.setCalculator(calculator);  // 공유 객체 설정
		user2.start();  // User2 스레드 시작
	}

}
