package chapter11_API.sec03_java_lang.part06_Wrapper;

public class my03_parse {

	/*
	 * [Wrapper 클래스]
	 *   - 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다. -> Wrapper(포장) 객체
	 *   - 포장 객체의 특징은 포장하고 있는 기본 타입 값은 외부 에서 변경할 수 없다.
	 *      만약, 내부의 값을 변경하고 싶다면 새로운 포장 객체를 만들어야 한다.
	 */
	public static void main(String[] args) {

		//포장 클래스의 주요 용도는 기본 타입의 값을 박싱해서 포장 객체로 만드는 것이지만,
		//문자열을 기본 타입의 값으로 변환할 때에도 많이 사용 된다.
		String str1 = "10";
		String str2 = "3.14";
		String str3 = "true";
		
		/* 문자열을 기본 타입 값으로 변경 */
		//포장클래스의 "parse+기본타입" 명으로 되어 있는 정적 메소드 사용
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);

	} //end main

} //end class