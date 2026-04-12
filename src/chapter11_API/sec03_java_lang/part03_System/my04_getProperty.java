package chapter11_API.sec03_java_lang.part03_System;

import java.util.Properties;
import java.util.Set;

public class my04_getProperty {

	/*
	 * [System 클래스]
	 *   - 자바 프로그램은 운영체제 상에서 바로 실행되는 것이 아니라 JVM 위에서 실행된다.
	 *        -> 운영체제의 모든 기능을 자바 코드로 직접 접근하기 어렵다.
	 *   - System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
	 *   	   -> 프로그램 종료, 키보드로 부터 입력, 모니터로 출력, 메모리 정리, 현재 시간 읽기, 시스템 프로퍼티 읽기, 환경 변수 읽기 등...
	 *   - System 클래스의 모든 필드와 메소드는 정적필드, 정적 메소드로 구성되어 있다. 
	 */
	public static void main(String[] args) {
		
		/*
		 * [System Property]
		 *   - System Property는 JVM이 시작할 때 자동 설정되는 시스템의 속성값을 말한다.
		 *     예를 들어, 운영체제의 종류, 자바 프로그램을 실행시킨 사용자의 아이디, JVM 버전, 파일 경로 구분자 등등...
		 *   - 시스템 프로퍼티는 key-value 로 구성되어 있다.
		 */

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 : "+osName);
		System.out.println("사용자 이름 : "+userName);
		System.out.println("사용자 홈 디렉토리 : "+userHome);
		System.out.println();
		
		//모든 속성의 값 출력
		System.out.println(" [ key ]   value");
		Properties pros = System.getProperties();
		Set keys = pros.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ "+key+" ] "+value);
		}
		
	} //end main

} //end class
