package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Class;

/**
 * abstract 키워드 -> 추상클래스
 * @author defec
 */
public abstract class Phone {
	
	//필드
	public String owner;
	
	/**
	 * 추상클래스는 new 연산자로 직접 생성자를 호출할 수 없다.
	 * 하지만 자식 객체가 생성될 때 super(..)를 호출해서 추상클래스의 객체를 생성하므로 추상클래스도 생성자가 반드시 있어야 한다.
	 * 즉, 자식클래스에서 부모클래스를 호출해야하니까 생성자가 반드시 있어야 한다.
	 */
	//생성자
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

} //end class