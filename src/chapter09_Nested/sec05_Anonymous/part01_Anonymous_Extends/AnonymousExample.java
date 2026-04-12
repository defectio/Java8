package chapter09_Nested.sec05_Anonymous.part01_Anonymous_Extends;

public class AnonymousExample {
	/**
	 * [익명 객체(Anonymous)]
	 * 	 - 익명 객체는 이름 없는 객체를 말한다. 익명 객체는 단독으로 생성할 수 업속 클래스를 상속하거나 인터페이스를 구현해야만 생성할 수 있다.
	 *  - 익명 객체는 필드의 초기값이나 로컬 변수의 초기값, 매개변수의 매개값으로 주로 대입된다.
	 */
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		/**
		 * 필드 초기값으로 대입된 익명 객체 사용
		 */
		System.out.println("[필드 초기값으로 대입된 익명 객체 사용]");
		anony.field.wake();
		
		// 익명 객체에 선언된 필드, 메소드 사용 불가
//		anony.field.chilldField = 10;
//		anony.field.work();
		System.out.println();
		
		
		/**
		 * 익명 자식 객체 로컬 변수 사용
		 */
		System.out.println("[익명 객체 로컬 변수 사용]");
		anony.method1();
		System.out.println();
		
		
		/**
		 * [3] 메소드 매개값으로 익명 자식 객체 대입
		 *  (매개변수 타입이 Person인 자리에 Person의 익명 자식 객체가 대입됨)
		 */
		System.out.println("[메소드 매개값으로 익명 자식 객체 대입]");
		anony.method2(new Person() {
			public void study() {
				System.out.println("공부합니다.");
			}

			@Override
			public void wake() {
				System.out.println("9시에 일어납니다.");
				study();
			}
		});
		
	} //end main
	
} //end class