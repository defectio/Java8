package chapter08_Interface.sec05_Polymorphism.part02_Field_Polymorphism;

public class HankookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}

} // end class