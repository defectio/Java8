package chapter04_Statement.sec03_loop.part03_doWhile;

import java.util.Scanner;

public class my01_DoWhileExample {
	/*
	 * do-while문은 조건식에 의해 반복 실행한다는 점에서는 while문과 동일하다.
	 * 		while문 : 시작할 때 부터 조건식을 검사하여 블록 내부를 실행할지 결정함.
	 * 		do-while문 : 블록 내부를 우선 실행시키고 실행 결과에 따라서 반복 실행을 계속할지 결정하는 경우도 발생한다.
	 * 
	 *  do{
	 *  	① 실행문;
	 *  } while(② 조건식);
	 *  
	 *  (1) 일단 do 블록의 실행문 실행함.
	 *  (2) 조건식 검사 -> true면 do블록 실행함. false면 종료
	 */
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		//System.in.read() : 하나의 키코드만 읽기 때문에 콘솔에 입력된 문자열을 한 번에 읽을 수 없다.
		//Scanner 객체의 nextLine() 메소드를 사용하면 입력한 문자열을 한번에 읽을 수 있다.
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		//(1) do 블록 우선 실행
		do {
			System.out.print(">");
			//nextLine() : 입력한 문자열을 한번에 읽어 String 변수에 저장한다.
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") ); //(2) 조건식 검사 -> true면 do 블록 다시 반복/ false면 do-while문 종료
		
		//scanner 객체는 사용이 종료되면 close() 메소드로 닫는다.
		scanner.close();
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
