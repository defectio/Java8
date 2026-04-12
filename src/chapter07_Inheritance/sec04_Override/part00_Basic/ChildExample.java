package chapter07_Inheritance.sec04_Override.part00_Basic;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();	// 자식 객체에 method1()이 정의된 것이 없으므로 부모의 method1()이 호출됨
		child.method2();	// 자식 객체에 overriding된 method2()가 있으므로 부모의 method2()는 숨겨지고, 자식의 method2()가 호출됨
		child.method3();	// 자식 객체에만 있는 method3()가 호출됨.
		System.out.println();
		
		////////////////////////////////////////////////////
		
		Parent parent = new Parent();
		parent.method1();	//부모의 메소드만 사용 가능
		parent.method2();	//부모의 메소드만 사용 가능
		parent.method4();	//부모의 메소드만 사용 가능
		
		//부모 객체를 참조하는 변수는 자식 클래스에 선언된 멤버(필드, 메소드)에 접근 불가능 -> 컴파일 에러
		// parent.method3();  // The method method3() is undefined for the type Parent
	}

}