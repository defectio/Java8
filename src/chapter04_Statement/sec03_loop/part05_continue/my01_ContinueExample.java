package chapter04_Statement.sec03_loop.part05_continue;

public class my01_ContinueExample {

	/*
	 * Continue문은 반복문인 for문, while문, do-while문 에서만 사용된다.
	 * 		for문 내부 블록에서 continue문이 실행되면 for문의 증감식으로 이동
	 * 		while문, do-while문 내부 블록에서 continue문이 실행되면 조건식으로 이동한다.
	 */
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			//continue문이 실행되면 for문의 증감식으로 이동한다.
			if(i%2 != 0) { //홀수이면 증감식 이동
				continue;
			}
			System.out.println(i);
		}

	}

}
