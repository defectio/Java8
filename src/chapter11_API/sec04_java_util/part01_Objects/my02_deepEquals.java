package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Arrays;
import java.util.Objects;

public class my02_deepEquals {

	/**
	 * [Objects 클래스]
	 *   - java.util.Objects 클래스는 객체비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 
	 *     연산을 수행하는 정적 메소드들로 구성된 Object 클래스의 유틸리티 클래스이다.
	 */
	public static void main(String[] args) {
		/**
		 * [equals() vs deepEquals()] 
		 *   - Objects.equals(Object a, Object b) : 두 객체의 동등 비교
		 *   	 (1) a, b가 모두 not null 일 경우 : a.equals(b) 의 결과를 리턴
		 *   	 (2) a, b 중 어느 하나가 null/다른 하나가 not null 일 경우 : false 리턴
		 *      (3) a, b가 모두 null 일 경우 : true 리턴
		 *      
		 *   - Objects.deepEquals(Object a, Object b) : 두 객체의 동등 비교
		 *      (1) a, b가 서로 다른 배열일 경우 항목 값이 모두 같다면 true 리턴 (Arrays.deepEquals(a, b)의 결과와 동일)
		 *      (2) a, b가 모두 not array이고, not null 일 경우 : a.equals(b) 의 결과를 리턴
		 *   	 (3) a, b 중 어느 하나가 null/다른 하나가 not null 일 경우 : false 리턴
		 *      (4) a, b가 모두 null 일 경우 : true 리턴
		 */

		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println("[Objets.equals(a, b)]");
		System.out.println("o1 :"+o1+" / o2 : "+o2);
		System.out.println("Objects.equals(o1, o2) : "+Objects.equals(o1, o2));
		System.out.println("Objects.equals(o1, null) : "+Objects.equals(o1, null));
		System.out.println("Objects.equals(null, o2) : "+Objects.equals(null, o2));
		System.out.println("Objects.equals(null, null) : "+Objects.equals(null, null));
		//매개변수가 null이 아닐 경우, equals(a, b) 결과값 리턴.
		System.out.println("Objects.deepEquals(o1, o2) : "+Objects.deepEquals(o1, o2));		
		System.out.println();
		
		Integer[] arr1 = {1, 2, 3};
		Integer[] arr2 = {1, 2, 3};
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		System.out.println("Objects.equals(arr1, arr2) : "+Objects.equals(arr1, arr2)); //arr1.equals(arr2)의 결과값 리턴(배열의 주소값 비교)
		System.out.println("Objects.deepEquals(arr1, arr2) : "+Objects.deepEquals(arr1, arr2));	//Arrays.deepEquals(arr1, arr2)의 리턴값(주소값이 다르더라도 항목이 같으면 true)
		System.out.println("Arrays.deepEquals(arr1, arr2) : "+Arrays.deepEquals(arr1, arr2));
		System.out.println("Objects.deepEquals(null, arr2) : "+Objects.deepEquals(null, arr2));
		System.out.println("Objects.deepEquals(arr1, null) : "+Objects.deepEquals(arr1, null));
		System.out.println("Objects.deepEquals(null, null) : "+Objects.deepEquals(null, null));
		System.out.println();

		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student(1, "홍길동");
		Student std4 = new Student(1, "홍길동");
		
		System.out.println("[Student] 객체의 equals() 비교");
		System.out.println(std1.equals(std2));  // Student 객체에서 재정의한 equals() 메소드 호출
		System.out.println(Objects.equals(std1, std2));  // std1, std2가 둘다 null이 아닐 경우 재정의한 equals() 메소드 호출
		System.out.println(Objects.deepEquals(std1, std2));  // std1, std2가 둘다 null이 아닐 경우 재정의한 equals() 메소드 호출

		System.out.println(std3.equals(std4));  // Student 객체에서 재정의한 equals() 메소드 호출
		System.out.println(Objects.equals(std3, std4));  // std1, std2가 둘다 null이 아닐 경우 재정의한 equals() 메소드 호출
		System.out.println(Objects.deepEquals(std3, std4));  // std1, std2가 둘다 null이 아닐 경우 재정의한 equals() 메소드 호출 
	} //end main
	
	public static class Student {
		int sno;
		String name;
		
		public Student() {}

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				Student student = (Student) obj;

				// String이 null일 경우, equals() 결과 NullPointerExceptin 발생
				if (student.name != null) {
					if (this.sno == student.sno && this.name.equals(student.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}

} //end class