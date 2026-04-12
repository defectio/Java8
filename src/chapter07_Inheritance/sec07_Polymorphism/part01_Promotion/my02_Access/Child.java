package chapter07_Inheritance.sec07_Polymorphism.part01_Promotion.my02_Access;

public class Child extends Parent {
	
	/**
	 * Parent 클래스의 method2()를 재정의
	 */
	@Override
	public void method2() {
		super.method2();	//super 키워드로 부모 메소드 호출 가능
		System.out.println("Child-method2()");
	}
	
	/**
	 * Child 클래스에만 선언된 method3()
	 */
	public void method3() {
		System.out.println("Child-method3()");
	}
	
}