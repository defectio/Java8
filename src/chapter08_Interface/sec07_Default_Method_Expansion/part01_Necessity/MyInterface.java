package chapter08_Interface.sec07_Default_Method_Expansion.part01_Necessity;

public interface MyInterface {
	
	public void method1();
	
	/**
	 * [인터페이스에서 디폴트 메소드를 허용한 이유]
	 *    - 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해서이다.
	 *        -> 기존 인터페이스의 이름과 추상 메소도의 변경 없이 디폴트 메소드만 추가할 수 있기 때문에
	 *             이전에 개발한 구현 클래스를 그대로 사용할 수 있으면서 새롭게 개발하는 클래스는 디폴트 메소드를 활용할 수 있다.
	 *        
	 *        즉,  MyInterface에 method1()만 추상메소드로 선언해놓고, MyInterface를 구현한 MyClassA 객체를 사용 중이였다.
	 *        사용하다가 새로운 기능이 필요해서 method2()를 추상메소드로 선언하면 기존에 사용하던 MyClassA에 method2() 가 재정의 되어 있지 않아서 컴파일 오류 발생
	 */
	
	//디폴트 메소드는 인터페이스에 선언된 인스턴스 메소드 이기 때문에 구현 객체가 있어야 사용할 수 있다. 
	//  -> 선언은 인터페이스에서 하고, 사용은 구현객체를 통해서 한다.
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
	
} //end interface
