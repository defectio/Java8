package chapter11_API.sec03_java_lang.part02_String;

public class my03_equals {
	
	/*
	 * [Object의 equals() 메소드]
	 *   - Object의 equals() 메소드는 객체의 주소 번지를 비교하는 메소드 이다.(두 객체의 주소가 같으면 true 리턴)
	 *   - Object(자바 최상위 객체)의 하위 객체에서 equals() 메소드를 논리적으로 동등하면 true를 리턴하도록 재정의 할 수 있다.
	 *   - ex) String 클래스에서 equals() 메소드는 String 객체에 저장된 문자열 리터럴이 동일한 값인지 비교한다.
	 *   		  String 클래스에서 == 연산자는 String 객체의 메모리 주소값이 같은지 비교한다. 
	 */

	public static void main(String[] args) {
		/*
		 * [equals()]
		 * 	 - 기본 타입 변수의 값을 비교할 때에는 == 연산자를 사용한다.
		 *  - 그러나, 문자열을 비교할 때에는 == 연산자를 사용하면 원하지 않는 결과가 나올 수 있다
		 *     (String 에서 == 연산은 참조하는 String 객체의 메모리 주소값 비교, 문자열이 동일한지 비교하려면 equals() 메소드를 사용한다.)
		 */
		
		String str1 = new String("레오");
		String str2 = "레오";
		String str3 = "레오";

		//자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어 있다.(hashCode(), equals() 메소드 재정의)
		//그래서 str2, str3은 동일한 String 객체를 참조한다. 그러나 str1은 new 연산자로 생성된 다른 String 객체를 참조한다.
		
		//== 연산자는 각 변수에 저장된 번지를 비교한다.
		System.out.println("str1==str2 ? "+(str1==str2));
		System.out.println("str2==str3 ? "+(str2==str3));
		System.out.println();
		
		//equals() 메소드는 객체의 문자열만 비교한다.
		System.out.println("str1.equals(str2) : " +str1.equals(str2));
		System.out.println("str2.equals(str3) : " +str2.equals(str3));
		System.out.println();
		
		//hashCode() 값 비교
		//String 클래스의 hashCode()는 문자열 리터럴이 동일하면 같은 해시코드를 리턴하는 것 같음.
		System.out.println("str1.hashCode() : "+str1.hashCode());
		System.out.println("str2.hashCode() : "+str2.hashCode());
		System.out.println("str3.hashCode() : "+str3.hashCode());
		
		//hashCode() 동일 -> equals() true -> 동일한 객체 참조
		//str1, str2, str3는 모두 동일한 해시코드를 갖는다.
		//str1과 str2, str3는 서로 다른 주소값을 가지고 있지만, str2-str3는 동일한 주소값을 가지고 있다.
		// -> str2와 str3은 동일한 String 객체를 참조한다. str1은 또 다른 String 객체를 참조한다.
		
	} //end main

} //end class