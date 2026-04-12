package chapter08_Interface.sec05_Polymorphism.part06_Instaceof;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		//구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive1(bus);
		
		//ClassCastException 발생 : Taxi객체를 Bus타입으로 casting 하려 해서 예외 발생
		//driver.drive1(taxi);		//강제타입변환을 해야 할 경우 타입을 확인 후에 안전하게 타입 변환 시켜야 한다.	
		
		System.out.println();
		
		driver.drive2(bus);
		driver.drive2(taxi);
		
	} //end main
	
} //end clas