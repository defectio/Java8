package chapter13_Generic.sec05_BoundedTypeParameter.part02;

public class Example {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		NotChild n1 = new NotChild();
		
		//컴파일시 강한 타입 체크 -> 매개변수 타입에 Parent 타입의 객체 또는 Parent를 상속한 객체만 들어올 수 있다.
		//Util.testMethod(p1, n1); 	
		Util.testMethod(p1, c1);
		
	} //end main

} //end class
