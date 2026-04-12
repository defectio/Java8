package chapter09_Nested.sec05_Anonymous.part02_Anonymous_Implements.my01_Basic;

public class AnonymousExample {
	
	public static void main(String[] args) {
		//Anonymous 객체 생성
		Anonymous anony = new Anonymous();		
		
		//익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		System.out.println();
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		System.out.println();
		
		//[3] 메소드의 매개값으로 익명 구현 객체 대입
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		}); 
		
	} //end main
	
} //end class