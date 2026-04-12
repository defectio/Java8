package chapter11_API.sec03_java_lang.part02_String;

public class my06_length {

	public static void main(String[] args) {
		/*
		 * [length()]
		 *   - 문자열의 길이(문자의 수)를 리턴한다.
		 */
		String ssn = "7306241230123";
		int length = ssn.length();
		
		//13자리면 주민번호 자리수가 맞음
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 아닙니다");
		}

	} //end main

} //end class