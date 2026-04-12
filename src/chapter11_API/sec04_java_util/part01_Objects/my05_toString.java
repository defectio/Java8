package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Objects;

public class my05_toString {

	/**
	 * [Objects 클래스]
	 *   - java.util.Objects 클래스는 객체비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 
	 *     연산을 수행하는 정적 메소드들로 구성된 Object 클래스의 유틸리티 클래스이다.
	 */
	public static void main(String[] args) {
	
		/**
		 * [Objects.toString()]
		 *   - 객체의 문자 정보를 리턴
		 */
		
		/**
		 *  Objects.toString(Object obj) 
		 *    - not null -> obj.toString()
		 *    - null -> "null"
		 */
		String str1 = "홍길동";
		System.out.println(str1.toString());
		System.out.println(Objects.toString(str1));
		
		String str2 = null;
//		System.out.println(str2.toString());  // NullPointerException 발생 후 프로그램 종료됨
		System.out.println(Objects.toString(str2));  // NullPointerException 발생 하더라도 "null"(String)을 출력함
		
		System.out.println();
		
		/**
		 *  Objects.toString(Object obj, String nullDefault)
		 *    - not null -> obj.toString()
		 *    - null -> nullDefault
		 */ 
		System.out.println(Objects.toString(str2, "이름이 없음"));
		
	} //end main

} //end class