package chapter05_ReferenceType.sec06_Array.part02_matrix;

import java.util.Arrays;
import java.util.Comparator;

public class my03_MatrixSort {

	public static void main(String[] args) {
		int[][] arr = new int[5][2];
		
		arr[0][0] = 1;
		arr[0][1] = 4;
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[2][0] = 2;
		arr[2][1] = 5;
		arr[3][0] = 4;
		arr[3][1] = 5;
		arr[4][0] = 3;
		arr[4][1] = 8;
		
		System.out.println("[정렬 전]");
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		} //end for(출력)
		System.out.println();
		
		//2차원배열 정렬하기
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {				
				//return o2[0]-o1[0];  //0번째 열 기준 내림차순
				return o1[0]-o2[0]; //0번째 열 기준 오름차순
			}
		});
		
		System.out.println("[정렬] 1열 오름차순");
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		} //end for(출력)
		System.out.println();
		
		arr[0][0] = 1;
		arr[0][1] = 4;
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[2][0] = 2;
		arr[2][1] = 5;
		arr[3][0] = 4;
		arr[3][1] = 5;
		arr[4][0] = 3;
		arr[4][1] = 8;
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o2[1] == o1[1]) {
					return o1[0]-o2[0];
				} else {
					return o1[1]-o2[1];
				}
			}
		});
		System.out.println("[정렬2] 2열 오름차순, 1열 오름차순");
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		} //end for(출력)
		System.out.println();
	} //end main

} //end class
