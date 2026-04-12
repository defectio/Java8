package chapter15_CollectionFramework.sec04_Map.part01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class my04_MapExample {

	public static void main(String[] args) {
		//주사위 100번 던져서 map으로 카운팅 하기
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0 ; i<100 ; i++) {
			int dice = (int) (Math.random() * 6)  + 1;
			//System.out.println(dice);
			if(map.containsKey(dice)) { //key가 있었다면
				map.put(dice, map.get(dice)+1);
			} else {
				map.put(dice, 1);
			}
		}
		
		System.out.println(map);
		
		System.out.println();
		
		Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, Integer> entryIterator = iterator.next();
			int dice = entryIterator.getKey();
			int count = entryIterator.getValue();
			System.out.println(dice+" : "+count+"회");
		}
 		
	} //end main

} //end class
