package chapter13_Generic.sec05_BoundedTypeParameter.part02;

public class NotChild{

	String id = "not-child";
	int age = -1;
	
	public void method2() {
		System.out.println("child-method2 호출");
	}
	
	public void method3() {
		System.out.println("child-method3 호출");
	}
	
} //end class