package chapter07_Inheritance.sec04_Override.part02_Super_Method;

public class SupersonicAirplane extends Airplane {
	//상수 : 공용성 & 불변성
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	/**
	 * 	[부모 메소드 호출(Super)]
	 *  - 자식클래스에서 부모클래스의 메소드를 오버라이딩하게되면, 부모클래스의 메소드는 숨겨지고 오버라이딩된 자식메소드만 사용된다.
	 *  - 그러나 자식클래스 내부에서 오버라이딩된 부모클래스의 메소드를 호출해야하는 상황이 발생한다면
	 *    명시적으로 super 키워드를 붙여서 부모메소드를 호출할 수 있다.
	 *  - super는 부모 객체를 참조하고 있기 때문에 부모 메소드에 직접 접근할 수 있다.
	 *     ex) super.부모메소드();
	 */
	
	/**
	 * flyMode에 따라 초음속 비행하거나, 일반 비행하도록 부모의 fly() 메소드를 재정의함
	 *   - 자식 클래스에서 오버라이딩 했으므로, 부모의 메소드에 직접 접근 불가능
	 *   -> super() 키워드로 부모객체를 참조하고, 부모 객체에 정의된 fly() 메소드를 호출한다.
	 */
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");			
		} else {
			// Airplane(부모) 객체의 fly() 메소드 호출
			super.fly();
		}
	}
	
}
