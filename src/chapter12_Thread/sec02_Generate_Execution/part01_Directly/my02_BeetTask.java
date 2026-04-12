package chapter12_Thread.sec02_Generate_Execution.part01_Directly;

import java.awt.Toolkit;

/**
 *  [Runnable]
 *   - 작업 스레드가 실행할 수 있는 코드를 가지고 있는 객체라고 해서 붙여진 이름
 *   - Runnable은 인터페이스 타입이기 때문에 구현 객체를 만들어 대입해야 한다.
 *   - Runnable의 추상메소드는 run() 하나뿐 -> 구현 객체에서 재정의 해야한다.
 *  
 * @author defec
 *
 */
public class my02_BeetTask implements Runnable {

	/**
	 * Runnable 인터페이스의 run() 메소드 재정의 -> Thread의 실행내용
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
