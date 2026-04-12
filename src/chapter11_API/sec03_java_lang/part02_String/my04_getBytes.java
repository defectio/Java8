package chapter11_API.sec03_java_lang.part02_String;

import java.io.UnsupportedEncodingException;

public class my04_getBytes {

	public static void main(String[] args) {
		/*
		 * [getBytes()]
		 *   - 문자열을 바이트 배열로 변환 하는 메소드
		 *   - 예를 들어 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트 배열로 변환한다.
		 *   - 인코딩 : 사용자 문자열 -> 컴퓨터가 이용할 수 있는 신호로 변환
		 *   - 디코딩 : 컴퓨터가 이용할 수 있는 신호 -> 사용자 문자열로 변환
		 */
		
		String greeting = "안녕하세요";
		
		//byte[] bytes = "문자열".getBytes() -> 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴한다.
		byte[] bytes1 = greeting.getBytes();
		System.out.print("인코딩(문자열 -> 바이트코드) : ");
		for(byte temp : bytes1) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("bytes1.length : "+bytes1.length);
		//디코딩 : byte배열을 생성자로 String 객체 생성하면 된다(문자셋 매개변수가 없으면 시스템의 기본 문자셋을 이용한다)
		String str1 = new String(bytes1);
		System.out.println("디코딩(bytes1 -> String) : "+str1);
		System.out.println();
		
		//byte[] bytes = "문자열".getBytes(Charset charset) -> 특정 문자셋으로 인코딩된 바이트 배열 리턴
		//getBytes(Charset charset) 사용시 try-catch 구문 사용
		try {
			//UTF-8 : 알파벳은 1바이트, 한글은 3바이트
			byte[] bytes2 = greeting.getBytes("UTF-8");
			System.out.print("인코딩(문자열 -> 바이트코드) : ");
			for(byte temp : bytes2) {
				System.out.print(temp+" ");
			}
			System.out.println();
			System.out.println("bytes2.length : "+bytes2.length);
			//디코딩 : byte배열을 생성자로 String 객체 생성하면 된다(문자셋 매개변수가 없으면 시스템의 기본 문자셋을 이용한다)
			String str2 = new String(bytes2);
			System.out.println("디코딩(bytes2 -> String) : "+str2);
			System.out.println();
			
			
			//EUC-KR : 알파벳은 1바이트, 한글은 2바이트
			byte[] bytes3 = greeting.getBytes("EUC-KR");
			System.out.print("인코딩(문자열 -> 바이트코드) : ");
			for(byte temp : bytes3) {
				System.out.print(temp+" ");
			}
			System.out.println();
			System.out.println("bytes3.length : "+bytes3.length);
			
			//디코딩 : byte배열을 생성자로 String 객체 생성하면 된다
			//기본 문자셋과 다르게 인코딩된 바이트 배열일 경우 String(byte[] bytes, String charsetName) 생성자를 이용해서 디코딩 해야 한다.
			String str3 = new String(bytes3, "EUC-KR");
			System.out.println("디코딩(bytes3 -> String) : "+str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
	} //end main

} //end class