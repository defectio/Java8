package chapter15_CollectionFramework.sec05_BinaryTree.part03_TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class my04_TreeMap_range {

	/*
	 * [TreeMap]
	 * 		- TreeMap은 이진트리를 기반으로 한 Map 컬렉션이다. 
	 * 		- TreeSet과의 차이점은 키와 값이 저장된 Map.Entry를 저장한다는 점이다.
	 * 		- TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 
	 *       키 값이 낮은 것은 왼쪽 자식 노드에, 키 값이 높은 것은 오른쪽 자식 노드에 Map.Entry 객체를 저장한다.
	 */
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("d", new Integer(35));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(100));
		treeMap.put("base", new Integer(20));
		treeMap.put("guess", new Integer(70));
		treeMap.put("cherry", new Integer(30));
		/* treeMap에는 Key에 해당하는 String 기준 오름차순으로 정렬됨 */
		
		//TreeMap에 있는 전체 entry 출력하기 -> String 기준 오름차순 정렬
		System.out.println("[전체 단어 검색]");
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		System.out.println(entrySet);
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
		System.out.println();
		
		/* NavigableMap<K, V> headMap(K toKey, boolean toInclusive) */
		//NavigableMap<K, V> headMap(끝 키, 끝 Map.Entry 포함여부)
		//TreeMap에 있는 전체 entry 중에 key값이 d 미만인 단어 검색 -> d는 포함 안됨.
		System.out.println("[d 미만인 단어 검색]");
		NavigableMap<String,Integer> headMap = treeMap.headMap("d", false);
		for(Map.Entry<String, Integer> entry : headMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
		System.out.println();
		
		/* NavigableMap<K, V> tailMap(K fromKey, boolean fromInclusive) */
		//NavigableMap<K, V> tailMap(시작 키, 시작 Map.Entry 포함여부)
		//TreeMap에 있는 전체 entry 중에 key값이 d 이상인 단어 검색 -> d 포함된다.
		System.out.println("[d 이상인 단어 검색]");
		NavigableMap<String,Integer> tailMap = treeMap.tailMap("d", true);
		for(Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
		System.out.println();
		
		/* NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) */
		//NavigableMap<K, V> subMap(시작키, 시작 Map.Entry 포함여부, 끝 키, 끝 Map.Entry 포함여부)
		//TreeMap에 있는 전체 entry 중에 key값이 c~f 사이에 있는 단어 검색
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
	} //end main

} //end class
