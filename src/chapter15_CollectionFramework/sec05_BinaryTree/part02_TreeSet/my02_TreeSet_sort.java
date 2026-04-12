package chapter15_CollectionFramework.sec05_BinaryTree.part02_TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class my02_TreeSet_sort {

	/*
	 * [TreeSet]
	 * 		- 이진트리(binary tree)를 기반으로한 set 컬렉션.
	 * 		- 하나의 노드는 노드값이 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한 두 개의 변수로 구성된다.
	 * 		- TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장한다.
	 */
	
	//[HashSet vs TreeSet]
	public static void main(String[] args) {
		//Set 인터페이스 타입 변수에 대입해도 되지만 TreeSet 클래스 타입으로 대입한 이유는 
		//객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위해서 이다.
	
		/* HashSet */
		Set<String> fruits1 = new HashSet<String>();
		
		fruits1.add(new String("apple"));
		fruits1.add(new String("melon"));
		fruits1.add(new String("banana"));
		fruits1.add(new String("orange"));
		fruits1.add(new String("cherry"));
		fruits1.add(new String("pineapple"));

		//HashSet에서 iterator를 얻으면 random으로 값을 가져온다. 저장된 순서와 읽어오는 순서가 같다는 보장이 없다.
		//반면, TreeSet에 저장한다면 오름차순 정렬된 상태에서 저장되기 때문에 iterator를 얻어서 객체를 가져오면 오름차순으로 가져온다.
		System.out.println("[HashSet interator]");
		Iterator<String> iterator1 = fruits1.iterator();
		while(iterator1.hasNext()) {
			String fruit = iterator1.next();
			System.out.println(fruit);
		}
		System.out.println();
		
		/* TreeSet */
		TreeSet<String> fruits2 = new TreeSet<String>();
		
		//이진트리 구조로 저장됨 -> 오름차순으로 저장됨.(문자의 경우 유니코드 값으로 비교한다)
		fruits2.add(new String("apple"));
		fruits2.add(new String("melon"));
		fruits2.add(new String("banana"));
		fruits2.add(new String("orange"));
		fruits2.add(new String("cherry"));
		fruits2.add(new String("pineapple"));

		//TreeSet에 저장한다면 오름차순 정렬된 상태로 저장되기 때문에 iterator를 얻어서 객체를 가져오면 오름차순으로 가져온다.
		System.out.println("[TreeSet iterator]");
		//자동으로 오름차순 interator를 가져옴.
		Iterator<String> iterator2 = fruits2.iterator();	
		while(iterator2.hasNext()) {
			String fruit = iterator2.next();
			System.out.println(fruit);
		}
		System.out.println();
		
		/* [TresSet이 가지고 있는 정렬 관련 메소드 1] */
		//Iterator<E> descendingIterator() : 내림차순으로 정렬된 iterator를 리턴함.
		System.out.println("[TreeSet descendingIterator]");
		Iterator<String> iterator3 = fruits2.descendingIterator();
		while(iterator3.hasNext()) {
			String fruit = iterator3.next();
			System.out.println(fruit);
		}
		
	} //end main

} //end class
