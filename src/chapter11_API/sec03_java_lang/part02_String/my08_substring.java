package chapter11_API.sec03_java_lang.part02_String;

public class my08_substring {

	public static void main(String[] args) {
		/*
		 * [substring()]
		 *   - 주어진 인덱스에서 문자열을 추출한다.
		 */

		String ssn = "930916-1231230";
		
		//substring(int beginIdx, int endIdx) : 주어진 시작과 끝 인덱스 사이의 문자열 추출
		//시작인덱스 : 포함, 끝 인덱스 : 미포함
		String firstNum = ssn.substring(0, 6);
		System.out.println("firstNum : "+firstNum);
		
		//substring(int beginIdx) : 주어진 인덱스 부터 끝까지 문자열을 추출
		String secondNum = ssn.substring(7);
		System.out.println("secondNum : "+secondNum);
	
	} //end main

} //end class