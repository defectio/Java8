package chapter08_Interface.sec05_Polymorphism.part01_Promotion;

//인터페이스A를 구현한 C클래스
public class C implements A {

	@Override
	public void method() {
		System.out.println("구현 객체 C의 메소드");
	}

} // end class