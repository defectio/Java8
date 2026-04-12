package chapter13_Generic.sec05_BoundedTypeParameter.part01;

public class Util {
	/*
	 * [제한된 타입 파라미터 <T extends 최상위타입> ] : 제네릭 메소드에서 사용
	 *  - 타입 파라미터에 지정 되는 구체적인 타입을 제한할 필요가 종종 있다.
	 *  - 예를 들어, 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 Number의 하위 타입(Byte, Short, Integer, Long, Double)의 인스턴스만 가져야 한다.
	 *  - 제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 키워드를 붙이고 상위 타입을 명시하면 된다.
	 *  - 상위 타입은 클래스 뿐만 아니라 인터페이스도 가능하다. 인터페이스라고 해서 implements를 사용하지 않는다.
	 */
	
	//제네릭 타입이 extends Number 이므로 매개변수는 Number 타입 또는 Number의 하위 타입만 가능하다.
	//public static <T> int compare(T t1, T t2) {	//에서 타입 파라미터를 Number 타입으로 제한 -> 매개변수는 Number 타입 또는 Number의 하위 타입만 가능하다 
	public static <T extends Number> int compare(T t1, T t2) {
		/*
		 * 메소드 중괄호 블록 내에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 멤버(필드, 메소드)로 제한된다.
		 * 하위 타입에만 있는 필드와 메소드는 사용할 수 없다. 즉, Number의 멤버만 사용가능하다. 
		 */
		
		//doubleValue() : Number 클래스에 정의되어 있는 메소드로 숫자를 double 타입으로 반환한다.
		double v1 = t1.doubleValue();
		System.out.println("t1의 클래스 이름 : "+t1.getClass().getName());
		
		double v2 = t2.doubleValue();
		System.out.println("t2의 클래스 이름 : "+t2.getClass().getName());
				
		//Double.compare() : 두 개의 숫자 타입을 매개값으로 받아 첫번째 매개값이 작으면 -1, 같으면 0, 크면 1을 리턴한다.
		return Double.compare(v1, v2);
	}
	
} //end class
