package chapter07_Inheritance.sec03_Super_Constructor.part01;

public class Parent {
	
	/**
	 *  [부모 생성자 호출]
	 *    - 자식 객체를 생성하면, 내부적으로 부모 객체가 먼저 생성되고 자식 객체가 그 다음에 생성된다.
	 */
	public Parent() {
		System.out.println("부모 생성자 호출 -> 부모 객체 생성");
	}
	
}
