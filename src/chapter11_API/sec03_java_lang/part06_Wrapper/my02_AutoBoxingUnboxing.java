package chapter11_API.sec03_java_lang.part06_Wrapper;

public class my02_AutoBoxingUnboxing {

	/*
	 * [Wrapper 클래스]
	 *   - 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다. -> Wrapper(포장) 객체
	 *   - 포장 객체의 특징은 포장하고 있는 기본 타입 값은 외부 에서 변경할 수 없다.
	 *      만약, 내부의 값을 변경하고 싶다면 새로운 포장 객체를 만들어야 한다.
	 */
	public static void main(String[] args) {

		/* 자동 박싱 */
		//포장 클래스 타입에 기본값이 대입될 경우에 발생한다.
		Integer obj = 100;
		System.out.println("obj : "+obj);
		System.out.println("obj : "+obj.intValue());

		/* 자동 언박싱 */
		//기본타입에 포장 객체가 대입될 경우에 발생한다.
		int value = obj;
		System.out.println("value : "+value);
		
		//연산 시 자동 unboxing
		int result = obj + 100;
		System.out.println("result : "+result);

	} //end main

} //end class