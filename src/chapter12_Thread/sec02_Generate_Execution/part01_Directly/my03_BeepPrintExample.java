package chapter12_Thread.sec02_Generate_Execution.part01_Directly;

import java.awt.Toolkit;

public class my03_BeepPrintExample {

	public static void main(String[] args) {
		/**
		 * [작업 스레드 생성] - 방법2
		 *   - Runnable 익명 구현 객체를 매개값으로 하여 Thread 생성자 호출
		 *   - 작업 스레드 실행 방법 : start() 메소드 호출
		 *   - start() 메소드가 호출되면 작업 스레드는 매개값으로 받은 Runnable의 run() 메소드를 실행하여 자신의 작업을 처리한다.
		 */
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 비프음 발생

					/**
					 * Thread.sleep() : 반드시 예외처리 해야함
					 */
					try {
						Thread.sleep(500); // 0.5초간 일시정지
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
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