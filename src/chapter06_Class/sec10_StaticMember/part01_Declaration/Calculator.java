package chapter06_Class.sec10_StaticMember.part01_Declaration;

public class Calculator {
	/*
	 * [정적 멤버] : 정적 필드, 정적 메소드
	 *  - 정적 멤버는 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다.
	 *  - 인스턴스멤버와 달리 객체를 생성하지 않고, 클래스로 직접 접근해서 사용가능하다.
	 *  - 정적 멤버는 클래스에 고정된 멤버이므로 클래스 로더가 클래스(바이트코드)를 로딩해서 메소드 메모리 영역에 적재할 때 클래스별로 관리된다.
	 *     따라서, 클래스가 메모리로 로딩이 끝나면 바로 사용할 수 있다.
	 *  - 객체마다 개별적으로 가지고 있어야 할 데이터 : 인스턴스 필드
     *  - 객체마다 가지고 있을 필요성이 없는 공용적인 데이터 : 정적 필드
     *  - 인스턴스 필드로 실행해야 하는 메소드 : 인스턴스 메소드
     *  - 인스턴스 필드를 이용하지 않고 실행하는 메소드 : 정적 메소드
	 */
	
	//인스턴스 필드
	public String color;

	//인스턴스 메소드 : 인스턴스 필드(color)를 사용함.
	public void setColor(String color) {
		this.color = color;
		//정적 멤버를 사용할 수는 있음.
	}
	
	//정적 필드는 필드 선언과 동시에 초기값을 주는 것이 보통이다(권장)
	public static double pi = 3.14159;
	
	//정적 메소드 : 인스턴스 필드를 사용하지 않음
	//인스턴스 필드를 사용하지 않고, 외부에서 주어지는 매개변수로 메소드를 실행하므로, 정적 메소드로 선언하는 것이 좋다.
	public static int plus(int x, int y) {
		//인스턴스 멤버 사용 불가능!!
		//color = "black"; 	//Cannot make a static reference to the non-static field color
		//setColor("블랙");	//Cannot make a static reference to the non-static method setColor(String) from the type Calculator
		return x + y;
	}
	public static int minus(int x, int y) {
		return x - y;
	}
	
} //end class