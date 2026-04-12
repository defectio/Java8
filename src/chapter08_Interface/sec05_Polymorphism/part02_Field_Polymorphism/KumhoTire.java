package chapter08_Interface.sec05_Polymorphism.part02_Field_Polymorphism;

public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

} // end class