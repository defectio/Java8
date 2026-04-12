package chapter07_Inheritance.sec07_Polymorphism.part01_Promotion.my02_Access;

public class ChildExample {
	
	public static void main(String[] args) {
		/**
		 * 자식 객체를 부모 타입 변수에 대입 -> 자동 타입 변환
		 */
		Child child = new Child();
		Parent parent = child;

		/**
		 * [자동 타입 변환]
		 * 자동 타입 변환이 발생되면, 
		 *   (1) 부모 클래스에 있는 필드, 메소드만 사용 가능(자식에만 있는 자원 사용 불가)
		 *   (2) 단, 자식 클래스에 오버라이딩된 메소드가 있으면, 자식의 오버라이딩된 메소드가 호출된다. 
		 */
		System.out.println("[부모에만 있는 메소드 호출]");
		parent.method1();

		System.out.println();

		System.out.println("[재정의한 메소드 호출]");
		parent.method2();		

		/**
		 * 부모타입으로 자동타입변환 됐기 때문에, 자식에만 있는 메소드 호출 불가능
		 *   - 컴파일 에러 : The method method3() is undefined for the type Parent
		 */
		// parent.method3();
	}

}