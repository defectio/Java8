package chapter08_Interface.sec07_Default_Method_Expansion.part02_Extends;

public interface ChildInterface1 extends ParentInterface {
	//ChildInterface1를 구현하는 클래스는 method1(부모인터페이스), methodA(자식인터페이스)의 실체메소드를 가지고 있어야한다.
	//구현 객체를 통해 부모인터페이스의 디폴트메소드인 method2를 호출할 수 있다.
	
	/**
     * [부모 인터페이스의 디폴트 메소드] -> 자식 인터페이스에서 디폴트 메소드를 활용하는 방법
     * 		(1) 디폴트 메소드를 단순히 상속 받는다.
     */
	
	//추상메소드 선언
	public void methodA();
	
} //end interface
