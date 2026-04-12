package chapter12_Thread.sec02_Generate_Execution.part02_SubClass;

import java.awt.Toolkit;

/**
 * 작업 스레드가 실행할 작업을 Runnable로 만들지 않고, 
 * Thread의 하위클래스로 작업클래스를 정의하면서 작업 내용을 포함시킬 수도 있다.
 * @author defec
 *
 */
public class my01_BeepThread extends Thread{

	/**
	 *  Thread 클래스를 상속한 후, run() 메소드를 재정의(overriding)해서 스레드가 실행할 코드를 작성
	 */
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
	
}
