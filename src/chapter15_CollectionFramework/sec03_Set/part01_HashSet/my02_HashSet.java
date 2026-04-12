package chapter15_CollectionFramework.sec03_Set.part01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class my02_HashSet {
	/*
	 * [Set]
	 * 		- 저장 순서가 유지 되지 않고, 객체를 중복해서 저장할 수 없다. -> 들어갈 때의 순서와 나올 때의 순서가 다를 수 있다.
	 * 		- 하나의 null만 저장할 수 있다?
	 *  	- 인덱스를 사용하지 않는다 -> 인덱스를 사용하는 메소드들이 없다
	 * 		- 구현 클래스 : HashSet, LinkedHashSet, TreeSet
	 */
	public static void main(String[] args) {
		/*
		 *	[HashSet]
		 *		- HashSet은 Set 인터페이스의 구현 클래스 이다. 
		 *		- HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복저장하지 않는다.
		 *		
		 *	 * HashSet이 판단하는 동일한 객체란?
		 *		(1) HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어 낸다.
		 *		(2) 이미 저장되어 있는 객체들의 해시코드와 비교한다. -> 해시코드가 다르면, 다른 객체임.
		 *		(3) 동일한 해시코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일객체로 판단하고 중복 저장하지 않는다.  
		 *	 * 문자열을 HashSet에 저장할 경우, 같은 문자열을 갖는 String 객체는 동등한 객체로 간주되고 다른 문자열을 갖는 String 객체는 다른 객체로 간주된다.
		 *		- String 클래스가 hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우,
		 *		  hashCode() 리턴값은 같게, equals() 리턴값은 true가 나오게 하였다.
		 */
		
		//my02_Student 객체는 이름과 전공이 같으면 같은 학생 객체로 간주하여 중복저장되지 않도록 해야 한다.
		//그러나, my02_Student 클래스에는 이름과 전공이 같으면 같은 학생 객체로 간주하는 hashCode(), equals() 메소드가 재정의 되어 있지 않다.
		//그래서 new my02_Student("shine", "management") 객체를 동일한 객체로 인식하지 않는다.
		Set<my02_Student> studentSet = new HashSet<>();
		//hashSet에 객체를 저장하기 전에 hashCode() 메소드를 호출해서 저장하려는 객체의 해시코드를 얻어낸다.
		studentSet.add(new my02_Student("leo", "math"));
		studentSet.add(new my02_Student("shine", "management"));
		studentSet.add(new my02_Student("shine", "management"));
		
		Iterator<my02_Student> iterator1 = studentSet.iterator();
		System.out.println("[student]");
		System.out.println("전체 학생 수 : "+studentSet.size());
		while(iterator1.hasNext()) {
			my02_Student student = iterator1.next();
			System.out.println("이름 : "+student.name+", 전공 : "+student.major );
		}
		System.out.println();
		
		//my02_Member 객체는 이름과 나이가 같으면 같은 회원 객체로 간주하여 중복저장되지 않도록 해야 한다.
		//my02_Member 클래스에는 이름과 나이가 같으면 같은 회원 객체로 간주하는 hashCode(), equals() 메소드가 재정의 되어 있다.
		//그래서 new my02_Member("leo", 25) 객체는 동일한 객체로 간주되어 중복 저장되지 않는다.
		Set<my02_Member> memberSet = new HashSet<>();
		memberSet.add(new my02_Member("leo", 25));
		memberSet.add(new my02_Member("leo", 25));
		memberSet.add(new my02_Member("shine", 26));
		System.out.println("[member]");
		System.out.println("전체 회원 수 : "+memberSet.size());
		for(my02_Member member : memberSet) {
			System.out.println("이름 : "+member.name+", 나이 : "+member.age );		
		}
		
	} //end main

} //end class
