package chapter05_ReferenceType.sec06_Array.part04_arrayCopy;

public class my01_CopyByFor {

	// [방법 1] for문 이용해서 배열 복사
	public static void main(String[] args) {
		int[] srcArr = { 1, 2, 3 };    //sourceArray
		int[] trgArr = new int[5];	//targetArray
		
		for(int i=0; i<srcArr.length; i++) {
			//srcArr의 요소를 trgArr 배열에 저장함.
			trgArr[i] = srcArr[i];
		}
		
		//출력
		for(int i=0; i<trgArr.length; i++) {
			System.out.print(trgArr[i] + ", ");
		}

	} //end main

} //end class
