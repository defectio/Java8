package chapter11_API.sec03_java_lang.part03_System;

public class my01_exit {

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
		 * [exit()]
		 *   - System클래스의 exit 메소드를 호출하면 강제적으로 JVM을 종료시킨다.
		 *   - 실행하고 있는 프로세스를 강제로 종료 시키는 역할
		 *   - exit() 메소드는 int 매개값을 지정하도록 되어 있는데, 이 값을 종료 상태값이라고 한다.
		 *     일반적으로 정상 종료일 경우 0으로 지정하고, 비정상 종료 일 경우 0 이외의 다른 값을 준다.
		 */
		
		/* 특정 값이 입력 되었을 경우에만 종료하고 싶다면 자바의 보안 관리자를 직접 설정 해서 종료 상태값을 확인하면 된다. */
		//System.exit() 가 실행되면 보안 관리자의 checkExit() 메소드가 자동 호출되는데,
		//이 메소드에서 종료 상태값을 조사해서 특정 값이 입력 되지 않으면 
		//SecurityException을 발생시켜 System.exit()를 호출한 곳에서 예외 처리를 할 수 있도록 해준다.
		//checkExit() 메소드가 정상적으로 실행되면 JVM은 종료된다.
		System.setSecurityManager(new SecurityManager() {
			
			//종료 상태값이 5가 아니면 SecurityException 발생 -> 5일 경우에만 프로세스를 종료한다.
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
			try {
				System.exit(i);				
			} catch(SecurityException e) {
				System.out.println("SecurityException 발생");				
			}
		}

	} //end main

} //end class