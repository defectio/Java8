package chapter12_Thread.sec02_Generate_Execution.part01_Directly;

import java.awt.Toolkit;

public class my01_BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();   			// 비프음 발생
			
			/**
			 * Thread.sleep() : 반드시 예외처리 해야함
			 */
			try {
				Thread.sleep(500);  //0.5초간 일시정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 프린팅 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * 비프음 발생과 프린팅은 서로 다른 작업이므로 메인 스레드가 동시에 두 가지 작업을 처리할 수 없다.
		 *  -> 메인 스레드는 비프음을 모두 발생한 다음, 프린팅을 시작한다.
		 *  
		 *  비프음을 발생시키면서 동시에 프린팅을 하려면 두 작업 중 하나를 메인 스레드가 아닌 다른 스레드에서 실행 시켜야 한다.
		 *  프린팅은 메인 스레드가 담당하고, 비프음을 들려주는 것은 작업 스레드가 담당하도록 수정해보자.(Runnable 구현 클래스 작성)
		 */
		
	}

}
