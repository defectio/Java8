package chapter11_API.sec04_java_util.part03_Arrays;

import java.util.Arrays;

public class my01_ArrayCopy {

	/*
	 * [Arrays 클래스]
	 *   - Arrays 클래스는 배열 조작 기능을 가지고 있다. 
	 *   - 배열 조작이란 배열의 복사, 항목 정렬, 항목 검색과 같은 기능을 말한다.
	 *     (단순 배열 복사는 System.arraycopy() 메소드를 사용할 수 있다.)
	 *   - Arrays는 추가적으로 항목 정렬, 항목 검색, 항목 비교와 같은 기능을 제공해준다.
	 *   - Arrays 클래스의 모든 메소드는 정적(static) 이므로 Arrays 클래스로 바로 사용이 가능하다.
	 */
	public static void main(String[] args) {
		char[] array = {'J', 'A', 'V', 'A'};
		
		/*
		 * [copyOf(원본 배열, 복사할 길이)]
		 *   - 원본배열의 0번 인덱스에서 복사할 길이 만큼 복사한 타겟 배열을 리턴한다.
		 *   - 복사할 길이는 원본 배열의 길이보다 커도 되며, 타겟 배열의 길이가 된다.
		 */
		char[] target1 = Arrays.copyOf(array, array.length);
		//char[] arr2 = Arrays.copyOf(arr1, arr1.length+10);	//복사할 길이는 원본 배열의 길이보다 커도 되며, 타겟 배열의 길이가 된다.	
		System.out.println(target1);
		System.out.println(target1.length);
		System.out.println(Arrays.toString(target1));
		System.out.println();
		
		/*
		 * [copyOfRange(원본 배열, 시작인덱스, 끝인덱스)]
		 *   - 원본 배열의 시작 인덱스에서 끝 인덱스 까지 복사한 배열을 리턴한다.
		 *   - 시작인덱스는 포함이지만, 끝인덱스는 포함되지 않는다.
		 */
		char[] target2 = Arrays.copyOfRange(array, 1, 3);
		System.out.println(target2);
		System.out.println(target2.length);
		System.out.println(Arrays.toString(target2));
		System.out.println();
		
		/* 
		 * [System.arraycopy(원본 배열, 원본 시작 인덱스, 타겟배열, 타겟 시작 인덱스, 복사개수)]
		 *   - 원본 시작 인덱스 : 원본 배열에서 복사할 항목의 시작 위치
		 *   - 타겟 시작 인덱스 : 타겟 배열에서 복사 시작 위치
		 *   - 복사 개수 : 원본 시작 인덱스에서부터 몇 개의 항목을 복사할 것인지 
		 */
		char[] target3 = new char[array.length];
		System.arraycopy(array, 0, target3, 0, array.length-1);	//void 메소드 -> 리턴값 받을 수 없음.
		System.out.println(target3);
		System.out.println(target3.length);
		
	} //end main

} //end class
