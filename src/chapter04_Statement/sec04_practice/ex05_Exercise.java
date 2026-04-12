package chapter04_Statement.sec04_practice;

public class ex05_Exercise {

	public static void main(String[] args) {
		
		//4x+5y=60의 모든 해를 구해서 (x, y) 형태로 출력하시오. x,y는 10 이하의 자연수
		for(int x=1; x<=10; x++) {
			for(int y=1 ; y<=10 ; y++) {
				
				if(4*x + 5*y == 60) {
					System.out.println("("+x+", "+y+")");
				}
			}
		}
	}

}
