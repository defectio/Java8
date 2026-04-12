package chapter08_Interface.sec07_Default_Method_Expansion.part01_Necessity;

public class MyClassB implements MyInterface {
	
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	/**
	 * [디폴트 메소드의 재정의]
	 *  디폴트 메소드는 인터페이스의 메소드를 그대로 사용해도 되고, 필요에 따라 구현 클래스에서 재정의 해서 사용해도 된다. 
	 */
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
	
} //end class
