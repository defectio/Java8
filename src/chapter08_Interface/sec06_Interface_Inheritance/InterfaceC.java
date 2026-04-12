package chapter08_Interface.sec06_Interface_Inheritance;

public interface InterfaceC extends InterfaceA, InterfaceB {

	/**
	 * [인터페이스 다중 상속] 
	 * 	 - 인터페이스도 다른 인터페이스를 상속할 수 있다. 
	 *  - 인터페이스는 클래스와 달리 다중 상속을 허용한다. 
	 * 	 - 하위 인터페이스를 구현하는 클래스는 하위 인터페이스의 메소드 뿐만 아니라 상위 인터페이스의 모든 추상메소드에 대한 실체메소드를 가지고 있어야 한다. 
	 * 	 - 즉, InterfaceC를 구현하는 클래스는 InterfaceC의 상위 인터페이스인 InterfaceA, IntefaceB의 추상메소드를 모두 overriding 해야한다.
	 */
	public void methodC();

} // end interface