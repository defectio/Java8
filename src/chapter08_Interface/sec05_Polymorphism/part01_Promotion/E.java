package chapter08_Interface.sec05_Polymorphism.part01_Promotion;

//인터페이스A를 구현한 C클래스를 상속한 E클래스
public class E extends C {

	@Override
	public void method() {
		System.out.println("구현객체 C의 메소드를 재정의한 자식 클래스 E의 메소드");
	}

} // end class