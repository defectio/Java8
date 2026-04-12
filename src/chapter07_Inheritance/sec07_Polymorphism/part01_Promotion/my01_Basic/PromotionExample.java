package chapter07_Inheritance.sec07_Polymorphism.part01_Promotion.my01_Basic;

public class PromotionExample {
	/**
	 * [다형성]
	 *  - 다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 말한다.
	 *  - 다형성은 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있도록 해준다.
	 *  - 자바에서는 다형성을 위해 부모 클래스로 타입 변환을 허용한다. 즉, 부모 타입에 모든 자식 객체가 대입될 수 있다.
	 */
	
	/**
	 * [자동 타입 변환(Promotion)]
	 *  - 클래스의 타입 변환은 상속 관계에 있는 클래스 사이에서만 발생한다. 
	 *  - 부모 타입에 모든 자식 객체가 대입 될 수 있다. 자식 타입은 부모 타입으로 자동 타입 변환이 가능하다.
	 *     ex) 부모클래스 변수 = new 자식클래스();
	 *  - 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급될 수 있다.
	 */
	
	/** 
	 * 상속관계 -> 바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환이 일어날 수 있다.
	 *  	A
	 *  B		C
	 *  D		E
	 */
	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();		
		
		/**
		 * 자동타입변환 : 최상위 클래스에 자식객체 대입
		 */
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		/**
		 * 자동타입변환 : 부모클래스에 자식객체 대입
		 */
		B b1 = d;
		C c1 = e;

		/**
		 * 컴파일에러 : 상속 관계에 있지 않은 클래스 사이에는 자동 타입변환이 발생하지 않는다.
		 *   - Type mismatch: cannot convert from E to B
		 *   - Type mismatch: cannot convert from E to B
		 */
		// B b3 = e;
		// C c2 = d;
	}
	
}