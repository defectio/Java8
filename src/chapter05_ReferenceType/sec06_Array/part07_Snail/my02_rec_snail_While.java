package chapter05_ReferenceType.sec06_Array.part07_Snail;

import java.util.Scanner;

public class my02_rec_snail_While {

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
		
		while(limit > 0) {  //채울 수 있을 때까지 채운다.
			
			//right
			for(int i=0 ; i<limit ; i++) {
				arr[row][col] = num++;
				col++;
			}
			row++;
			col--;
			limit--;
			
			//down
			for(int i=0 ; i<limit ; i++) {
				arr[row][col] = num++;
				row++;
			}
			col--;
			row--;
			//System.out.println("col : "+col);
			//System.out.println("row : "+row);
			//break;
			
			//left
			for(int i=0 ; i<limit ; i++) {
				arr[row][col] = num++;
				col--;
			}
			col++;
			row--;
			limit--;
			//System.out.println("col : "+col);
			//System.out.println("row : "+row);
			//System.out.println("limit : "+limit);
			//break;
			
			//up
			for(int i=0 ; i<limit ; i++) {
				arr[row][col] = num++;
				row--;
			}
			row++;
			col++;
		}
		sc.close();
		
		//달팽이 배열 출력
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	} //end main

}  //end class
