package chapter08_Interface.sec06_Interface_Inheritance;

public class ImplementationC implements InterfaceC{

	/** 
	 *  - 하위 인터페이스를 구현하는 클래스는 하위 인터페이스의 메소드 뿐만 아니라 상위 인터페이스의 모든 추상메소드에 대한 실체메소드를 가지고 있어야 한다.
	 *  - 즉, InterfaceC를 구현하는 클래스는 InterfaceC의 상위 인터페이스인 InterfaceA, IntefaceB의 추상메소드를 모두 overriding 해야한다.
	 *  - Eclipse 에서는 상위 인터페이스의 추상메소드들을 오버라이딩 안했을 경우, 컴파일에러
	 */
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

} //end class