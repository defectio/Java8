package chapter07_Inheritance.sec07_Polymorphism.part04_Method_Polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		Driver driver = new Driver();
		driver.drive(vehicle);
		
		/**
		 * 메소드의 매개변수로 Vehicle의 자식인 Bus가 들어온다.
		 * 매개변수 자동 타입 변환 -> Bus 객체의 오버라이딩된 drive() 메소드 호출
		 */
		driver.drive(new Bus());
		
		/**
		 * 메소드의 매개변수로 Vehicle의 자식인 Taxi가 들어온다.
		 * 매개변수 자동 타입 변환 -> Taxi 객체의 오버라이딩된 drive() 메소드 호출
		 */
		driver.drive(new Taxi());
	}

} //end class