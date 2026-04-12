package chapter15_CollectionFramework.sec04_Map.part01_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class my03_MapWithList {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("호랑이", 85);
		map1.put("사자", 77);
		//map1 전체가 하나의 list로 들어감
		list.add(map1);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("기린", 60);
		map2.put("코끼리", 90);
		//map2 전체가 하나의 list로 들어감
		list.add(map2);
		
		for(Object obj : list) {
			System.out.println(obj);
		}

	}

}
