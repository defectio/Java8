package chapter05_ReferenceType.sec04_Null;

public class my01_NullExample {

	/*
	 * 참조 타입 변수는 "힙 영역의 객체를 참조하지 않는다"는 뜻으로 null(널) 값을 가질 수 있다.
	 * null 값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조변수는 스택 영역에 생성된다.
	 */
	public static void main(String[] args) {
		Car car1 = new Car("벤츠");
		Car car2 = null;
		
		//car1은 힙 영역의 Car 객체를 참조한다.
		System.out.println(car1 == null);
		System.out.println(car1 != null);
		System.out.println();
		
		//car2는 null 값을 가지므로 참조하는 객체가 없다. -> 스택영역에 생성됨.
		System.out.println(car2 == null);
		System.out.println(car2 != null);
		
		/*
		 * [NullPointerException] 모르는데 어떻게 가요?
		 * 		- 참조 타입 변수가 null을 가지고 있을 경우, 참조 타입 변수는 사용할 수 없다.
		 * 		- 참조할 객체가 없는데 사용하려고 할 경우 NullPointerException이 발생한다.
		 */
		System.out.println("car1의 이름 : "+car1.name);
		
		//car2는 null을 갖고 있는데, 즉 참조하는 Car객체가 없는데 Car객체의 멤버(필드)를 사용하려고 했기 때문에 NullPointerException 발생
		//System.out.println(car2.name);  
	}

}
