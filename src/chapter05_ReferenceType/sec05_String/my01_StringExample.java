package chapter05_ReferenceType.sec05_String;

public class my01_StringExample {
	/*
	 * String은 클래스 타입이므로 참조 타입이다.
	 */
	public static void main(String[] args) {
		
		/* String 변수 선언 방법 [1] */
		//선언 먼저 하고, 나중에 사용할 때 초기화
		String str1;
		str1 = "호랑이";
		
		/* String 변수 선언 방법 [2] */
		//선언과 동시에 초기화
		String str2 = "호랑이";
				
		/* String 변수 선언 방법 [3] */
		//new 연산자로 선언 -> 힙 영역에 새로운 객체를 생성한다.
		String str3 = new String("코끼리");
		
		//str1, str2, str3는 스택영역에 생성되고, String 객체의 주소값이 저장된다.
		//문자열 리터럴인 "호랑이", "사자", "코끼리"는 힙 영역에 String 객체로 생성된다.
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
	} //end main

} //end class
