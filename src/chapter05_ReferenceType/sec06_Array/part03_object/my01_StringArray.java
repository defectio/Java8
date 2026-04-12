package chapter05_ReferenceType.sec06_Array.part03_object;

public class my01_StringArray {

	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		strArr[0] = "호랑이";
		strArr[1] = "호랑이";
		strArr[2] = new String("호랑이");
		
		//String 변수는 문자열 리터럴이 같으면 같은 String 객체를 참조한다.
		System.out.println(strArr[0] == strArr[1]);    //true
		
		//new 연산자로 생성했으므로 다른 String 객체를 참조한다.
		System.out.println(strArr[0] == strArr[2] );    //false
		
		//String 클래스의 equals() 메소드 : 문자열 리터럴을 비교한다.
		System.out.println(strArr[0].equals(strArr[2]) );    //true

	}

}
