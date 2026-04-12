package chapter11_API.sec04_java_util.part03_Arrays;

import java.util.Arrays;

public class my02_equals {

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
		 * [equals() vs deepEquals()]
		 *   - equals() : 1차 항목의 값만 비교
		 *   - deepEquals() : 1차 항목이 서로 다른 배열을 참조할 경우 중첩된 배열의 항목까지 비교한다
		 */

		int[][] original = {{1, 2}, {3, 4}};
		
		//얕은 복사 후 비교
		System.out.println("[얕은 복제 후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 : "+original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 : "+Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교 : "+Arrays.deepEquals(original, cloned1));
		System.out.println();
		
		//깊은 복사 후 비교
		System.out.println("[깊은 복제 후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original, cloned2));
	
	} //end main

} //end class