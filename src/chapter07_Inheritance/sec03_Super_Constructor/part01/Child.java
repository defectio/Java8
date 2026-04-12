package chapter07_Inheritance.sec03_Super_Constructor.part01;

public class Child extends Parent {

	public Child() {
		/**
		 * [부모 객체를 생성하기 위해 부모 생성자를 어디서 호출한 것일까?]
		 *   - 부모 생성자는 자식 생성자의 맨 첫 줄에서 호출된다
		 * 	 - 자식 생성자에서 부모의 생성자 명시적으로 호출하지 않으면(super() 로 부모 생성자를 호출하지 않더라도)
		 *     "자동"으로 컴파일러에 의해 부모의 기본 생성자를 호출한다.
		 */
		// super();		
		// 부모의 기본 생성자를 명시적으로 호출하지 않더라도, 컴파일러에 의해 자동으로 부모 기본생성자가 호출된다.
		System.out.println("자식 생성자 호출 -> 자식 객체 생성");

	}
}
