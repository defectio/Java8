package chapter07_Inheritance.sec06_Protected.pack01;

public class A {
	/** 
	 * [protected]
	 *   - 필드, 생성자, 메소드에 protected 접근 제한 부여 가능
	 *   - protected 접근 제한자는 같은 패키지의 클래스들 & 다른 패키지의 자식 클래스에서 접근 가능하다.
	 *     (같은 패키지의 모든 클래스들에서는 당연히 접근 가능, 다른 패키지라고 하더라도 상속받은 클래스라면 접근가능하다.)
	 */
	protected String field;
	
	protected A() {
		System.out.println("A has been called");
	}
	
	/**
	 * protected 메소드 -> 자식클래스에서 오버라이딩 가능
	 */
	protected void method() {
		System.out.println("A's protected method");
	}
	
}