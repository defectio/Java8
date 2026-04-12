package chapter11_API.sec03_java_lang.part02_String;

public class my07_replace {

	public static void main(String[] args) {
		/*
		 * [replace()]
		 *   - 첫번째 매개값인 문자열을 모두 찾아 두번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴한다.
		 */
		String oldStr = "자바는 객체 지향 언어 입니다. 자바는 풍부한 API를 지원합니다.";
		
		//String 객체의 문자열을 변경이 불가능한 특성을 갖기 때문에 
		//replace() 메소드가 리턴하는 문자열은 원래 문자열의 수정본이 아니라 완전히 새로운 문자열 이다.
		String newStr = oldStr.replace("자바", "java");
		
		//indexOf()로 해당 문자열이 있는지 먼저 확인 후에 replace()로 문자열 변경
		
		System.out.println("oldStr : "+oldStr);
		System.out.println("newStr : "+newStr);

	} //end main

} //end class