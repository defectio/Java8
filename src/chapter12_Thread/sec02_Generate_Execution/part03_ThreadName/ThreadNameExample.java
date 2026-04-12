package chapter12_Thread.sec02_Generate_Execution.part03_ThreadName;

public class ThreadNameExample {

	/**
	 * [Thread Name]
	 *   - 스레드는 자신의 이름을 가지고 있다.
	 *   - 스레드 이름이 큰 역할을 하는 것은 아니지만, 디버깅할 때 어떤 스레드가 어떤 작업을 하는지 
	 *     조사할 목적으로 가끔 사용된다.
	 *   - main 스레드는 "main"이라는 이름을 가지고 있고,
	 *   - 작업 스레드는 자동적으로 "Thread-n" 이라는 이름으로 설정된다.
	 */
	public static void main(String[] args) {
		/**
		 * main Thread
		 */
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+mainThread.getName());
		
		/**
		 * 작업 스레드
		 *   - 직접 생성한 작업 스레드는 자동으로 "Thread-n"이라는 이름으로 설정된다.
		 */
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "가 출력한 내용");
				}
			}
		};
		threadA.start();
		
		/**
		 * 작업 스레드
		 *   - 다른 이름으로 설정. Thread
		 */
		ThreadB threadB = new ThreadB();
		threadB.start();
	}

}
