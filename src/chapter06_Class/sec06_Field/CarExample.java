package chapter06_Class.sec06_Field;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		
		System.out.println("제조회사 : "+car.company);
		System.out.println("모델명 : "+car.model);
		System.out.println("색깔 : "+car.color);
		System.out.println("최고속도 : "+car.maxSpeed);
		
		//필드를 초기화하지 않았기 때문에 기본값이 저장됨.
		System.out.println("속도 : "+car.speed);
		
		System.out.println("[최고 속도 변경]");
		car.maxSpeed = 400;  
		System.out.println("최고속도 : "+car.maxSpeed);
	
	} //end main

} //end class