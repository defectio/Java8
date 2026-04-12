package chapter09_Nested.sec05_Anonymous.part02_Anonymous_Implements.my01_Basic;

public class Anonymous {
	
	/**
	 * [익명 객체(Anonymous)]
	 * 	 - 익명 객체는 이름 없는 객체를 말한다. 익명 객체는 단독으로 생성할 수 없고 클래스를 상속하거나 인터페이스를 구현해야만 생성할 수 있다.
	 *  - 익명 객체는 (1)필드의 초기값, (2)로컬 변수의 초기값, (3)메소드의 매개값으로 주로 대입된다.
	 *  - 자식 클래스가 재사용되지 않고, 오로지 해당 필드와 변수의 초기값으로만 사용할 경우라면 익명 자식 객체를 생성해서 초기값으로 대입하는 것이 좋은 방법이다.
	 *  
	 *  [선언 방법]
	 *  인터페이스 변수 = new 인터페이스() {
	 *  		인터페이스에 선언된 추상메소드 재정의(overriding)
	 *  		필드 		-> 거의 선언 안함
	 *  		메소드		-> 거의 선언 안함
	 *  		//필드, 메소드는 실체메소드에서만 사용 가능하다.
	 *  };
	 *  
	 *  (1) 인터페이스() {} : 인터페이스를 구현해서 {} 와 같은 클래스를 선언하고
	 *  (2) new : 이와 같은 클래스를 객체로 생성해라 -> 익명 구현 객체 생성
	 */
	 
	//[1] 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		//RemoteControl 인터페이스의 추상메소드를 모두 재정의 해야한다.
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	public void method1() {
		//[2] 로컬 변수 값으로 대입
		RemoteControl localVar = new RemoteControl() {
			//RemoteControl 인터페이스의 추상메소드를 모두 재정의 해야한다.
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//인터페이스 타입의 turnOn() 메소드가 호출됨. 
	//즉, 대입된 객체(구현 객체)에서 재정의한 실체메소드 호출
	public void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
} //end class