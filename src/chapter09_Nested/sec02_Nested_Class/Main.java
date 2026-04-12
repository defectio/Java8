package chapter09_Nested.sec02_Nested_Class;

public class Main {
	
	public static void main(String[] args) {
		//바깥 클래스 객체 생성
		A a = new A();
		System.out.println();
		
		/**
		 * [인스턴스 멤버 클래스 객체 생성]
		 *  - A객체 생성 -> B객체 생성
		 */
		A.B b = a.new B();
		b.field1 = 3;
		b.methodB();
		System.out.println();
		
		/** 
		 * [정적 멤버 클래스 객체 생성]
		 *  - A객체 생성할 필요 없이 C객체 생성
		 */
		A.C c = new A.C();
		c.field1 = 3;		//정적 멤버 클래스의 인스턴스 필드 사용
		c.methodC1();	//정적 멤버 클래스의 인스턴스 메소드 사용
		
		A.C.field2 = 3;
		//c.field2 = 3;	//정적 필드는 참조변수로 접근할 수 있지만, 객체 자체로 접근하는 것을 권장
		A.C.methodC2();
		System.out.println();
		
		/**
		 * [로컬 클래스 객체 생성]
		 */
		a.method();
	
	} //end main
	
} //end class