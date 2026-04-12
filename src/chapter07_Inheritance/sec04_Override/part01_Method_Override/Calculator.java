package chapter07_Inheritance.sec04_Override.part01_Method_Override;

public class Calculator {
	/**
	 * 부모 클래스의 모든 메소드가 자식 클래스에 맞게 설계되어 있다면 가장 이상적인 상속이지만,
	 * 어떤 메소드는 자식 클래스가 사용하기에 적합하지 않을 수도 있다.
	 * 이 경우 상속된 일부 메소드는 자식 클래스에서 다시 수정해서 사용해야 한다. -> 오버라이딩
	 */
	double areaCircle(double r) {
		System.out.println("[Calculator(부모) 객체의 areaCircle() 실행]");
		return 3.14159 * r * r;
	}
	
}
