package chapter11_API.sec03_java_lang.part02_String;

public class my09_caseChange {

	public static void main(String[] args) {
		/*
		 * [toLowerCase(), toUpperCase()]
		 *   - 대, 소문자 변경한 새로운 문자열을 생성한 후 리턴한다.
		 */

		String original = "Java Programming";
		String lowerCase = original.toLowerCase();		//새로 생성된 "java programming" 문자열을 참조한다.
		String upperCase = original.toUpperCase();		//새로 생성된 "JAVA PROGRAMMING" 문자열을 참조한다.
		//원래 "Java Programming" 문자열이 변경된 것은 아니다.
		
		System.out.println("original : "+original);
		System.out.println("lowerCase : "+lowerCase);
		System.out.println("upperCase : "+upperCase);
		System.out.println();
		
		/*
		 * [equalsIgnoreCase()]
		 *   - 대, 소문자가 다른 두 문자열 비교하기
		 *   - 대, 소문자 무시하고 같은 문자열이면 true 리턴
		 */
		//str1, str2를 대소문자 구분하지 않고 동일 문자열인지 비교하려면, 
		//문자열을 전부 소문자로 바꾸거나, 전부 대문자로 바꿔서 equals() 메소드로 비교한다.
		String str1 = "java";
		System.out.println("str1 : "+str1);
		String str2 = "Java";
		System.out.println("str2 : "+str2);
		System.out.println("str1.equals(str2) : "+str1.equals(str2));
		System.out.println();
		
		//소문자로 변환 후 equals() 메소드로 같은 문자열인지 비교
		String lower1 = str1.toLowerCase();
		System.out.println("lower1 : "+lower1);
		String lower2 = str2.toLowerCase();
		System.out.println("lower2 : "+lower2);
		System.out.println("lower1.equals(lower2) : "+lower1.equals(lower2));
		System.out.println();
		
		//equalsIgnoreCase() 메소드로 대소문자 변환 하지 않고 같은 문자열인지 비교
		System.out.println("str1.equalsIgnoreCase(str2) : "+str1.equalsIgnoreCase(str2));
		
	} //end main

} //end class