package chapter07_Inheritance.sec06_Protected.pack02;

public class C {

	/**
	 * A클래스와 다른 패키지에 있는 C클래스
	 */
	public void method() {
		// A클래스를 상속하지 않았으므로 A의 protected 멤버를 사용 할 수 없음.
		// 컴파일 에러 : The constructor A() is not visible
		// A a = new A(); //A의 생성자가 protected 여서 A를 상속하지 않으면 A를 객체로 생성할 수 없음.

		// [1] A를 생성할 수 없으므로 당연히 A의 필드와 메소드에 접근할 수 없음.
		// [2] field, method() 는 protected 여서 상속받지 않은 클래스에서 접근 불가
		// a.field;
		// a.method();

		// A클래스의 필드, 메소드를 static으로 선언하더라도 컴파일 오류 발생
		// The field A.field is not visible
		// The method method() from the type A is not visible
		// A.field = "protected final Static";
		// A.method();
	}

}