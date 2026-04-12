package chapter12_Thread.sec02_Generate_Execution.part03_ThreadName;

public class ThreadB extends Thread{
	
	/**
	 * 작업스레드 이름 설정 : setName()
	 */
	public ThreadB() {
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
}
