package chapter05_ReferenceType.sec06_Array.part07_Snail;

import java.util.Scanner;

public class my01_rec_snail_For {

	//정사각행렬 -> 시계방향 달팽이
	/*
	 * 1 		2 		3 		4 		5
	 * 16 	17 	18 	19 	6
	 * 	15		24		25		20		7
	 * 	14		23		22		21		8
	 * 13		12		11		10		9 			    	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		
		int row = 0;	//행
		int col = 0;	//열
		int limit = size;    //제한 개수
		int num = 1;  //배열 요소로 저장될 숫자
		
		// n=3 -> 5번 수행
		// n=4 -> 7번 수행
		// n=5 -> 9번 수행
		for(int i=0 ; i<2*size-1 ; i++) {
			
			switch(i%4) {
				case 0 :    //right
					for(int j=0 ; j<limit ; j++) {
						arr[row][col] = num++;
						col++;
					}
					col--;
					row++;
					limit--; 
					break;
				case 1 :    //down 
					for(int j=0 ; j<limit ; j++) {
						arr[row][col] = num++;
						row++;
					}
					row--;
					col--;
					break;
				case 2 :		//left
					for(int j=0 ; j<limit ; j++) {
						arr[row][col] = num++;
						col--;
					}
					row--;
					limit--;
					col++;
					break;
				case 3 :    //up
					for(int j=0 ; j<limit ; j++) {
						arr[row][col] = num++;
						row--;
					}
					row++;
					col++;
					break;
			} //end switch
			
		} //end for
		
		//달팽이 배열 출력
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	} //end main

}  //end class
