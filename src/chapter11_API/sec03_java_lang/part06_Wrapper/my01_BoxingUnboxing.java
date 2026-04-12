package chapter11_API.sec03_java_lang.part06_Wrapper;

public class my01_BoxingUnboxing {

	/*
	 * [Wrapper 클래스]
	 *   - 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다. -> Wrapper(포장) 객체
	 *   - 포장 객체의 특징은 포장하고 있는 기본 타입 값은 외부 에서 변경할 수 없다.
	 *      만약, 내부의 값을 변경하고 싶다면 새로운 포장 객체를 만들어야 한다.
	 */
	public static void main(String[] args) {

		/* Boxing : 기본 타입의 값을 포장 객체로 만드는 과정 */
		//[1] 기본 타입의 값을 줄 경우
		Integer obj1 = new Integer(100);	
		//[2] 문자열을 줄 경우
		Integer obj2 = new Integer("200");	
		//[3] 각 포장 클래스 마다 가지고 있는 정적 valueOf() 메소드 사용
		Integer obj3 = Integer.valueOf("300");	

		//내부의 값 변경 가능한데??
		obj1 = 1000;
		obj2 = 2000;
		
		/* Unboxing : 포장객체에서 기본 타입의 값을 얻어 내는 과정 */
		//각 포장 클래스마다 가지고 있는 "기본타입명+Value()" 메소드 호출
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
	} //end main

} //end class