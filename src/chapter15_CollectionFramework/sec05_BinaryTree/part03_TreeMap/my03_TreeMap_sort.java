package chapter15_CollectionFramework.sec05_BinaryTree.part03_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class my03_TreeMap_sort {

	/*
	 * [TreeMap]
	 * 		- TreeMap은 이진트리를 기반으로 한 Map 컬렉션이다. 
	 * 		- TreeSet과의 차이점은 키와 값이 저장된 Map.Entry를 저장한다는 점이다.
	 * 		- TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 키 값이 낮은 것은 왼쪽 자식 노드에, 키 값이 높은 것은 오른쪽 자식 노드에 Map.Entry 객체를 저장한다.
	 */
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "바나나");
		scores.put(new Integer(98), "사과");
		scores.put(new Integer(75), "멜론");
		scores.put(new Integer(95), "오렌지");
		scores.put(new Integer(80), "체리");
		
		System.out.println("[TreeMap]");
		//key값을 기준으로 자동 오름차순 정렬
		System.out.println(scores);
		System.out.println();
		
		/* [TresMap이 가지고 있는 정렬 관련 메소드] */
		//NavigableMap<K, V> descendingMap() : 내림차순으로 정렬된 Map.Entry의 NavigableMap을 리턴함
		
		//NaviagableMap은 TreeMap과 마찬가지로 firstEntry(), lastEntry(), lowerEntry(), higherEntry(), floorEntry(), ceilingEntry() 메소드를 제공하고,
		//정렬 순서를 바꾸는 descendingMap() 메소드도 제공한다.
		System.out.println("[TreeMap - desceningMap 메소드]");
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();    //scores를 내림차순 정렬
		System.out.println(descendingMap);
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();  //내림차순 정렬된 scores Map에서 entry set을 descendingEntrySet에담는다.
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		System.out.println();
		
		//오름차순 정렬하고 싶다면 descendingMap() 메소드를 두번 호출하면 된다.
		System.out.println("[TreeMap - desceningMap 메소드 2번 호출]");
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		System.out.println(ascendingMap);
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}

	} //end main

} //end class
