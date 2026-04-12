package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Objects;

public class my04_null {

	/**
	 * [Objects 클래스]
	 *   - java.util.Objects 클래스는 객체비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 
	 *     연산을 수행하는 정적 메소드들로 구성된 Object 클래스의 유틸리티 클래스이다.
	 */
	public static void main(String[] args) {
	
		String str1 = "홍길동";
		String str2 = null;
		
		/**
		 *  Objects.isNull(Object obj) : 매개값이 null 일 경우 true 리턴
		 *  Objects.nonNull(Object obj) : 매개값이 not null 일 경우 true 리턴
		 */
		System.out.println("Objects.isNull(str1) : "+Objects.isNull(str1));
		System.out.println("Objects.isNull(str2) : "+Objects.isNull(str2));
		System.out.println("Objects.nonNull(str1) : "+Objects.nonNull(str1));
		System.out.println("Objects.nonNull(str2) : "+Objects.nonNull(str2));
		
		/**
		 *  Objects.requireNonNull(T obj)
		 *    - not null -> obj 리턴
		 *    - null -> NullPointerException
		 */
		try {
			@SuppressWarnings("unused")
			String name = Objects.requireNonNull(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		/**
		 *  Objects.requireNonNull(T obj, String message)
		 *    - not null -> obj 리턴
		 *    - null -> NullPointerException(message)
		 */
		try {
			@SuppressWarnings("unused")
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/**
		 * Objects.requireNonNull(T obj, Supplier<String> msgSupplier)
		 *   - not null -> obj 리턴
		 *   - null -> NullPointerException(msgSupplier.get())
		 */
		try {
			@SuppressWarnings("unused")
			String name = Objects.requireNonNull(str2, () -> "이름이 없다니깐요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	} //end main

} //end class