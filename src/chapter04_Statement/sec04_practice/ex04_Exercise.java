package chapter04_Statement.sec04_practice;

public class ex04_Exercise {

	public static void main(String[] args) {
		
		//주사위 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춘다.
		
		boolean run = true;
		
		while(run) {
			int num1 = (int) (Math.random()*6 ) + 1;
			int num2 = (int) (Math.random()*6 ) + 1;
			System.out.println("("+num1+", "+num2+")");
			if(num1 + num2 == 5) {
				run = false;
			}
		}
	}

}
