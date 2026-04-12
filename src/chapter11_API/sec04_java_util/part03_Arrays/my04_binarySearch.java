package chapter11_API.sec04_java_util.part03_Arrays;

import java.util.Arrays;

public class my04_binarySearch {

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
		 * [배열 검색]
		 *   - 배열 항목에서 특정 값이 위치한 인덱스를 얻는 것을 배열 검색이라고 한다.
		 *   - 배열 항목을 검색하려면 먼저 Arrays.sort() 메소드를 항목들을 오름차순 정렬한 후,
		 *      Arrays.binarySearch() 메소드로 항목을 찾아야 한다.
		 */
		
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);	//오름차순 정렬을 하지 않고, 배열 검색 시 -4 출력
		System.out.println("찾은 인덱스 : "+index);
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스 : "+index);

	} //end main

} //end class
