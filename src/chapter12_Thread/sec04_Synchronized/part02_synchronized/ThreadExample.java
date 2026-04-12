package chapter12_Thread.sec04_Synchronized.part02_synchronized;

public class ThreadExample {

	/*
	 * User1 스레드는 Calculator 객체의 동기화 메소드인 setMemory()를 실행하는 순간 Calculator 객체를 잠근다.
	 * 메인 스레드가 User2 스레드를 실행시키지만, 동기화 메소드인 setMemory()를 실행시키지는 못하고 User1이 setMemory()를 모두 실행할 동안 대기
	 * User1 스레드가 setMemory() 메소드를 모두 실행하고 나면 User2 스레드가 setMemory() 메소드를 실행한다.
	 * 
	 * 결국 User1이 Calculator 객체를 사용할 동안 User2 스레드는 Calculator 객체를 사용하지 못하므로
	 * User1 스레드는 안전하게 방해받지 않고 Calculator 객체를 사용할 수 있게 된다.
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
