package chapter15_CollectionFramework.sec05_BinaryTree.part02_TreeSet;

import java.util.TreeSet;

public class my01_TreeSet_search {

	/*
	 * [TreeSet]
	 * 		- 이진트리(binary tree)를 기반으로한 set 컬렉션.
	 * 		- 하나의 노드는 노드값인 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한 두 개의 변수로 구성된다.
	 * 		- TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장한다.
	 */
	public static void main(String[] args) {
		//Set 인터페이스 타입 변수에 대입해도 되지만 TreeSet 클래스 타입으로 대입한 이유는  
		//객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위해서 이다.
		//Set<Integer> scores = new TreeSet<Integer>();
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;

		/* [TresSet이 가지고 있는 검색 관련 메소드] */
		//E first() : 제일 낮은 객체 리턴(가장 왼쪽 객체)
		//E last() : 제일 높은 객체 리턴(가장 오른쪽 객체)
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");

		//E lower(E e) : 주어진 객체(매개값) 보다 바로 아래 객체를 리턴
		//E higher(E e) : 주어진 객체(매개값) 보다 바로 위 객체 리턴
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");

		//E floor(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 없다면 주어진 객체의 바로 아래 객체를 리턴
		//E ceiling(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 없다면 주어진 객체의 바로 위 객체를 리턴
		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");

		//E pollFirst() : 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
		//E pollLast() : 제일 높은 객체를 꺼내오고 컬렉션에서 제거함 
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
		
	} //end main

} //end class
