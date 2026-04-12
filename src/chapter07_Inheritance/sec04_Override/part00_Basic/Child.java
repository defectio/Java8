package chapter07_Inheritance.sec04_Override.part00_Basic;

public class Child extends Parent{ 

	/**
	 * [메소드 overriding]
	 *   - 메소드 오버라이딩은 상속된 메소드의 내용이 자식 클래스에 맞지 않을 경우, 자식클래스에서 동일한 메소드를 재정의 하는 것을 말한다.
	 *   - 메소드가 오버라이딩 되었다면, 부모 객체의 메소드는 숨겨지기 때문에, 자식 객체에서 메소드를 호출하면 오버라이딩된 자식 메소드가 호출된다.
	 *   - 메소드 오버라이딩 규칙
	 *     (1) 부모의 메소드와 동일한 시그너처(리턴타입, 메소드 이름, 매개 변수 리스트)를 가져야 한다.
	 *     (2) 접근 제한을 더 강하게 오버라이딩할 수 없다.
	 *     (3) 새로운 예외(Exception)를 throws 할 수 없다.
	 */
	
	/**
	 * 어노테이션은 생략해도 좋으나, 이것을 붙여주게 되면 method2() 메소드가 정확히 오버라이딩된 것인지 
	 * 컴파일러가 체크 하기 때문에 개발자의 실수를 줄여 준다.
	 */
	@Override
	public void method2() {
		System.out.println("오버라이딩된 자식의 method2() 호출");
	}
	
	public void method3() {
		System.out.println("자식에만 선언된 method3() 호출");
	}
	
	/**
	 * 컴파일 에러 : Cannot reduce the visibility of the inherited method from Parent
	 *   -> 오버라이딩된 메소드는 부모 메소드의 접근제한 보다 강한 접근 제한을 가질 수 없다. 
	 */
//	@Override
//	void method4() {
//		System.out.println("자식의 method4() 호출");
//	}
	
}
