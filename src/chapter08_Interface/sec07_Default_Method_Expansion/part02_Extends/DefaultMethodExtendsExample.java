package chapter08_Interface.sec07_Default_Method_Expansion.part02_Extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		/**
		 * [익명 구현 객체]
		 * 
		 *  인터페이스타입 변수 = new 인터페이스() { 
		 *  	인터페이스에 선언된 추상메소드의 실체메소드 선언 
		 *  };
		 */
		ChildInterface1 ci1 = new ChildInterface1() {
			/**
			 * 부모 인터페이스의 method1(), 자식 인터페이스의 methodA() 실체 메소드가 있어야 한다.
			 */
			@Override
			public void method1() {
				System.out.println("ChildInterface1's overriding method1");
			}
			
			@Override
			public void methodA() {
				System.out.println("ChildInterface1's overriding methodA");
			}
		};
		
		System.out.println("[1. 부모 인터페이스의 디폴트 메소드 상속]");
		ci1.method1();		//부모인터페이스의 추상 메소드 호출
		ci1.method2();  	//부모인터페이스의 디폴트 메소드 호출
		ci1.methodA();		//자식인터페이스의 추상 메소드 호출
		System.out.println();
		
		//-------------------------------------------------------------
		
		ChildInterface2 ci2 = new ChildInterface2() {
			/**
			 * 부모 인터페이스의 method1(), 자식 인터페이스의 methodB() 실체 메소드가 있어야 한다.
			 */
			@Override
			public void method1() { 
				System.out.println("ChildInterface2's overriding method1");
			}
			
			@Override
			public void methodB() {
				System.out.println("ChildInterface2's overriding methodB");
			}
		};
		
		System.out.println("[2. 부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 재정의]");
		ci2.method1();		//부모인터페이스의 추상 메소드 호출
		ci2.method2();  	//자식인터페이스에서 재정의한 부모인터페이스의 디폴트 메소드 호출
		ci2.methodB();		//자식인터페이스의 추상 메소드 호출
		System.out.println();
		
		//-------------------------------------------------------------
		
		ChildInterface3 ci3 = new ChildInterface3() {
			/**
			 * 부모 인터페이스의 method1(), 자식 인터페이스의 methodC() 실체 메소드가 있어야 한다.
			 * 부모 인터페이스의 디폴트 메소드를 추상 메소드로 재선언 했으므로, method2()에 대한 실체 메소드도 있어야 한다.
			 */
			@Override
			public void method1() {
				System.out.println("ChildInterface3's overriding method1");
			}
			
			// 부모인터페이스의 디폴트 메소드를 자식인터페이스에서 추상메소드로 재선언 -> 구현 객체에서 재정의
			@Override
			public void method2() {
				System.out.println("ChildInterface3's overriding method2");
			}
			
			@Override
			public void methodC() {
				System.out.println("ChildInterface3's overriding methodC");
			}
		};
		
		System.out.println("[3. 부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 추상메소드로 재정의]");
		ci3.method1();		//부모인터페이스의 추상메소드 호출
		ci3.method2();  	//자식인터페이스에서 디폴트 메소드를 추상메서드로 재정의한 메소드 호출 
		ci3.methodC();		//자식인터페이스의 추상메소드 호출
	
	} //end main
	
} //end class