package chapter05_ReferenceType.sec06_Array.part04_arrayCopy;

import java.util.Arrays;

public class my04_copyOfRange {

	//Arrays 클래스의 copyOfRange() 메소드 사용
	public static void main(String[] args) {
		
		int[] source = {44, 21, 59, 90};
		
		//Arrays 클래스의 모든 메소드는 정적(static) 메소드 이므로 Arrays 객체 생성 없이 사용 가능하다. */
		/* [ Arrays.copyOf(원본배열, 시작인덱스, 끝인덱스) ]
		 * 	 - 리턴타입 : 타겟 배열
		 *  - 원본배열의 "시작인덱스"에서 "끝인덱스-1" 까지 복사한 배열을 리턴한다.
		 *  - 복사할 길이는 원본 배열의 길이 보다 커도 되며, 타겟 배열의 길이가 된다. 복사할 길이는 원본 배열의 길이보다 절대 작으면 안된다. ArrayOutOfBoundsException 
		 *  - 복사할 길이가 원본 배열의 길이 보다 크면, 나머지 값은 default 값으로 복제된다.
		 */
		
		//0번 인덱스 부터 4개 복제해서 target 배열에 저장한다. 즉, 끝인덱스-1 까지 복제 한다.
		int[] target = Arrays.copyOfRange(source, 0, 4);
		//int[] target = Arrays.copyOfRange(source, 0, 5);
		
		//복제되지 않은 요소는 기본값이 저장된다.
		for(int num : target) {
			System.out.println(num);
		}
		
	} //end main
	
} //end class
