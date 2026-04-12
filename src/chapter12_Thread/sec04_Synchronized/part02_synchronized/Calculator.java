package chapter12_Thread.sec04_Synchronized.part02_synchronized;

public class Calculator {

	private int memory;
	private int size;
	
	public int getMemory() {
		return memory;
	}
	
	public int getSize() {
		return size;
	}
	
	
	/*
	 * 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 
	 * 스레드 작업이 끝날 때까지 객체에 잠금을 걸어서 다른 스레드가 사용할 수 없도록 해야 한다.
	 * 
	 * 임계영역(critical section) : 멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역
	 * 
	 * 자바는 임계영역을 지정하기 위해 동기화 메소드와 동기화 블록을 제공한다.
	 * 스레드가 객체 내부의 동기화 메소드 또는 동기화 블록에 들어가면 즉시 잠금을ㄹ 걸어 다른 스레드가 임계영역 코드를 실행하지 못하게 한다.
	 */
	public synchronized void setMemory(int memory) {
		// 단 하나의 스레드만 실행 시킴
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + "-memory : " + this.memory);
	}
	
	// 동기화 블록
	public  void setSize(int size) {
		// this : 공유 객체인 Calculator의 참조(잠금 대상)
		synchronized (this) {
			this.size = size;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + "-size : " + this.size);
		}
	}
	
}
