package chapter08_Interface.sec07_Default_Method_Expansion.part02_Extends;

public interface ChildInterface3 extends ParentInterface {
	//ChildInterface3를 구현하는 클래스는 method1(부모인터페이스), methodC(자식인터페이스)의 실체메소드를 가지고 있어야한다.
	//그리고 자식인터페이스에서 추상메소드로 재선언한 method2(디폴트메소드)의 실체메소드를 가지고 있어야 한다.
	
	/**
     * [부모 인터페이스의 디폴트 메소드] -> 자식 인터페이스에서 디폴트 메소드를 활용하는 방법
     * 		(3) 디폴트 메소드를 추상메소드로 재선언한다. -> 구현 클래스에서 실체메소드를 가지고 있어야 한다.
     */
	@Override 
	public void method2();
	
	//추상메소드 선언
	public void methodC();
	
} //end interface