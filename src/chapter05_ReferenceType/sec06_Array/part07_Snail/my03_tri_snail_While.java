package chapter05_ReferenceType.sec06_Array.part07_Snail;

import java.util.Scanner;

public class my03_tri_snail_While {

	//삼각형 시계방향 달팽이
	/*
	 * 1 	
	 * 2 		13
	 * 	3		14		12
	 * 	4		15		16		11	
	 * 6		7		8		9		10 			    	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();
		
		//삼각형 배열 생성
		int[][] arr = new int[size][];
		for(int i=0 ; i<size ; i++) {
			arr[i] = new int[i+1];
		}
		
		int row = 0;	//행
		int col = 0;	//열
		int limit = size;    //제한 개수
		int num = 1;  //배열 요소로 저장될 숫자
		
		while(limit > 0) {  //채울 수 있을 때까지 채운다.
			
			//down
			for(int i=0 ; i<limit ; i++) {
				arr[row][col] = num++;
				row++;
			}
			row--;
			col++;
			limit--;
			//break;
			
			//right
			for(int i=0 ; i<limit ; i++) {
				arr[row][col] = num++;
				col++;
			}
			col -= 2;
			row--;
			limit--;

			//up-left
			for (int i = 0; i < limit; i++) {
				arr[row][col] = num++;
				row--;
				col--;
			}
			row += 2;
			col += 1;
			limit--;
			//System.out.println("row : "+row);
			//System.out.println("col : "+col);
			//System.out.println("limit : "+limit);
		} //end while
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
