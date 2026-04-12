package chapter07_Inheritance.sec05_Final.part02_Final_Method;

public class SportsCar extends Car {
	
	@Override
	public void speedUp() {
		speed += 10;
	}

	/**
	 * final 키워드는 해당 선언이 최종 상태이고, 결코 수정될 수 없음을 뜻한다.
	 *  - Cannot override the final method from Car
	 */
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}

}