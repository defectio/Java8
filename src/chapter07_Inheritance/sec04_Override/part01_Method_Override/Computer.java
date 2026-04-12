package chapter07_Inheritance.sec04_Override.part01_Method_Override;

public class Computer extends Calculator{
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
	 * 파이의 값을 정확하게 하여 원의 넓이를 구하도록 재정의
	 */
	@Override
	double areaCircle(double r) {
	System.out.println("[Computer(자식) 객체의 재정의된 areaCircle() 실행]");
		return Math.PI * r * r;
	}
	
}
