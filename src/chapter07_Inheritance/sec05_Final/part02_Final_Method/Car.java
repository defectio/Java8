package chapter07_Inheritance.sec05_Final.part02_Final_Method;

public class Car {
	
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	/**
	 * final 메소드
	 *   - 자식 객체에서 overriding 할 수 없음
	 */
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
