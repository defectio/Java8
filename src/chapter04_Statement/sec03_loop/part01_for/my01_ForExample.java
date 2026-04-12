package chapter04_Statement.sec03_loop.part01_for;

public class my01_ForExample {

	/*
	 * for(①초기화식 ; ②조건식 ; ④증감식) {
	 * 		③실행문;
	 * } 
	 * 
	 * (1) 초기화식 실행
	 * (2) 조건식 검사 
	 * 			- true : 실행문 -> 증감식 -> 조건식(true면 실행문 반복)
	 * 			- false : for문 종료
	 */
	public static void main(String[] args) {
		
		//초기화식의 역할 : 조건식과 실행문, 증감식에서 사용할 변수를 초기화하는 역할(로컬변수 -> for문 안에서만 사용 가능)
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//초기화식이 필요 없을 경우 -> 변수 i를 global로 선언했기 때문에 for문 안과 밖에서 모두 사용 가능하다.
		int i = 0;
		for( ; i<10 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//i는 증감식 실행되고 조건에 맞지 않으면 증가된 상태로 빠져나간다.
		System.out.println(i);
	}//end main
} //end class
