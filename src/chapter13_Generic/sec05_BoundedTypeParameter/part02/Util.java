package chapter13_Generic.sec05_BoundedTypeParameter.part02;

public class Util {
	/*
	 * [제한된 타입 파라미터 <T extends 최상위타입> ] : 제네릭 메소드에서 사용
	 *  - 타입 파라미터에 지정 되는 구체적인 타입을 제한할 필요가 종종 있다.
	 *  - 예를 들어, 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 Number의 하위 타입(Byte, Short, Integer, Long, Double)의 인스턴스만 가져야 한다.
	 *  - 제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 키워드를 붙이고 상위 타입을 명시하면 된다.
	 *  - 상위 타입은 클래스 뿐만 아니라 인터페이스도 가능하다. 인터페이스라고 해서 implements를 사용하지 않는다.
	 */
	
	//제네릭 타입이 extends Parent 이므로 매개변수는 Parent 타입 또는 Parent의 하위 타입만 가능하다.
	//public static <T> void testMethod(T t1, T t2) {	//에서 타입 파라미터를 Parent 타입으로 제한 -> 매개변수는 Parent 타입 또는 Parent의 하위 타입만 가능하다
	public static <T extends Parent> void testMethod(T t1, T c1) {
		/*
		 * 메소드 중괄호 블록 내에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 멤버(필드, 메소드)로 제한된다.
		 * 하위 타입에만 있는 필드와 메소드는 사용할 수 없다. 즉, Parent의 멤버만 사용가능하다.
		 * 단, 상위 타입의 메소드가 하위 타입에서 오버라이딩 되어 있으면 하위 타입의 메소드가 호출 된다.
		 */	
		System.out.println("[t1의 필드, 메소드 사용 제한]");
		System.out.println("t1.name : "+t1.name);		//Parent의 필드만 사용 가능
		//System.out.println("c1.id : "+c1.id);				//Child의 필드 사용 불가
		t1.method1();		//Parent(상위 타입)의 메소드만 사용 가능
		t1.method2();		//Parent(상위 타입)의 메소드만 사용 가능
		//t1.method3();   	//Child(하위 타입)에만 있는 메소드 사용 불가
		System.out.println();
		
		System.out.println("[c1의 필드, 메소드 사용 제한]");
		System.out.println("c1.name : "+c1.name);    //Parent의 필드만 사용 가능
		//System.out.println("c1.id : "+c1.id);				//Child의 필드 사용 불가
		c1.method1();		//Parent(상위 타입)의 메소드만 사용 가능
		c1.method2();		//Child의 method2() 호출됨.
		//t2.method3();    //Child(하위 타입)에만 있는 메소드 사용 불가
		System.out.println();
		
		/* 하위 타입의 멤버(필드, 메소드)를 사용하고 싶을 경우 -> 강제타입변환 */
		//하위 타입으로 강제타입변환 했을 경우 -> 오버라이딩 한 것처럼 필드와 메소드를 사용함.
		System.out.println("[c1(Parnet)을 Child로 강제타입변환 후 필드, 메소드 사용]");
		if(c1 instanceof Parent) {	//매개변수 타입이 제한된 타입파라미터의 자식 타입이면
			Child c2 = (Child) c1;
			System.out.println("c2.name : "+c2.name);	//Child에 name 필드가 없으니까 Parent의 name 필드 접근
			System.out.println("c2.id : "+c2.id);				//Child에 id 필드가 있으니까 Child의 id 필드 접근
			System.out.println("c2.age : "+c2.age);			//Child에 age 필드가 있으니까 Child의 age 필드 접근
			c2.method1();		//Parent에만 있는 메소드 -> Parent의 method1() 실행
			c2.method2();		//Parent의 method2()를 Child에서 오버라이딩 -> Child의 method2() 실행
			c2.method3();		//Child에만 있는 메소드 -> Child의 method3() 실행
		} //end if
		
	} //end main
	
} //end class
