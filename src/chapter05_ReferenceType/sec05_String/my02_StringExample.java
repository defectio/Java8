package chapter05_ReferenceType.sec05_String;

public class my02_StringExample {

	public static void main(String[] args) {
		/* 자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어 있다. */
		String str1 = "얼룩말";
		String str2 = "얼룩말";
		
		//== 연산자 -> 참조 타입에서 사용될 경우, 참조하는 객체의 메모리 번지를 비교한다. 
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		} else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		//String 클래스의 equals() 메소드 : Object 클래스의 equals() 메소드를 String 클래스에서 문자열 리터럴을 비교하도록 재정의 하였음.
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이  같음");
		}
		System.out.println();
		
		/* new 연산자로 String 객체를 생성하면, 문자열 리터럴이 같더라도 참조하는 객체가 달라진다. */
		String str3 = new String("기린");
		String str4 = new String("기린");
		
		//str3, str4가 참조하는 String 객체의 메모리 번지 비교
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");
		} else {
			System.out.println("str3과 str4는 참조가 다름");
		}
		
		//str3, str4의 문자열 리터럴 비교
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이  같음");
		}		
	}

}
