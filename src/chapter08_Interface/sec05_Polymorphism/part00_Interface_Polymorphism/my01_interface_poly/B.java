package chapter08_Interface.sec05_Polymorphism.part00_Interface_Polymorphism.my01_interface_poly;

public class B implements InterfaceA {

	@Override
	public void method1() {
		System.out.println("B의 메소드_a");
	}

	@Override
	public void method2() {
		System.out.println("B의 메소드_b");
	}

	@Override
	public void method3() {
		System.out.println("B의 메소드_c");
	}

} // end class