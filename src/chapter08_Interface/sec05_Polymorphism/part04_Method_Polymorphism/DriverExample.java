package chapter08_Interface.sec05_Polymorphism.part04_Method_Polymorphism;

public class DriverExample {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		// 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		/**
		 * [매개변수의 다형성]
		 * 		(1) drive() 메소드의 매개변수는 인터페이스 타입이고
		 * 		(2) 매개변수에 인터페이스의 구현 객체를 대입 하면 구현 객체가 인터페이스 타입으로 자동타입변환 발생
		 * 		(3) 해당 구현 객체의 run() 메소드 실행
		 */
		driver.drive(bus);
		driver.drive(taxi);
		
	} //end main
	
} //end class