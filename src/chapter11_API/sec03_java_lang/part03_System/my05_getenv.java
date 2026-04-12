package chapter11_API.sec03_java_lang.part03_System;

public class my05_getenv {

	/*
	 * [System 클래스]
	 *   - 자바 프로그램은 운영체제 상에서 바로 실행되는 것이 아니라 JVM 위에서 실행된다.
	 *        -> 운영체제의 모든 기능을 자바 코드로 직접 접근하기 어렵다.
	 *   - System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
	 *   	   -> 프로그램 종료, 키보드로 부터 입력, 모니터로 출력, 메모리 정리, 현재 시간 읽기, 시스템 프로퍼티 읽기, 환경 변수 읽기 등...
	 *   - System 클래스의 모든 필드와 메소드는 정적필드, 정적 메소드로 구성되어 있다. 
	 */
	public static void main(String[] args) {

		//getenv() : 환경 변수 읽기
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : "+javaHome);

	} //end main

} //end class