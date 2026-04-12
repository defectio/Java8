package chapter11_API.sec03_java_lang.part02_String;

public class my10_trim {

	public static void main(String[] args) {
		/*
		 * [trim()]
		 *   - 문자열 앞뒤 공백 잘라내기 
		 *   - trim() 메소드를 사용한다고 해서 원래 문자열의 공백이 제거되는 것은 아니다.
		 */
		String str1 = "    자바";
		String str2 = "프로그래밍    ";
		String str3 ="    스프링    ";
		
		String text = str1.trim() + str2.trim() + str3.trim();
		System.out.println("text : "+text);
		System.out.println();
		
		//trim() 메소드를 사용한다고 해서 str1, str2, str3(원래 문자열)의 공백이 제거되는 것은 아니다.
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);

	} //end main
 
} //end class