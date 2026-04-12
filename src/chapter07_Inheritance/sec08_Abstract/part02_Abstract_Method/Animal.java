package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Method;

public abstract class Animal {
	public String kind;
	
	public Animal() {}
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	/**
	 * [추상 메소드]
	 *  - 모든 실체들이 가지고 있는 메소드의 실행 내용이 동일하다면 추상클래스에 메소드를 작성하는 것이 좋을 것이다.
	 *    하지만 메소드의 선언만 통일화하고, 실행내용은 실체클래스마다 달라야 하는 경우가 있다.
	 *  - 추상메소드는 추상클래스에서만 선언할 수 있는데, 메소드의 선언부만 있고 메소드 실행내용은 중괄호 {}가 없는 메소드를 말한다.
	 *  - 추상클래스를 설계할 때, 하위클래스가 반드시 실행 내용을 채우도록 강요하고 싶은 메소드가 있을 경우, 해당 메소드를 추상메소드로 선언한다.
	 *     -> 자식클래스는 반드시 추상메소드를 overriding 해야하는데, 그렇지 않으면 컴파일 오류가 발생한다. 
	 */
	public abstract void sound();
}

