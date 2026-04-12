package chapter09_Nested.sec05_Anonymous.part01_Anonymous_Extends;

public class Anonymous {
	/**
	 * [익명 객체(Anonymous)]
	 * 	 - 익명 객체는 이름 없는 객체를 말한다. 익명 객체는 단독으로 생성할 수 없고 클래스를 상속하거나 인터페이스를 구현해야만 생성할 수 있다.
	 *  - 익명 객체는 (1)필드의 초기값, (2)로컬 변수의 초기값, (3)메소드의 매개값으로 주로 대입된다.
	 *  - 자식 클래스가 재사용되지 않고, 오로지 해당 필드와 변수의 초기값으로만 사용할 경우라면 익명 자식 객체를 생성해서 초기값으로 대입하는 것이 좋은 방법이다.
	 *  
	 *  [선언 방법]
	 *  부모클래스 변수 = new 부모클래스(매개값1, .. ) {
	 *  		필드 	(o)
	 *  		메소드		(o)
	 *  		부모메소드 재정의   (o)
	 *  		생성자 (x)
	 *  };
	 *  (1) 부모클래스(매개값1, ..) : 부모 생성자의 매개변수에 맞는 부모 생성자를 호출한다. -> 부모클래스를 상속해서
	 *  (2) { ...중괄호 블록... } : 중괄호 {} 와 같은 자식 클래스를 선언해라
	 *  (3) new : (2)에서 선언한 자식클래스를 객체로 생성해라!!
	 *  즉, 부모클래스를 상속한 익명자식객체가 생성된다.
	 */
	
	// [1] 필드 초기값으로 대입
	Person field = new Person() {
		/**
		 * 익명 자식 객체에 새롭게 정의된 필드와 메소드는 익명 자식 객체 내부에서만 사용되고, 외부에서는 필드와 메소드에 접근할 수 없다.
		 * 즉, childField, work() 메소드는 외부에서 접근 불가능
		 */
		int childField = 1;
		
		public void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			//익명 자식 객체에 선언된 필드와 메소드는 재정의한 메소드 내에서 사용 가능 
			childField = 10;
			work();
		}
	};

	
	public void method() {
		/**
		 * 익명 자식 객체에 새롭게 정의된 필드와 메소드는 익명 자식 객체 내부에서만 사용되고, 외부에서는 필드와 메소드에 접근할 수 없다.
		 */
		// field.childField = 10;
		// field.work();
		
		// 재정의한 메소드는 호출 가능 
		field.wake();
	}
	
	public void method1() {
		// [2] 메소드 내 로컬 변수의 초기값으로 대입
		Person localVar = new Person() {	
			public void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();		//로컬 변수 사용
		
		/**
		 * 익명 자식 객체를 부모 타입에 대입 -> 자동타입변환(자식에만 있는 메소드 사용불가, 재정의 메소드는 사용 가능)
		 */
		// localVar.walk(); -> 익명 객체 외부에서는 사용 불가. 내부에서는 사용 가능	
		// The method walk() is undefined for the type Person : 부모클래스에 없는 메소드라 사용불가
	}
	
	/**
	 * 매개변수의 wake() 메소드가 호출됨. 즉, 익명 자식 객체의 wake() 메소드 호출
	 * @param person
	 */
	public void method2(Person person) {
		person.wake();
	}
	
} //end class