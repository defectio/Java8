package chapter11_API.sec03_java_lang.part02_String;

public class my11_valueOf {

	public static void main(String[] args) {
		/*
		 * [valueOf()]
		 *   - 기본 타입의 값을 문자열로 변환한다.
		 */
		
		String str1 = String.valueOf(10);
		System.out.println("str1 : "+str1);
		System.out.println(str1 instanceof String);
		System.out.println();
		
		String str2 = String.valueOf(true);
		System.out.println("str2 : "+str2);
		System.out.println(str2 instanceof String);
		//System.out.println(!str2);  //boolean 타입이 아니라 String 타입이기 때문에 !str2 안됨.
		System.out.println();
		
		boolean temp = true;
		System.out.println(!temp);
		
	} //end main

} //end class