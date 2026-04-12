package chapter05_ReferenceType.sec06_Array.part02_matrix;

public class my02_Declaration {

	/*
	 * [다차원 배열]
	 * 	  - 자바는 2차원 배열을 중첩 배열 방식으로 구현한다. 행 우선!!!
	 * 
	 */
	public static void main(String[] args) {
		
		/* 다차원 배열은 계단식 구조를 가질 수 있다. */
		String[][] stars = new String[5][];
		stars[0] = new String[1];
		stars[1] = new String[2];
		stars[2] = new String[3];
		stars[3] = new String[4];
		stars[4] = new String[5];
		
		for(int i=0 ; i<stars.length ; i++) {
			for(int j=0 ; j<stars[i].length ; j++) {
				stars[i][j] = "*";
				System.out.print(stars[i][j]);
			}
			System.out.println();
		} //end for
		
	} //end main
	
} //end class
