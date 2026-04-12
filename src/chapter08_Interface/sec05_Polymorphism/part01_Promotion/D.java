package chapter08_Interface.sec05_Polymorphism.part01_Promotion;

//인터페이스A를 구현한 B클래스를 상속한 D클래스
public class D extends B {

	@Override
	public void method() {
		System.out.println("구현객체 B의 메소드를 재정의한 자식 클래스 D의 메소드");
	}

} // end class