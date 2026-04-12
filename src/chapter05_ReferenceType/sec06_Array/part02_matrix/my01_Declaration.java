package chapter05_ReferenceType.sec06_Array.part02_matrix;

public class my01_Declaration {

	/*
	 * [다차원 배열]
	 * 	  - 자바는 2차원 배열을 중첩 배열 방식으로 구현한다. 행 우선!!!
	 * 
	 */
	public static void main(String[] args) {
		
		//타입[][] 변수 = new 타입[행수][열수]
		int[][] scores1 = new int[2][3];
		
		//2행 3열의 배열이 생성된다.
		// (0, 0)    (0, 1)    (0, 2)   -> 1행
		// (1, 0)    (1, 1)    (1, 2)   -> 2행
		//   1열		   2열		  3열
		
		System.out.println("행의 길이 : "+scores1.length);
		System.out.println("첫번째 행의 길이 : "+scores1[0].length);
		System.out.println("두번째 행의 길이 : "+scores1[1].length);
		
		int[][] scores2 = {{95, 80},
								   {89, 99}};
		
		int a = scores2[0][0];
		int b = scores2[1][1];
		System.out.println(a);    //95
		System.out.println(b);    //99

	} //end main
	
} //end class
