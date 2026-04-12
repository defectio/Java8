package chapter08_Interface.sec04_Use_Interface.part01_Abstract_Method;

/**
 * [Interface 사용 위치]
 * @author defec
 *
 */
public class WhereToUseInterface {

	/**
	 * 개발코드에서 인터페이스는 클래스의 필드, 생성자/메소드의 매개변수, 생성자/메소드의 로컬 변수로 사용될 수 있다.
	 */

	// 클래스의 필드
	RemoteControl rc = new Television();
	
	// 생성자의 로컬변수
	public WhereToUseInterface() {
		//로컬변수
		RemoteControl rc = new Television();
	}
	// 생성자의 매개변수 -> 인터페이스를 구현한 어떠한 객체든 대입이 가능하다
	public WhereToUseInterface(RemoteControl rc) {	
		this.rc = rc;
	}
	
	// 메소드의 로컬변수
	public void methodA() {
		//로컬변수
		RemoteControl rc = new Audio();
	}
	// 메소드의 매개변수 -> 인터페이스를 구현한 어떠한 객체든 대입이 가능하다.
	public void methodB(RemoteControl rc) {  
		/* 실행문 */
	}

} //end class