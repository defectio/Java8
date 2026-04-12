package chapter15_CollectionFramework.sec05_BinaryTree.part02_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class my03_TreeSet_sort {

	/*
	 * [TreeSet]
	 * 		- 이진트리(binary tree)를 기반으로한 set 컬렉션.
	 * 		- 하나의 노드는 노드값이 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한 두 개의 변수로 구성된다.
	 * 		- TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장한다.
	 */
	public static void main(String[] args) {
		//Set 인터페이스 타입 변수에 대입해도 되지만 TreeSet 클래스 타입으로 대입한 이유는 
		//객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위해서 이다.
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		/* [TresSet이 가지고 있는 정렬 관련 메소드 2] */
		//NavigableSet<E> descendingSet() : 내림차순으로 정렬된 NavigableSet을 리턴함
		
		//NaviagableSet은 TreeSet과 마찬가지로 first(), last(), lower(), higher(), floor(), ceiling() 메소드를 제공하고,
		//정렬 순서를 바꾸는 descendingSet() 메소드도 제공한다.
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		//내림 차순 2번 정렬 -> 오름차순 정렬
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score : ascendingSet) {
			System.out.print(score+" ");
		}
		
	} //end main

} //end class
