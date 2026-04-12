package chapter15_CollectionFramework.sec05_BinaryTree.part02_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class my04_TreeSet_range {

	/*
	 * [TreeSet]
	 * 		- 이진트리(binary tree)를 기반으로한 set 컬렉션.
	 * 		- 하나의 노드는 노드값이 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한 두 개의 변수로 구성된다.
	 * 		- TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장한다.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");		
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("d");
		treeSet.add("e");
		
		/* NavigableSet<E> headSet(E toElement, boolean inclusive) */
		//NavigableSet<E> headSet(끝 객체, 끝 객체 포함 여부)
		NavigableSet<String> rangeSet1 = treeSet.headSet("d", true);	 // ... <= d
		System.out.println("[d 이하의 단어 검색]");
		for(String word : rangeSet1) {
			System.out.println(word);
		}
		System.out.println();
		//description은 d 이상이므로 검색 범위에 포함되지 않는다.
		
		/* NavigableSet<E> tailSet(E fromElement, boolean inclusive) */
		//NavigableSet<E> tailSet(시작 객체, 시작 객체 포함 여부)
		NavigableSet<String> rangeSet2 = treeSet.tailSet("e", false);	 // e < ...
		System.out.println("[e 보다 큰 단어 검색]");
		for(String word : rangeSet2) {
			System.out.println(word);
		}
		System.out.println();
		//e는 포함되지 않는다.
		
		/* NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) */
		//NavigableSet<E> subSet(시작 객체, 시작객체 포함 여부, 끝 객체, 끝 객체 포함 여부)
		NavigableSet<String> rangeSet3 = treeSet.subSet("c", true, "f", true);	 //c <= ... <= f
		System.out.println("[c~f 사이의 단어 검색]");
		for(String word : rangeSet3) {
			System.out.println(word);
		}
		
	} //end main

} //end class
