package chapter13_Generic.sec05_BoundedTypeParameter.part02;

public class Child extends Parent{

	//Child만의 필드
	String id = "child";
	int age = 11;
	
	//Parent의 method2를 재정의
	@Override
	public void method2() {
		System.out.println("child-method2 호출");
	}
	
	//Child만의 method3
	public void method3() {
		System.out.println("child-method3 호출");
	}
	
} //end class
