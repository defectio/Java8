package chapter04_Statement.sec03_loop.part02_while;

import java.io.IOException;

public class my04_WhileEvenSumExample {
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
	public static void main(String[] args) throws IOException {
		
		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		//while문 조건식 평가. true -> 실행문/ false -> while문 종료
		while(run) { //조건식에 true를 사용하면 무한루프를 돌게 된다 -> 반복문을 빠져나가기 위한 코드가 필요함.
			System.out.println("keycode : "+keyCode);
			//Enter : 캐리지리턴-13 / 라인피드-10
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}
			
			//System.in.read() : 키보드로부터 입력된 키 코드를 int형으로 리턴한다. 키보드에서 입력된 키가 어떤 키 인지 확인 하는 방법.
			//System.in.read() -> add throws IOException
			//키코드를 키보드로 부터 입력받기 위해서 대기한다.
			keyCode = System.in.read();
			
			if (keyCode == 49) { //1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 50) { //2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { //3
				//반복문 종료 조건
				run = false;
			}
		} //end while
		
		System.out.println("프로그램 종료");
	} //end main

} //end class
