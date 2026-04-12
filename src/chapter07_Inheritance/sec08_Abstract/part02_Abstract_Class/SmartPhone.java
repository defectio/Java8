package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Class;

/**
 * 추상클래스를 상속한 실체클래스
 * @author defec
 */
public class SmartPhone extends Phone {
	
	//생성자
	public SmartPhone(String owner) {
		/**
		 * 부모(Phone) 클래스의 생성자 호출 -> 필드를 초기화한다.
		 *   - Phone 클래스는 추상클래스이다. : 직접 객체를 생성하지 못하고, 자식 객체가 생성될 때 super()생성자로 추상클래스를 생성한다.
		 *   - 추상클래스는 new 연산자로 객체를 생성할 수는 없지만, 자식 클래스에서 super()로 부모 생성자 호출이 가능하다.
		 */
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
} // end class