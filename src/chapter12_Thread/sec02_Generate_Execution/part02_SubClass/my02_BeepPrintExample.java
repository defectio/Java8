package chapter12_Thread.sec02_Generate_Execution.part02_SubClass;

import java.awt.Toolkit;

public class my02_BeepPrintExample {

	public static void main(String[] args) {
		/**
		 * Thread 익명 객체로 작업 스레드 객체를 생성할 수도 있음
		 */
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 비프음 발생
					try {
						Thread.sleep(500); // 0.5초간 일시정지
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
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
