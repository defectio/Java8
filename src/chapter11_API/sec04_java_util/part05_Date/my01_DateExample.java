package chapter11_API.sec04_java_util.part05_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class my01_DateExample {

	/*
	 * [Date 클래스]
	 *   - 날짜를 표현하는 클래스
	 *   - Date 클래스는 객체간에 날짜 정보를 주고 받을 때 주로 사용된다
	 *   - Date 클래스에는 여러 개의 생성자가 선언되어 있지만 대부분 비권장 되어 있다. 
	 *     현재는 주로 Date() 생성자만 사용한다.
	 */
	public static void main(String[] args) {
		
		//Date() 생성자 : 시스템의 현재 날짜를 읽어 Date 객체를 만든다.
		Date now = new Date();
		
		//현재 날짜를 문자열로 읽고 싶다면 toString() 메소드를 사용하면 된다.
		//toString() 메소드는 영문으로된 날짜를 리턴한다.
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		//특정 문자열 포맷으로 날짜를 얻고 싶다면 java.text.SimpleDateFormat 클래스를 이용하면된다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
