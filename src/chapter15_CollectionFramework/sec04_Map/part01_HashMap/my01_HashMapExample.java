package chapter15_CollectionFramework.sec04_Map.part01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class my01_HashMapExample {

	/*
	 * [Map 컬렉션]
	 *  - Map 컬렉션은 키(key)와 값(value)으로 구성된 entry 객체를 저장하는 구조를 가지고 있다. 여기서 key-value는 모두 객체 이다.
	 *  - key는 중복저장될 수 없지만, value는 중복 저장될 수 있다. 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체 된다.
	 */
	public static void main(String[] args) {
		/*
		 * [HashMap]
		 *  - HashMap은 Map 인터페이스를 구현한 대표적인  Map 컬렉션이다. 
		 *  - HashMap의 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의 해서 동등객체가 될 조건을 정의해야한다. 
		 *  - 즉, 동일한 키가 될 조건은 hashCode() 리턴값이 같아야 하고, equals() 메소드가 true를 리턴해야한다.
		 */
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		/* 객체 저장 */
		// V put(K key, V value) : 주어진 key로 value를 저장. 새로운 key일 경우 null 리턴, 동일한 key가 있을 경우 value를 대체하고 이전 value를 리턴
		map.put("호랑이", 85);
		map.put("사자", 90);
		map.put("기린", 80);
		map.put("코뿔소", 95);
		map.put("얼룩말", 95);
		//동일한 key(호랑이)가 있으므로, 이전 호랑이의 점수인 85를 70으로 대체하고, 이전 value인 85를 리턴한다.
		map.put("호랑이", 70); 
		
		/* 객체 크기 */
		//int size() : 저장된 key의 총 수를 리턴
		System.out.println("[현재 Map의 크기]");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		/* 객체 찾기 */
		// V get(Object key) : 주어진 key가 있는 value를 리턴함
		System.out.println("[객체 찾기]");
		System.out.println("호랑이: " + map.get("호랑이"));
		System.out.println();
		
		/* key, value가 저장되어 있는지 검사하기 */
		//boolean containsKey(Object key) : 주어진 key가 저장되어 있으면 true 리턴
		//boolean containsValue(Object value) : 주어진 value가 저장되어 있으면 true 리턴
		System.out.println("[containsKey, containsValue]");
		System.out.println("호랑이가 있나? : "+map.containsKey("호랑이"));
		System.out.println("코끼리가 있나? : "+map.containsKey("코끼리"));
		System.out.println("90점인 동물이 있나? : "+map.containsValue(90));
		System.out.println("50점인 동물이 있나? : "+map.containsValue(50));
		System.out.println();
		
		/* map에 저장된 객체 전체를 가져오기1*/
		// [1] key들만 Set 컬렉션에 담기
		// Set<K> keySet() : map에 저장된 key값들만 Set 컬렉션에 담는다.
		Set<String> keySet = map.keySet();
		//Iterator 인터페이스의 iterator() 메소드를 이용해서 keySet의 iterator를 얻는다.
		Iterator<String> keyIterator = keySet.iterator();
		
		System.out.println("[객체 전체 가져오기 1]");
		while (keyIterator.hasNext()) {
			//interator를 이용해서 key를 하나씩 가져옴
			String key = keyIterator.next();
			//map에서 key로 검색하여 value를 얻는다. 
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();

		/* 객체 삭제 */
		//V remove(Object key) : 주어진 key에 해당하는 Map.Entry를 삭제하고 value을 리턴함
		System.out.println("[객체 삭제]");
		map.remove("호랑이");  //70을 리턴함.
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		/* 객체 전체 삭제 */
		//void clear() : 모든 Map.Entry를 삭제한다.
		System.out.println("[Map.Entry 전체 삭제]");
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		/* 선언한 map 객체가 비어있는지 검사하기 */
		//boolean isEmpty() : map 컬렉션이 비어있으면 true 리턴
		System.out.println("[map 컬렉션이 비어 있는지 검사]");
		System.out.println("map 컬렉션이 비어 있는가? : "+map.isEmpty());
		System.out.println();
		if(map.isEmpty()) {
			//비어있으면 새로운 객체 추가함. 
			map.put("tiger", 85);
			map.put("lion", 90);
			map.put("giraffe", 80);
			map.put("rhinoceros", 95);
			map.put("zebra", 95);
		}
		
		/* map에 저장된 객체 전체를 가져오기2 */
		// [2] Map.Entry 객체를 Set에 담는다.
		// Set<Map.Entry<K, V> entrySet() : key와 value로 구성된 Map.Entry 객체를 Set에 담는다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//Iterator 인터페이스의 iterator() 메소드를 이용해서 entrySet의 iterator를 얻는다.
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		System.out.println("[객체 전체 가져오기 2]");
		while (entryIterator.hasNext()) {
			//entrySet의 iterator를 이용해서 Map.Entry를 얻는다.
			Map.Entry<String, Integer> entry = entryIterator.next();
			//getKey() : entry에서 key 값을 가져온다.
			String key = entry.getKey();
			//getValue() : entry에서 value 값을 가져온다.
			Integer value = entry.getValue();
			System.out.println( key + " : " + value);
		}
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
	} //end main

} //end class
