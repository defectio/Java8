package chapter12_Thread.sec04_Synchronized.part01;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	/*
	 * 멀티 스레드 프로그램에서는 스레드들이 객체를 공유해서 작업해야 하는 경우가 있다.
	 * 이 경우, 스레드A가 사용하던 객체가 스레드B에 의해 상태가 변경될 수 있기 때문에 스레드A가 의도했던 것과 다른 결과를 산출할 수도 있다.
	 */
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
