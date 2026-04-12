package chapter11_API.sec03_java_lang.part02_String;

public class my12_split {
	/*
	 * [split()]
	 *   - 문자열이 특정 구분자(delimiter)로 연결되어 있을 경우, 
	 *     String 클래스의 split() 메소드를 이용하면 구분자를 기준으로 부분 문자열을 분리할 수 있다. 
	 *   - 구분자가 여러 종류로 되어있을 때 처리 가능
	 */
	public static void main(String[] args) {

		//String 클래스의 split() 메소드는 정규표현식을 구분자로 해서 문자열을 분리한 수, 배열에 저장하고 리턴한다.
		//String[]	result = "문자열".split("정규표현식");
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		//정규표현식(매개값)의 구분자로 문자열을 분리해서 배열로 담는다.
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}

	} //end main

} //end class
