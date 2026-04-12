package chapter15_CollectionFramework.sec05_BinaryTree.part03_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class my01_TreeMap_search {

	/*
	 * [TreeMap]
	 * 		- TreeMap은 이진트리를 기반으로 한 Map 컬렉션이다. 
	 * 		- TreeSet과의 차이점은 key와 value가 저장된 Map.Entry를 저장한다는 점이다.
	 * 		- TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 
	 *       키 값이 낮은 것은 왼쪽 자식 노드에, 키 값이 높은 것은 오른쪽 자식 노드에 Map.Entry 객체를 저장한다.
	 */
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();

		//점수-이름
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		Map.Entry<Integer, String> entry = null;

		/* [TreeMap이 가지고 있는 검색 관련 메소드] */
		//Map.Entry<K, V> firstEntry() : key가 제일 낮은 Map.Entry를 리턴
		//Map.Entry<K, V> lastEntry() : key가 제일 높은 Map.Entry를 리턴 
		entry = scores.firstEntry();
		System.out.println("entry : "+entry);
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		//Map.Entry<K, V> lowerEntry(K key) : 주어진 키보다 바로 아래 Map.Entry를 리턴
		//Map.Entry<K, V> higherEntry(K key) : 주어진 키보다 바로 위 Map.Entry를 리턴
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		//Map.Entry<K, V> floorEntry(K key) : 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴, 없으면 주어진 키 바로 아래의 Map.Entry를 리턴
		//Map.Entry<K, V> ceilingEntry(K key) : 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴, 없으면 주어진 키 바로 위의 Map.Entry를 리턴
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

		//Map.Entry<K, V> pollFirstEntry() : 제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거함
		//Map.Entry<K, V> pollLastEntry() : 제일 높은 Map.Entry를 꺼내오고 컬렉션에서 제거함
		while (!scores.isEmpty()) {
			//Map에 객체가 저장되어 있으면 오름차순으로 꺼내온다.
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}

	}

}
