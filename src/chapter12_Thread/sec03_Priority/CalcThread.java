package chapter12_Thread.sec03_Priority;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	}
	
	/**
	 * 20억번 루핑한 후, 스레드 이름을 출력한다.
	 */
	public void run() {
		for (int i = 0; i < 2000000000; i++) {
		}
		System.out.println(getName());
	}
	
}
