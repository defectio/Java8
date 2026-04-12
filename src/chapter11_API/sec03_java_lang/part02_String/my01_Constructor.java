package chapter11_API.sec03_java_lang.part02_String;

import java.io.IOException;

public class my01_Constructor {

	/**
	 * [String 클래스]
	 *   - 소스 상의 문자열 리터럴은 String 객체로 자동 생성되지만, String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있다.
	 */
	public static void main(String[] args) throws IOException {
		
		/**
		 * String 클래스 - byte[] 생성자
		 *   - 파일의 내용을 읽거나, 네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 이것을 문자열로 변환하기 위해 사용한다. 
		 */
		// (1) byte[] 배열 전체를 String 객체로 생성
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String(bytes);
		System.out.println("str1 : "+str1);
		
		// (2) 지정한 문자셋으로 디코딩
		String str2 = new String(bytes, "UTF-8");
		System.out.println("str2 : "+str2);
					
		// (3) byte[] 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
		String str3 = new String(bytes, 6, 4);		//6번 인덱스 부터 4개(74, 97, 118, 97)로 문자열 생성
		System.out.println("str3 : "+str3);
		
		// (4) 지정한 문자셋으로 디코딩
		String str4 = new String(bytes, 0, 5, "UTF-8");
		System.out.println("str4 : "+str4);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/**
		 * 키보드로부터 읽은 바이트 배열을 문자열로 변환하는 방법
		 * System.in.read() 메소드 이용 : 키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴함
		 *    - System.in.read(byte[] bytes) : 키보드 입력 문자열을 읽어 byte(매개값)배열에 바이트를 저장하고 읽은 바이트 수를 리턴
		 */
		byte[] bytes2 = new byte[100];
		
		/** 
		 * - Hello를 입력하고 enter를 눌렀다면 Hello+캐리지리턴(\r)+라인피드(\n)의 코드값이 바이트 배열에 저장됨'
		 *   입력한 문자열 외에 캐리지리턴(/r), 라인피드(/n)가 포함되어 저장된다.
		 * - 입력 내용 : 			H 		e 		l 		l 		o 		\r 		\n
		 * - 바이트 배열 내용 : 		72		101		108		108		111		13		10  
		 */
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes2);
		
		/**
		 * byte[] 배열의 offset 인덱스 위치부터 length-2만큼 String 객체로 생성
		 * -2를 해준 이유는 캐리지리턴(/r),라인피드(/n) 부분은 문자열로 만들 필요가 없기 때문  
		 */
		String str5 = new String(bytes2, 0, readByteNo); // -2를 안했을 경우 : 캐리지리턴, 라인피드가 포함됨.
		System.out.println("str5 : " + str5);
		System.out.println("str5.length : " + str5.length());
		
		String str6 = new String(bytes2, 0, readByteNo - 2);
		System.out.println("str6 : " + str6);
		System.out.println("str6.length : " + str6.length());
	} //end main

} //end class
