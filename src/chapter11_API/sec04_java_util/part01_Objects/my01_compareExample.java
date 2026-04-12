package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Objects;

public class my01_compareExample {

	/**
	 * [Objects 클래스]
	 *   - java.util.Objects 클래스는 객체비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 
	 *     연산을 수행하는 정적 메소드들로 구성된 Object 클래스의 유틸리티 클래스이다.
	 */
	public static void main(String[] args) {
		/**
		 * [Objects.compare(T a, T b, Comparator<T> c) 메소드] 
		 *   - 두 객체를 비교자(Comparator)로 비교해서 int 값을 리턴한다.
		 *   - java.util.Comparator<T> 는 제네릭 인터페이스 타입으로 두 객체를 비교하는 compare(T a, T b) 메소드가 정의되어 있다.
		 *   - a가 b보다 작으면 음수, 같으면 0, 크면 양수를 리턴하도록 구현 클래스를 만들어야 한다.
		 */

		my01_Student student1 = new my01_Student(1);
		my01_Student student2 = new my01_Student(2);
		my01_Student student3 = new my01_Student(3);
		
		int result = Objects.compare(student1, student2, new my01_StudentComparotor());
		System.out.println("result1-2 : "+result);
		
		result = Objects.compare(student1, student3, new my01_StudentComparotor());
		System.out.println("result1-3 : "+result);
		
		result = Objects.compare(student2, student1, new my01_StudentComparotor());
		System.out.println("result2-1 : "+result);
		
		result = Objects.compare(student2, student3, new my01_StudentComparotor());
		System.out.println("result2-3 : "+result);
		
		result = Objects.compare(student3, student1, new my01_StudentComparotor());
		System.out.println("result3-1 : "+result);
		
		result = Objects.compare(student3, student2, new my01_StudentComparotor());
		System.out.println("result3-2 : "+result);
		
	} //end main

} //end class
