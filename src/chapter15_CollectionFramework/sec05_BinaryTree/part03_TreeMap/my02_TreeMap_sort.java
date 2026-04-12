package chapter15_CollectionFramework.sec05_BinaryTree.part03_TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class my02_TreeMap_sort {

	/*
	 * [TreeMap]
	 * 		- TreeMap은 이진트리를 기반으로 한 Map 컬렉션이다. 
	 * 		- TreeSet과의 차이점은 키와 값이 저장된 Map.Entry를 저장한다는 점이다.
	 * 		- TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 
	 *       키 값이 낮은 것은 왼쪽 자식 노드에, 키 값이 높은 것은 오른쪽 자식 노드에 Map.Entry 객체를 저장한다.
	 */
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(new Integer(87), "바나나");
		scores.put(new Integer(98), "사과");
		scores.put(new Integer(75), "멜론");
		scores.put(new Integer(95), "오렌지");
		scores.put(new Integer(80), "체리");
		
		/* [TresMap이 가지고 있는 정렬 관련 메소드] */
		//NavigableSet<K> descendingKeySet() : 내림차순으로 정렬된 키의 NavigableSet을 리턴함
		
		NavigableSet<Integer> descendingKey = scores.descendingKeySet();    //scores의 키로 내림차순 정렬
		/*
		Iterator<Integer> descendingKeyIterator = descendingKey.iterator();  //scores키로 내림차순 정렬된 descendingKey에서 iterator를 얻는다.
		while(descendingKeyIterator.hasNext()) {
			Integer key = descendingKeyIterator.next();
			String value = scores.get(key);
			System.out.print(key+"-"+value+" ");
		}
		*/
		for(Integer descKey : descendingKey) {
			System.out.print(descKey+"-"+scores.get(descKey)+" ");
		}
		System.out.println();
		
		//오름차순 정렬하고 싶다면 내림차순 정렬된 descendingKey에 descendingSet() 메소드를 다시 호출한다.
		NavigableSet<Integer> ascendingKey = descendingKey.descendingSet();
		Iterator<Integer> ascendingKeyIterator = ascendingKey.iterator(); 
		while(ascendingKeyIterator.hasNext()) {
			Integer key = ascendingKeyIterator.next();
			String value = scores.get(key);
			System.out.print(key+"-"+value+" ");
		}
	} //end main

} //end class
