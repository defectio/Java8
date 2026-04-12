package chapter05_ReferenceType.sec03_Operation;

public class CarExample {

	public static void main(String[] args) {
		//car1과 car2는 같은 Car 객체를 참조한다. 즉, car1과 car2에 저장된 Car 객체의 메모리 번지가 동일하다.
		Car car1 = new Car();
		Car car2 = car1;
		
		//car3은 car1, car2와 다른 Car 객체를 참조한다.
		Car car3 = new Car();
		
		//참조 변수는 객체의 메모리 번지(주소)를 참조하므로 출력시 메모리 번지가 출력된다.
		System.out.println("car1의 메모리 번지 : "+car1);
		System.out.println("car2의 메모리 번지 : "+car2);
		System.out.println("car3의 메모리 번지 : "+car3);
		
		/*
		 * [== 연산자]
		 * 		- 기본 타입 변수의 ==, != 연산은 변수에 저장된 값이 같은지, 다른지를 연산한다.
		 * 		- 참조 타입 변수의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아보는데에 사용된다.
		 * 		  즉, 참조 타입 변수의 값은 힙 영역의 객체 주소 이므로 주소 값을 비교하는 것이 된다.
		 * 
		 */
		System.out.println(car1 == car2);  //동일한 객체를 참조하므로 true 리턴
		System.out.println(car1 != car2);  //동일한 객체를 참조하므로 false 리턴
		System.out.println();
		System.out.println(car1 == car3);  //동일한 객체를 참조하므로 false 리턴
		System.out.println(car1 != car3);  //동일한 객체를 참조하므로 true 리턴
		
	}

}
