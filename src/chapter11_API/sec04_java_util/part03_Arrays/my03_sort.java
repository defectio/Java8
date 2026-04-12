package chapter11_API.sec04_java_util.part03_Arrays;

import java.util.Arrays;

public class my03_sort {

	/*
	 * [Arrays 클래스]
	 *   - Arrays 클래스는 배열 조작 기능을 가지고 있다. 
	 *   - 배열 조작이란 배열의 복사, 항목 정렬, 항목 검색과 같은 기능을 말한다.
	 *     (단순 배열 복사는 System.arraycopy() 메소드를 사용할 수 있다.)
	 *   - Arrays는 추가적으로 항목 정렬, 항목 검색, 항목 비교와 같은 기능을 제공해준다.
	 *   - Arrays 클래스의 모든 메소드는 정적(static) 이므로 Arrays 클래스로 바로 사용이 가능하다.
	 */
	public static void main(String[] args) {
		
		/*
		 * [Arrays.sort()]
		 *   - 기본 타입, String 배열은 Arrays.sort() 메소드의 매개값으로 지정해주면 자동으로 오름차순 정렬이 된다.
		 *   - 사용자 정의 클래스 타입일 경우에는 클래스가 Comparable 인터페이스를 구현하고 있어야 정렬이 된다.
		 */

		int[] scores = {99, 97, 98};
		Arrays.sort(scores);	//오름 차순 정렬
		System.out.println(Arrays.toString(scores));
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		System.out.println();
		
		my03_Member member1 = new my03_Member("홍길동");
		my03_Member member2 = new my03_Member("박동수");
		my03_Member member3 = new my03_Member("김민수");
		my03_Member[] members = {member1, member2, member3};
		//my03_Member 클래스에 Comparable 인터페이스가 구현되어 있지 않으면 예외 발생
		System.out.print("정렬 전 : [");
		for(int i=0 ; i<members.length ; i++) {
			System.out.print(members[i].name);
			if(i != members.length-1 ) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		
		Arrays.sort(members);
		System.out.print("정렬 후 : [");
		for(int i=0 ; i<members.length ; i++) {
			System.out.print(members[i].name);
			if(i != members.length-1 ) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	
	} //end main

} //end class