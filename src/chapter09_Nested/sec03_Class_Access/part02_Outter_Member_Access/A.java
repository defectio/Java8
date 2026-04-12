package chapter09_Nested.sec03_Class_Access.part02_Outter_Member_Access;

public class A {
	/**
	 * [멤버클래스에서 바깥 클래스의 필드와 메소드 사용시 제한]
	 * 	 - 멤버 클래스가 인스턴스 또는 정적으로 선언됨에 따라 멤버클래스 내부에서 바깥클래스의 필드와 메소드 사용에 제한이 생긴다.
	 * 		(1) 인스턴스 멤버 클래스 : 인스턴스 멤버 클래스 안에서는 바깥클래스의 모든 필드와 메소드에 접근 가능하다.
	 * 		(2) 정적 멤버 클래스 : 정적 멤버 클래스 안에서는 바깥 클래스의 정적 필드, 정적 메소드에만 접근 가능하다.
	 * 	                              (정적 멤버 클래스 안에서는 바깥 클래스의 인스턴스 필드, 인스턴스 메소드 사용 불가)
	 */
	
	//인스턴스 필드
	int instance_num;      
	//인스턴스 메소드
	void instanceMethod() {}
	
	//정적 필드
	static int static_num;
	//정적 메소드
	static void staticMethod() {}
	
	/**
	 * [인스턴스 멤버 클래스]
	 *  - 인스턴스 멤버 클래스 안에서는 바깥 클래스의 모든(인스턴스, 정적) 필드와 메소드에 접근가능
	 * @author defec
	 *
	 */
	class B {
		void method() {
			//인스턴스 필드, 인스턴스 메소드 -> 접근 가능
			instance_num = 10;
			instanceMethod();
			
			//정적 필드, 정적 메소드 -> 접근 가능
			static_num = 10;
			staticMethod();
		}
	}
	
	/**
	 * [정적 멤버 클래스]
	 *  - 정적 멤버 클래스 안에서는 바깥 클래스의 정적 필드와 정적 메소드만 접근가능
	 * @author defec
	 */
	static class C {
		void method() {
			/**
			 * 정적 멤버 클래스 안에서 바깥 클래스의 인스턴스 필드, 인스턴스 메소드 접근 불가능
			 *  - 인스턴스 필드, 메소드는 객체 생성 후 사용 가능 하기 때문에, 직접 사용 불가
			 */
			// instance_num = 100;
			// instanceMethod();
			
			// 정적 필드, 정적 메소드 -> 접근 가능
			static_num = 100;
			staticMethod();
			
			/**
			 * 만약, 정적 멤버 클래스 안에서 바깥 클래스의 인스턴스 필드/메소드에 접근하고 싶다면?
			 *   -> 바깥 클래스를 객체로 생성하고 접근한다.
			 */
			A a = new A();
			
			//바깥 클래스를 객체로 생성하고, 인스턴스 필드/메소드에 접근 가능
			a.instance_num = 100;
			a.instanceMethod();
		}
	}
	
} //end class A