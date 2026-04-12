package chapter08_Interface.sec05_Polymorphism.part00_Interface_Polymorphism.my01_interface_poly;

public class A implements InterfaceA {

	@Override
	public void method1() {
		System.out.println("A의 메소드1");
	}

	@Override
	public void method2() {
		System.out.println("A의 메소드2");
	}

	@Override
	public void method3() {
		System.out.println("A의 메소드3");
	}

} // end class