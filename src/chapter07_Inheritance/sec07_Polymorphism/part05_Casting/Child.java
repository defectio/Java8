package chapter07_Inheritance.sec07_Polymorphism.part05_Casting;

public class Child extends Parent {
	public String field2;

	@Override
	public void method2() {
		System.out.println("Overriding Child-method2()");
	}

	public void method3() {
		System.out.println("Child-method3()");
	}

} // end class