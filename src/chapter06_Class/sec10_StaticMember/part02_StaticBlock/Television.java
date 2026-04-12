package chapter06_Class.sec10_StaticMember.part02_StaticBlock;

public class Television {
	/*
	 * [정적 초기화 블록]
	 *  - 정적 필드는 필드 선언과 동시에 초기값을 주는 것이 보통이다.
	 *  - 인스턴스 필드는 생성자에서 초기화하지만, 정적필드는 객체 생성 없이도 사용해야 하므로 생성자에서 초기화 작업을 할 수 없다.
	 *  - 정적 필드의 복잡한 초기화 작업을 위해서 정적블록(static block)을 제공한다.
	 */
	
	/* 정적 필드 선언 방법 */
	//[1] 선언과 동시에 초기화
	public static String company = "Samsung";
	public static String model = "LCD";
	
	//[2] static block 에서 초기화
	public static String info;
	
	/*
	 * [정적 초기화 블록]
	 *  - 클래스가 메모리로 로딩될 때 자동으로 실행된다.
	 *  - 정적 블록은 클래스 내부에 여러개가 선언되어도 상관없다. 클래스가 메모리로 로딩될 때 선언된 순서대로 실행된다.
	 */
	static {
		info = company + "-" + model;
	}

} //end class