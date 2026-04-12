package chapter15_CollectionFramework.sec04_Map.part01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class my02_HashMapExample {

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
		System.out.println("[Member]");
		Map<my02_Member, Integer> map1 = new HashMap<my02_Member, Integer>();
		
		//my02_Member 클래스에 hashCode(), equals() 메소드를 재정의 하지 않았다.
		//new 연산자로 생성한 my02_Member(1, "tiger") 객체를 동일한 객체로 인식하지 않는다.
		//즉, 동일한 키로 인식되지 않기 때문에 중복 저장된다.
		map1.put(new my02_Member(1, "tiger"), 70);
		map1.put(new my02_Member(1, "tiger"), 74);
		map1.put(new my02_Member(2, "lion"), 79);
		
		System.out.println("총 Entry 수: " + map1.size());
		
		Set<my02_Member> member = map1.keySet();
		Iterator<my02_Member> memberIterator = member.iterator();
		
		System.out.println("학번\t이름\t\t점수");
		while(memberIterator.hasNext()) {
			my02_Member memberKey = memberIterator.next();
			//int sno = memberKey.sno;
			//String name = memberKey.name;
			int score = map1.get(memberKey);
			
			System.out.print(memberKey.sno+"\t"+memberKey.name+"\t\t"+score+"\n");
		}
		System.out.println();
		
		System.out.println("[Student]");
		Map<my02_Student, Integer> map2 = new HashMap<my02_Student, Integer>();

		//my02_Student 클래스에 hashCode() 리턴값이 같고, equals()가 true를 리턴하면 동일한 객체로 인식하도록 재정의하였음. 
		//new 연산자로 생성한 my02_Student(1, "호랑이") 객체가 sno, name 값이 동일하므로 동일한 객체로 인식된다.
		//즉, 동일한 객체(키)로 인식되기 때문에 중복저장되지 않는다. 
		//만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체 된다.
		map2.put(new my02_Student(1, "호랑이"), 95);
		map2.put(new my02_Student(1, "호랑이"), 80);  //동일한 키가 있다면 value가 새로운 값으로 교체됨.
		map2.put(new my02_Student(2, "사자"), 80);

		System.out.println("총 Entry 수: " + map2.size());

		Set<Map.Entry<my02_Student, Integer>> entry2 = map2.entrySet();
		Iterator<Map.Entry<my02_Student, Integer>> iterator2 = entry2.iterator();
		
		System.out.println("학번\t이름\t\t점수");
		while(iterator2.hasNext()) {
			Map.Entry<my02_Student, Integer> entryIterator = iterator2.next();
			my02_Student student = entryIterator.getKey();
			int score = entryIterator.getValue();
			
			System.out.print(student.sno+"\t"+student.name+"\t\t"+score+"\n");
		} //end while
		
	} //end main

} //end class
