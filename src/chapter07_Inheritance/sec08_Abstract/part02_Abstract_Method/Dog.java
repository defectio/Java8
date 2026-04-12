package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Method;

public class Dog extends Animal {
	public Dog(String kind) {
		/**
		 * 부모 생성자를 호출하여 부모 필드 초기화
		 */
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	/**
	 * 추상클래스의 메소드를 재정의해서 사용할 수 있다.
	 */
	@Override
	public void breathe() {
		System.out.println("개가 숨을 쉽니다.");
	}
}