package chapter12_Thread.sec02_Generate_Execution.part01_Directly;

public class my02_BeepPrintExample {

	public static void main(String[] args) {
		/**
		 * [작업 스레드 생성] - 방법1
		 *   - Runnable 구현 객체 생성
		 *   - Runnable 구현 객체를 매개값으로 하여 Thread 생성자 호출
		 *   - 작업 스레드 실행 방법 : start() 메소드 호출
		 *   - start() 메소드가 호출되면 작업 스레드는 매개값으로 받은 Runnable의 run() 메소드를 실행하여 자신의 작업을 처리한다.
		 */
		Runnable beepTask = new my02_BeetTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		// 프린팅 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}