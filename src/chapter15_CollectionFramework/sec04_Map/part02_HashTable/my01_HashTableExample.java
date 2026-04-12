package chapter15_CollectionFramework.sec04_Map.part02_HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class my01_HashTableExample {

	/*
	 * [HashTable]
	 *  - HashTable(다중스레드)은 HashMap과 동일한 내부 구조를 가지고 있다. 
	 *  - HashTable도 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다.
	 * 
	 *  - HashMap과의 차이점은 HashTable은 동기화된(synchronized) 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드를 실행할 수는 없고, 
	 *    하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. 
	 *    그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. -> 스레드가 안전하다. thread safe 하다.
	 */

	public static void main(String[] args) {
		// HashTable 생성은 HashMap 생성 방법과 크게 다르지 않다.
		Map<String, Object> map = new Hashtable<>();

		map.put("이름", "레오");
		map.put("나이", 28);
		map.put("키", 171);
		map.put("성별", "남");

		System.out.println("map.size : "+map.size());
		System.out.println("map.get(\"이름\") :"+map.get("이름"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			// interator를 이용해서 key를 하나씩 가져옴
			String key = keyIterator.next();
			// map에서 key로 검색하여 value를 얻는다.
			Object value = map.get(key);
			System.out.println(key + " : " + value);
		}

		System.out.println(map);
	} //end main

} //end class
