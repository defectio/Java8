package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Class;

public class PhoneExample {
	public static void main(String[] args) {
		/**
		 *  추상클래스는 직접 생성할 수 없다.
		 *    - 컴파일 에러 발생 
		 */
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("레오");
		System.out.println("소유자 : "+smartPhone.owner);
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		System.out.println();
		
		/**
		 * 부모 타입으로 자동타입변환
		 *   - 부모 클래스에서는 자식에만 있는 필드, 메소드 호출 불가능
		 */
		Phone phone = new SmartPhone("선샤인");	
		System.out.println("소유자 : "+phone.owner);
		phone.turnOn();
//		phone.internetSearch();		//자식 클래스에만 있는 메소드 호출불가
		phone.turnOff();
	}
	
}
