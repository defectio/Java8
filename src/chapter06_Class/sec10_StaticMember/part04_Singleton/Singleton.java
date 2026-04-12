package chapter06_Class.sec10_StaticMember.part04_Singleton;

public class Singleton {
	/*
	 * [싱글톤(Singleton)]
	 *  - 단 하나의 객체만 만들도록 보장해야 하는 경우, 단 하나만 생성된다고 해서 이 객체를 싱글톤(Singleton)이라고 한다.
	 *  - 싱글톤 객체를 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다.
	 *  - 생성자를 외부에서 호출할 수 없도록 하려면 생성자를 private으로 선언 해야 한다.
	 */
	
	//싱글톤 객체가 담긴 정적 필드
	//[1] 객체 자신을 private static으로 생성함.(외부에서 접근 불가 & 정적)
	//클래스 로더가 클래스(바이트 코드)를 로딩해서 메모링 영역에 적재할 때 클래스 별로 관리된다. 따라서 클래스의 로딩이 끝나면 바로 사용할 수 있다.
	//즉, 클래스가 로딩이 되면 Singleton 클래스를 인스턴스화해서 객체로 생성하고, 정적 필드에 담는다.
	private static Singleton singleton = new Singleton();	
	
	//private 생성자 -> 이 클래스의 외부에서 생성을 못하도록 막는다.(단 하나만 존재해야 하므로)
	private Singleton() {
		System.out.println("싱글톤 객체가 생성됨");
	}
	
	//정적 메소드(정적 필드를 사용하기 때문에 static 선언)
	public static Singleton getInstance() {
		//private static으로 생성된 singleton(싱글톤 객체)가 리턴됨.
		return singleton;
	}
	//즉, Singleton 클래스는 단 하나만의 객체를 생성하고, 오직 getInstance() 정적 메소드를 통해서 단 하나의 객체를 리턴한다.
	
} //end class
