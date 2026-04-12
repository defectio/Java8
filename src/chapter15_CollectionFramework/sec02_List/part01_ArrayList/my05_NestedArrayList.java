package chapter15_CollectionFramework.sec02_List.part01_ArrayList;

import java.util.ArrayList;

public class my05_NestedArrayList {

	//ArrayList 중첩하기
	public static void main(String[] args) {
		//4*4 행렬 만들기
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		ArrayList<ArrayList<Integer>> studentsScores = new ArrayList<ArrayList<Integer>>();
		
		System.out.println("studentsScores : "+studentsScores);
		for(int i=0 ; i<4 ; i++) {
			//studentsScores의 각 요소들이 ArrayList<Integer> 선언됨
			studentsScores.add(new ArrayList<Integer>());
		}
		System.out.println("studentsScores : "+studentsScores);
		System.out.println("studentsScores.size() : "+studentsScores.size());
		System.out.println();
		
		/*
		for(int i=0 ; i<4 ; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j=0 ; j<i+1 ; j++) {
				temp.add(j+1);
			}
			studentsScores.get(i).addAll(temp);
 		}
 		*/
		
		int element = 1;
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				studentsScores.get(i).add(element++);
			}
		}

		//출력
		for(int i=0 ; i<studentsScores.size() ; i++)	{
			for(int j=0 ; j<studentsScores.get(i).size() ; j++) {
				System.out.print(studentsScores.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	} //end main

} //end class
