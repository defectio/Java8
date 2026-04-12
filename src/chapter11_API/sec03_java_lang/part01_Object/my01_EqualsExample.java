package chapter11_API.sec03_java_lang.part01_Object;

public class my01_EqualsExample {
	/**
	 * [Object 클래스]
	 *   - 자바에서 상속받지 않은 모든 클래스들은 java.lang.Objet 클래스를 암시적으로 상속받는다.
	 *   	즉, 자바의 모든 클래스는 Object 클래스의 자식이거나 자손클래스이다. Object는 자바의 최상위 부모 클래스에 해당한다.
	 */
	
	// 중첩 클래스
	public class Member {
		public String id;
		
		public Member(String id) {
			this.id = id;
		}
		
		/**
		 * [equals() 메소드]
		 * 	 - public boolean equals(Object object) { ... } : 매개타입이 Object(최상위 타입)이므로 자바의 모든 객체가 대입될 수 있다.(자동타입변환)
		 * 	 - Object 클래스의 equals() 메소드는 비교연산자인 == 와 동일한 결과를 리턴한다.(동일객체면 true, 아니면 false)
		 * 		즉, 동일한 객체인지 아닌지 비교한다.(객체의 주소지 비교)
		 */
		
		/**
		 * 객체의 메모리 번지수가 다르더라도 id가 같으면 true를 리턴하도록 재정의
		 */
		@Override
		public boolean equals(Object obj) {
			//obj(매개값)은 Object타입으로 자동 타입변환 되기 때문에, 원래 자신의 타입이기도 하면서, Object(부모)의 타입이기도 하다.
//			System.out.println(obj instanceof Object);		//true
//			System.out.println(obj instanceof Member); 	//true

			/**
			 * [1] 매개값(비교객체)이 기준 객체와 동일한 타입의 객체인지 먼저 확인해야 한다.
			 *   - Object 타입의 매개변수는 모든 객체가 매개값으로 제공될 수 있기 때문
			 */
			if(obj instanceof Member) {
				/**
				 * [2] 비교 객체의 동일성 정의
				 *   - (비교 객체가 동일한 타입이라면) 기준 객체 타입으로 강제 타입 변환해서 모든 필드값이 동일한지 검사.
				 *   - obj는 최상위 부모타입인 Object 타입으로 자동 타입변환 되어 있다. 즉, Object의 필드와 메소드만 사용 가능하다.
				 *   - Member(자식)의 필드에 접근해서 값을 비교하려면 Member로 casting 해야한다.
				 */
				Member mem = (Member) obj;
				
				// String의 equals() 메소드 -> 객체에 저장된 값 비교
				if (this.id.equals(mem.id)) { 
					// 호출한 객체의 id(필드)와 매개값의 id(필드) 비교
					return true;
				}
			}
			return false;
		} 
		
	}//end Member class
	
	public static void main(String[] args) {
		// 외부 클래스 생성
		my01_EqualsExample ex = new my01_EqualsExample();
		
		// 중첩 클래스 생성 -> 외부 클래스로 접근
		Member obj1 = ex.new Member("blue");
		Member obj2 = ex.new Member("blue");
		Member obj3 = ex.new Member("red");
		
		// cf. new 연산자로 Member 객체를 생성했기 때문에 equals() 메소드가 재정의 되어있더라도 서로 다른 객체의 주소값이 저장되어 있다.
		System.out.println("[참조하는 객체의 메모리 번지]");
		System.out.println("obj1의 번지 : "+obj1);
		System.out.println("obj2의 번지 : "+obj2);
		System.out.println("obj3의 번지 : "+obj3);
		System.out.println();
		
		/**
		 *  Object 클래스의 equals() 메소드 사용 
		 *    - 객체의 물리적 주소값 비교(메모리 번지수 비교) 
		 *  
		 *    Member obj1 = ex.new Member("blue");
		 *    Member obj2 = ex.new Member("blue");
		 *    Member obj3 = ex.new Member("red");
		 */
		System.out.println("[객체의 주소값 비교]");
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 객체를 참조한다.");
		} else {
			System.out.println("obj1과 obj2는 서로 다른 객체를 참조한다.");
		}
		
		if(obj2 == obj3) {
			System.out.println("obj2와 obj3는 같은 객체를 참조한다.");
		} else {
			System.out.println("obj2와 obj3는 서로 다른 객체를 참조한다.");
		}
		System.out.println();
		
		
		/**
		 * [논리적 동등 비교]
		 *   - 논리적으로 동등하면 true를 리턴하도록 equals() 메소드 재정의 : id 값이 같으면 true 리턴(but, 주소값은 다름)
		 *   - equals() 메소드를 재정의 하지 않았다면 Object의 equals() 메소드(-> 주소값 비교)를 호출 한다.
		 *   
		 *    Member obj1 = ex.new Member("blue");
		 *    Member obj2 = ex.new Member("blue");
		 *    Member obj3 = ex.new Member("red");
		 */

		System.out.println("[객체의 논리적 동등 비교]");
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 논리적으로 동등하다.");
		} else {
			System.out.println("obj1과 obj2는 논리적으로 동등하지 않다.");
		}
		
		if(obj2.equals(obj3)) {
			System.out.println("obj2와 obj3는 논리적으로 동등하다.");
		} else {
			System.out.println("obj2와 obj3는 논리적으로 동등하지 않다.");
		}
		
	} //end main

} //end class
