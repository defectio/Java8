package chapter07_Inheritance.sec06_Protected.pack02;

import chapter07_Inheritance.sec06_Protected.pack01.A;

/**
 * 다른 패키지의 A클래스를 상속한 D클래스
 *   - 자식클래스(D)에서는 A클래스의 protected 멤버에 접근 가능
 */
public class D extends A {

	public D() {
		// A a = new A();
		/**
		 * [protected 생성자]
		 *   - 생성자가 protected 이면 다른 패키지의 클래스에서 new 연산자를 직접 생성(호출)할 수 없다.
		 *  	-> 생성자가 protected로 선언되어 있기때문에 안됨. 다른 패키지 더라도 생성자가 public 이면 부모 생성자 호출 가능
		 *   - 대신에, 자식 클래스의 생성자에서 super() 키워드로로 부모의 protected 생성자를 호출할 수 있다. 
		 */
		
		/**
		 * 부모생성자 호출
		 *   - super()를 사용하지 않더라도, 컴파일러에 의해 자동으로 부모객체가 먼저 생성되고 나서 자식객체가 생성된다.
		 *   - 참고) chapter07_Inheritance.sec03_Super_Constructor
		 */
		// super(); 
		this.field = "value";
		this.method();
	}
	
	/**
	 * A클래스의 protected 메소드 override
	 */
	@Override
	protected void method() {
		System.out.println("Override A's protected method");
	}
	
	public static void main(String[] args) {
		D d = new D();
		
		System.out.println();
		
		System.out.println("field : "+d.field);
		d.method();
	}
	
}
