package chapter08_Interface.sec05_Polymorphism.part00_Interface_Polymorphism.my01_interface_poly;

public class Example {

	public static void main(String[] args) {
		/**
		 * - 인터페이스를 사용해서 메소드를 호출하도록 코딩했다면, 구현 객체를 교체하는 것은 매우 손쉽고 빠르게 할 수 있다.
		 *       -> 프로그램 소스 코도는 변함이 없는데 구현 객체를 교체함으로서 프로그램의 실행 결과가 다양해진다. (인터페이스의 다형성)
		 */
		
		// interface를 구현했다면 A에 문제가 생겨서 B클래스를 새로 만들었을 경우, 구현 객체를 교체함으로써 프로그램의 실행 결과가 다양해진다.
//		InterfaceA a = new A();
		InterfaceA a = new B();
		
		a.method1();
		a.method2();
		a.method3();
		
	} //end main

} //end class
