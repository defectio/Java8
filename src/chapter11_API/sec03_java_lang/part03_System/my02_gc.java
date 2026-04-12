package chapter11_API.sec03_java_lang.part03_System;

public class my02_gc {

	/*
	 * [System 클래스]
	 *   - 자바 프로그램은 운영체제 상에서 바로 실행되는 것이 아니라 JVM 위에서 실행된다.
	 *        -> 운영체제의 모든 기능을 자바 코드로 직접 접근하기 어렵다.
	 *   - System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
	 *   	   -> 프로그램 종료, 키보드로 부터 입력, 모니터로 출력, 메모리 정리, 현재 시간 읽기, 시스템 프로퍼티 읽기, 환경 변수 읽기 등...
	 *   - System 클래스의 모든 필드와 메소드는 정적필드, 정적 메소드로 구성되어 있다. 
	 */
	
	public class Employee {
		public int eno;
		
		public Employee(int eno) {
			this.eno = eno;
			System.out.println("Employee("+eno+") 가 메모리에 생성됨");
		}
		
		//gc()는 쓰레기 객체를 삭제 하기 전에 마지막으로 finalize() 객체 소멸자를 실행한다.
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Employee("+eno+") 가 메모리에서 제거됨");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * [gc()]
		 *  - 자바는 개발자가 메모리를 직접 코드로 관리하지 않고 JVM이 알아서 자동으로 관리한다.
		 *  - JVM은 메모리가 부족할 때와 CPU가 한가할 때에 쓰레기 수집기(Garbage Collector)를 실행시켜 사용하지 않는 객체를 자동 제거한다.
		 *  - 쓰레기 수집기는 개발자가 직접 코드로 실행시킬 수 없고, JVM에게 가능한한 빨리 실행해달라고 요청할 수는 있다.
		 *      -> System.gc() 메소드가 호출 되면 쓰레기 수집기가 바로 실행되는 것은 아니고, JVM은 빠른 시간 내에 실행시키기 위해 노력 한다.
		 *  - 쓰레기가 생길 때마다 쓰레기 수집기가 동작된다면 정작 수행되어야 할 프로그램의 속도가 떨어지기 때문에 성능 측면에서 좋지 않다.
		 *    그리고 메모리가 충분하다면 굳이 쓰레기 수집기를 실행할 필요가 없다. (메모리가 열악하지 않은 환경이라면 거의 사용할 일이 없다)
		 *  - gc() 는 객체를 삭제 하기 전에 마지막으로 객체의 소멸자(finalize())를 실행한다.
		 */
		my02_gc ex = new my02_gc();

		Employee emp = ex.new Employee(1);
		
		emp = null;							//emp 변수가 참조하는 Employee 객체의 주소를 잃는다. -> Employee(1) : 쓰레기 객체가 된다.
		emp = ex.new Employee(2);	//emp 변수가 Employee(2) 객체 참조
		emp = ex.new Employee(3);	//emp 변수가 다른 Employee 객체를 참조하면 이전에 참조하던 객체의 주소를 잃는다. -> Employee(2) : 쓰레기 객체	
		
		for(int i=0 ; i<10 ; i++) {
			emp = ex.new Employee(i);
		}
		
		// -> Employee(1), Employee(2) 객체는 모두 쓰레기 객체가 된다.
		
		System.out.println("emp가 최종적으로 참조하는 사원번호 : "+emp.eno+"\n");
		
		System.out.println("[Gabage Collector 호출]");
		System.gc();	//모든 객체가 지워지는 건 아님. && 생성된 순서대로 지워지는 것도 아님.
		
	} //end main

} //end class