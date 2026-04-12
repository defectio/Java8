package chapter15_CollectionFramework.sec03_Set.part01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class my01_HashSet {
	/*
	 * [Set]
	 * 		- 저장 순서가 유지 되지 않고, 객체를 중복해서 저장할 수 없다. -> 들어갈 때의 순서와 나올 때의 순서가 다를 수 있다.
	 * 		- 하나의 null만 저장할 수 있다? -> null도 객체로 인식
	 *  	- 인덱스를 사용하지 않는다 -> 인덱스를 사용하는 메소드들이 없다
	 * 		- 구현 클래스 : HashSet, LinkedHashSet, TreeSet
	 */
	public static void main(String[] args) {
		/*
		 *	[HashSet]
		 *		- HashSet은 Set 인터페이스의 구현 클래스 이다. 
		 *		- HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복저장하지 않는다.
		 *		- HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지 않는다.
		 *		  HashSet은 객체를 저장하기전 먼저 객체의 hashCode() 메서드를 호출하여 해시코드를 얻고 이미 저장되어 있는 객체들의 해시코드와 비교한다. 
		 *		  만약 동일한 해쉬코드가 있다면 다시 equals() 메소드로 두 객체를 비교해 참이면 동일한 객체로 저장하고 중복 저장하지 않는다.
		 *		
		 *	 * HashSet이 판단하는 동일한 객체란?
		 *		(1) HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어 낸다.
		 *		(2) 이미 저장되어 있는 객체들의 해시코드와 비교한다. -> 해시코드가 다르면, 다른 객체임.
		 *		(3) 동일한 해시코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일객체로 판단하고 중복 저장하지 않는다.  
		 *
		 *	 * 문자열을 HashSet에 저장할 경우, 같은 문자열을 갖는 String 객체는 동등한 객체로 간주되고 다른 문자열을 갖는 String 객체는 다른 객체로 간주된다.
		 *		- String 클래스가 hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우,
		 *		  hashCode() 리턴값은 같게, equals() 리턴값은 true가 나오게 하였다.
		 */
		//Set<E> set = new HashSet<E>();
		Set<String> set = new HashSet<String>();

		/* boolean add(E e) : 주어진 객체를 저장 */
		// 객체가 성공적으로 저장되면 true 리턴, 중복객체면 false 리턴
		set.add("호랑이");
		set.add("호랑이");	//false 리턴함.
		set.add("사자");
		set.add("코끼리");
		set.add("라이언");
		set.add("기린");

		/* int size() : 저장되어 있는 전체 객체 수를 리턴 */
		int size = set.size();
		System.out.println("총 객체수: " + size);
		System.out.println();

		/* Set 객체 전체 출력 방법 [1] */
		/* Iterator<E> iterator() : 주어진 객체를 한 번씩 가져오는 반복자 리턴 */
		//Iterator : Iterator 인터페이스를 구현한 객체
		Iterator<String> iterator = set.iterator();
		/* 
		 * [Iterator에 선언된 메소드]
		 *  - boolean hasNext() : 가져올 객체가 있으면 true 리턴, 없으면 false 리턴 -> iterator로 모든 객체를 가져오면 리턴값이 false로 바뀐다. 즉, 선언된 iterator는 한 번밖에 사용 못함.
		 *  - E next() : 컬렉션에서 하나의 객체를 가져온다.
		 *  - void remove() : Set 컬렉션에서 객체를 제거한다.
		 */
		System.out.println("[전체 객체 출력]");
		System.out.println("iterator.hasNext() : "+iterator.hasNext());
		while(iterator.hasNext()) {
			String animal = 	iterator.next();
			System.out.println("animal = "+animal);
		}
		System.out.println("iterator.hasNext() : "+iterator.hasNext());
		System.out.println();
		
		/* 객체 삭제 방법 [1] */
		/* void remove() : Iterator의 next() 메소드로 가져온 객체를 제거한다. */
		Iterator<String> iterator2 = set.iterator();
		System.out.println("[객체 삭제 후 전체 객체 출력]");
		System.out.println("iterator.2hasNext() : "+iterator2.hasNext());
		while(iterator2.hasNext()) {
			String animal = 	iterator2.next();
			if(animal.equals("기린")) {
				iterator2.remove();	//Iterator의 remove() 메소드이지만, 실제 Set 컬렉션에서 객체가 제거된다
			}
		}
		
		/* 객체 삭제 방법 [2] */
		/* void remove(Object obj) : Set 컬렉션에서 매개변수에 해당하는 객체를 삭제 */
		//set.remove("기린");  //원래 없는 얘를 지우려함 -> 에러 발생 하지 않는다.
		set.remove("코끼리");
		
		/* Set 객체 전체 출력 방법 [2] */
		/* Iterator를 사용하지 않더라도 향상된 for문을 이용해서 전체 객체를 대상으로 반복 */
		for(String a : set) {	//저장된 객체 수만큼 루핑
			System.out.println(a);
		}
		System.out.println();

		/* void clear() : 저장된 모든 객체를 삭제 */
		System.out.println("[모든 객체 삭제]");
		set.clear();
		System.out.println("size() : "+set.size());
		System.out.println();
		
		/* boolean isEmpty() : 컬렉션이 비어있는지 조사 */
		System.out.println("[객체 삭제 후 다시 저장]");
		System.out.println("isEmpty() : "+set.isEmpty());
		if (set.isEmpty()) {
			System.out.println("set 객체는 비어있습니다.");
			set.add("tiger");
			set.add("lion");
			set.add("elephant");
			set.add("giraffe");
		} 
		
		for (String animal : set) {
			System.out.println(animal);
		}
		System.out.println();

		/* boolean contains(Object obj) : 주어진 객체가 저장되어 있는지 여부 */
		System.out.println("[객체가 저장되어 있는지 확인]");
		if (set.contains("tiger")) {
			System.out.println("tiger가 저장되어 있습니다.");
		} else {
			System.out.println("tiger가 없습니다.");
		}

		if (set.contains("호랑이")) {
			System.out.println("호랑이가 저장되어 있습니다.");
		} else {
			System.out.println("호랑이가 없습니다.");
		}
		
	} //end main

} //end class
