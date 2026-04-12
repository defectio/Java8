package chapter08_Interface.sec07_Default_Method_Expansion.part02_Extends;

public interface ChildInterface2 extends ParentInterface {
	//ChildInterface2를 구현하는 클래스는 method1(부모인터페이스), methodB(자식인터페이스)의 실체메소드를 가지고 있어야한다.
	//구현 객체를 통해 자식인터페이스에서 재정의한 method2(디폴트메소드)를 호출할 수 있다.
	
	/**
     * [부모 인터페이스의 디폴트 메소드] -> 자식 인터페이스에서 디폴트 메소드를 활용하는 방법
     * 		(2) 디폴트 메소드를 재정의해서 실행내용을 변경한다.
     */
	@Override
	public default void method2() {
		System.out.println("ChildInterface2's overriding default method2");
	}
	
	//추상메소드 선언
	public void methodB();
	
} //end interface
