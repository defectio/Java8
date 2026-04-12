package chapter11_API.sec03_java_lang.part03_System;

public class my03_time {

	/*
	 * [System 클래스]
	 *   - 자바 프로그램은 운영체제 상에서 바로 실행되는 것이 아니라 JVM 위에서 실행된다.
	 *        -> 운영체제의 모든 기능을 자바 코드로 직접 접근하기 어렵다.
	 *   - System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
	 *   	   -> 프로그램 종료, 키보드로 부터 입력, 모니터로 출력, 메모리 정리, 현재 시간 읽기, 시스템 프로퍼티 읽기, 환경 변수 읽기 등...
	 *   - System 클래스의 모든 필드와 메소드는 정적필드, 정적 메소드로 구성되어 있다. 
	 */
	public static void main(String[] args) {
		/*
		 * [xxxTimexxx()]
		 *   - curruntTimeMillis() : 컴퓨터의 시계로 부터 현재 시간을 읽어서 밀리세컨드(1/1000초) 단위의 long값 리턴
		 *   - nanoTime() : 컴퓨터의 시계로 부터 현재 시간을 읽어서 나노세컨드(1/10^9초) 단위의 long값 리턴
		 *   - 리턴값은 프로그램의 실행 요소 시간 측정에 사용된다.
		 */
		long start;
		long end;
		
		start = System.currentTimeMillis();
		//start = System.nanoTime();
		int sum = 0;
		for(int i=0 ; i<=100000 ; i++) {
			sum += i;
		}
		end = System.currentTimeMillis();
		//end = System.nanoTime();
				
		System.out.println("시작 시간 : "+start);
		System.out.println("종료 시간 : "+end);
		
		System.out.println((end-start)+"밀리초 걸림");
		//System.out.println((end-start)+"나노초 걸림");
	}

}
