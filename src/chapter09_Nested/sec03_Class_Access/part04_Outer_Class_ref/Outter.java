package chapter09_Nested.sec03_Class_Access.part04_Outer_Class_ref;

public class Outter {
	//인스턴스 필드
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	/**
	 *  중첩 클래스(인스턴스 멤버 클래스)
	 *   - 중첩클래스에 접근하려먼 Outter 객체를 생성 -> Nested 객체 생성을 통해서 접근한다 
	 */  
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		/**
		 * [중첩 클래스에서 this]
		 *  - 중첩 클래스에서 this 키워드를 사용하면 바깥 클래스의 객체 참조가 아니라, 중첩 클래스의 객체 참조가 된다.
		 *  - this 키워드는 객체 자신의 참조이므로, 중첩 클래스(Nested)의 필드와 메소드가 호출된다.
		 */
		void print() {
			System.out.println("[중첩 클래스에서 this 키워드 사용]");
			System.out.println(this.field);		//Nested-field
			this.method();							//Nested-method

			System.out.println();
			/**
			 * 중첩클래스 내부에서 바깥 클래스의 객체 참조를 얻으러면?
			 *   - 바깥 클래스의 이름을 this 키워드 앞에 붙여주면 된다. -> "바깥클래스이름.this"
			 */
			System.out.println("[중첩 클래스에서 Outter 클래스의 this 키워드 사용]");
			System.out.println(Outter.this.field);	//Outter-field
			Outter.this.method();							//Outter-method
		}
	} //end class Nested

} //end class Outter