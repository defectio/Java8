package chapter06_Class.sec13_Modifier.part02_Constructor.pack01;

public class Apple {
	/*
	 * [생성자 접근제한]
	 *  - 객체를 생성하기 위해서는 new 연산자로 생성자를 호출해야 한다.
	 *     하지만, 생성자가 어떤 접근 제한을 갖느냐에 따라 호출 가능 여부가 결정된다.
	 *  - 자동으로 추가되는 기본 생성자의 접근제한은 클래스 접근제한과 동일하다.
	 *  - public, protected, default, private
	 */

	/* 필드 */
	//클래스 내부 에서는 Apple의 모든 생성자 호출 가능
	Apple a1 = new Apple(true);
	Apple a2 = new Apple(1);
	Apple a3 = new Apple("사과");
	
	/* 생성자 */
	//자동으로 추가되는 기본 생성자의 접근제한은 클래스 접근 제한과 동일함.
	
	//public 생성자
	public Apple(boolean b) {}
	
	//default 생성자(생성자의 접근 제한 생략 시)
	//동일 패키지 내의 외부 클래스에서만 호출 가능
	Apple(int b) {}
	
	//private 생성자
	//내부 클래스에서만 호출 가능
	private Apple(String s) {}
	
} //end class
