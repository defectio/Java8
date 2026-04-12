package chapter05_ReferenceType.sec06_Array.part04_arrayCopy;

public class my02_arraycopy {

	//System 클래스의 arraycopy() 메소드 사용
	public static void main(String[] args) {
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		//arraycopy(복제하려는 원본 배열, 복제하려는 원본 배열의 시작 위치, 타겟 배열, 타겟배열의 시작위치, 원본배열의 시작 인덱스 부터의 개수)
		//System.arraycopy(원본배열, 원본 시작 인덱스, 타겟배열, 타겟 시작 인덱스, 복사개수)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//oldStrArray의 0번 위치부터 oldStrArray.length 개수 만큼 newStrArray의 0번 부터 복제함.
		
		//출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		//복제 되지 않은 String[] 배열은 기본값인 null로 초기화 된다.

	} //end main

} //end class
