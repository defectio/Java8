package chapter07_Inheritance.sec07_Polymorphism.part05_Casting;

public class ChildExample {
	public static void main(String[] args) {
		/**
		 *  Child 객체가 Parent 타입으로 자동 타입 변환
		 *   	-> 부모의 멤버들만 사용 가능 & 오버라이딩된 자식 메소드 사용 가능 
		 */
		Parent parent = new Child();
		//부모는 자식의 필드와 메소드를 사용할 수 없다.
		parent.field1 = "data1";		//부모 객체의 필드 사용 가능
		parent.method1();				//부모 객체의 메소드 사용 가능
		parent.method2();				//오버라이딩된 자식 객체의 메소드 사용 가능
		
		//parent.field2 = "data2";	//자식 객체에만 선언된 필드 사용 불가
		//parent.method3();			//자식 객체에만 선언된 메소드 사용 불가
		System.out.println();
		
		
		/**
		 *  [강제 타입 변환]
		 * 	  - 부모 타입을 자식 타입으로 변환 하는 것을 말한다. 그렇다고 해서 모든 부모 타입을 자식 클래스 타입으로 강제 변환할 수 있는 것은 아니다.
		 *   - 자식 타입이 부모 타입으로 자동 타입 변환된 객체만 강제 타입 변환될 수 있다.
		 *   - 자식 타입의 객체가 부모 타입으로 자동 타입 변환 되었다면, 부모 타입의 멤버만 사용할 수 있다는 제한이 따른다.
		 *     만약 자식 타입에만 선언된 멤버(필드, 메소드)를 꼭 사용 해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환한 다음 자식 멤버(필드, 메소드)를 사용하면 된다.
		 */
		
		/**
		 * 부모 타입을 자식 타입에 대입 -> 강제 타입 변환
		 *   - 자식타입 변수 = (자식타입) 부모변수;
		 */
		Child child = (Child) parent;
		//자식은 부모의 필드, 메소드를 모두 사용할 수 있다.
		child.field2 = "yyy";  	//자식만의 필드 사용 가능
		child.method3();     	//자식만의 메소드 사용 가능
		
		child.field1 = "xxx";	//부모의 필드 사용 가능
		child.method1();   		//부모의 메소드 사용 가능
		child.method2(); 		//오버라이딩된 자식 메소드 사용 가능
		
		/**
		 * 자식타입으로 자동 타입변환 되지 않은 부모 객체는 자식 타입으로 강제 타입 변환 할 수 없다. 
		 */
		//Child child2 = (Child) new Parent();  // ClassCastException 발생
	}

} //end class