package chapter11_API.sec03_java_lang.part01_Object;

public class my07_FinalizeExample {

	public class Counter {
		private int no;
		
		public Counter(int no) {
			this.no = no;
		}
		
		/**
		 * [Object 클래스의 finalize()]
		 *   - 참조하지 않는 배열이나 객체는 쓰레기 수집기(Garbage Collector)가 힙 영역에서 자동으로 소멸시킨다.
		 *      쓰레기 수집기는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킨다.
		 *   - finalize() 메소드는 기본적으로 실행 내용이 없다.
		 *     만약 객체가 소멸되기 직전에 마지막으로 사용했던 자원을 닫고 싶거나, 중요한 데이터를 저장하고 싶다면 finalize() 메소드를 재정의 할 수 있다.
		 */
		//메소드가 실행되면 번호를 출력하게 해서 어떤 객체가 소멸되는지 확인하도록 한다.
		@Override
		protected void finalize() throws Throwable {
			System.out.println(this.no+"번 객체의 finalize()가 실행됨.");
		}
	}
	
	public static void main(String[] args) {
		my07_FinalizeExample fe = new my07_FinalizeExample();
		
		for (int i = 1; i <= 50; i++) {
			@SuppressWarnings("unused")
			Counter counter = fe.new Counter(i);
			
			//Counter 객체를 쓰레기로 만듬
			counter = null;
			
			//쓰레기 수집기 실행 요청
			// -> 쓰레기 수집기는 메모리가 부족할 때, CPU가 한가할 때에 JVM에 의해서 자동 실행된다.
			// -> 그렇기 때문에 finalize() 메소드가 호출되는 시점은 명확하지 않다.
			System.gc();
			
			/*
			 * 실행 결과를 보면 순서대로 소멸시키지 않고, 무작위로 소멸시키는 것을 볼 수 있다.
			 * 그리고 전부 소멸시키는 것이 아니라 메모리의 상태를 보고 일부만 소멸시킨다.
			 * 프로그램이 종료될 때 즉시 자원을 해제하거나 즉시 데이터를 최종 저장해야 된다면, 
			 * 일반 메소드에서 작성하고 프로그램이 종료될 때 명시적으로 메소드를 호출하는 것이 좋다.
			 */
		}

	} //end main

} //end class