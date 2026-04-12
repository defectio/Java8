package chapter08_Interface.sec05_Polymorphism.part06_Instaceof;

public class Driver {
	
	/**
	 * 매개변수(인터페이스 변수)를 무조건 Bus로 casting하는 메소드
	 * 		-> 오류 발생 가능성 있음
	 * @param vehicle
	 */
	public void drive1(Vehicle vehicle) {
		// 매개변수가 Bus 타입이 아니라 Taxi 타입이라면 ClassCastException 오류 발생
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
		vehicle.run();
	}
	
	/**
	 * 강제타입변환(casting)이 필요할 경우 instanceof 연산자로 어떤 객체인지 확인하고 안전하게 casting 해야 한다. 
	 */
	public void drive2(Vehicle vehicle) {
		// 매개변수(인터페이스 변수)가 Bus의 instance 일 경우에만 Bus타입으로 casting
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
	
} //end class