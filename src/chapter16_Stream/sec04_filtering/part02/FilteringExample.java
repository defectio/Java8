package chapter16_Stream.sec04_filtering.part02;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
//		Member m1 = new Member("thor", Member.MALE, 30);
//		Member m2 = new Member("thor", Member.MALE, 30);
//		
//		System.out.println(m1.equals(m2));
//		
//		System.out.println(m1.hashCode());
//		System.out.println(m2.hashCode());
		
		List<Member> list = Arrays.asList(
			new Member("thor", Member.MALE, 30),
			new Member("thor", Member.MALE, 30),
			new Member("potts", Member.FEMALE, 33),
			new Member("stark", Member.MALE, 40),
			new Member("wanda", Member.FEMALE, 25),
			new Member("steve", Member.MALE, 25),
			new Member("thor", Member.MALE, 25)
		);
		
		// Member 중에서 중복이름을 제거한 멤버만 출력
		// 객체에서 중복을 제거하려면, Member 객체에서 equals(), hashCode() 재정의
		// 참고. https://velog.io/@sonypark/Java-equals-hascode-%EB%A9%94%EC%84%9C%EB%93%9C%EB%8A%94-%EC%96%B8%EC%A0%9C-%EC%9E%AC%EC%A0%95%EC%9D%98%ED%95%B4%EC%95%BC-%ED%95%A0%EA%B9%8C
		list.stream()
			.distinct()
			.forEach(m -> System.out.println(m.toString()));
		
		System.out.println();
		
		// Memeber 중에서 FEMALE 멤버만 출력
		list.stream()
			.filter(m -> m.getGender() == Member.FEMALE)
			.forEach(m -> System.out.println(m.toString()));
		

	}

}
