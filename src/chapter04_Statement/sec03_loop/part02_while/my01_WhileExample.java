package chapter04_Statement.sec03_loop.part02_while;

public class my01_WhileExample {
	/*
	 * for문이 정해진 횟수 만큼 반복한다면, while문은 조건식이 true일 경우에 계속해서 반복한다. 
	 * while문 조건식에는 비교 또는 논리 연산식이 주로 나오는데, 조건식이 false가 되면 반복행위를 멈추고 while문을 종료한다.
	 * 
	 * whlie(①조건식) {
	 * 		②실행문;
	 *  }
	 *  (1) 조건식을 먼저 평가한다. 조건식에는 boolean 변수나, true/false 값을 산출할 수 있는 어떠한 연산식도 올 수 있다.
	 *  (2) 조건식이 true 일 경우 실행문을 실행한다. 만약 false 일 경우 while문을 종료한다.
	 *  (3) 실행문을 종료하면 다시 조건식으로 돌아가서 조건식을 다시 평가한다. 
	 */
	public static void main(String[] args) {
		int i = 1;
		
		//while문 조건식 평가. true -> 실행문/ false -> while문 종료
		while (i<=10) {
			System.out.println(i);
			
			//i의 증감식이 없다면 while문 조건식이 항상 true -> 무한루프를 돌게됨.
			i++;
		}
		//i는 증감식 이후 조건검사한다. -> 조건식이 false 이므로 11로 나온다.
		System.out.println("i : "+i);
	}

}
