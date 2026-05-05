package chapter16_Stream.sec04_filtering.part01;

import java.util.Arrays;
import java.util.List;

import chapter16_Stream.sec03_Pipeline.Member;

public class BasicExample {

	/**
	 * 필터링 : 중간처리 기능으로 요소를 걸러내는 역할을 한다.
	 *   - 필터링 메소드인 distinct(), filter() 메소드는 모든 스트림이 가지고 있는 공통 메소드이다.
	 */
	public static void main(String[] args) {
		/**
		 * 1. distinct()
		 * 	- 중복을 제거하는 메소드
		 * 	- Object.equal(Object)가 true이면 동일한 객체로 판단하고 중복을 제거한다.
		 * 	- IntStream, LongStream, DoubleStream은 동일값일 경우 중복을 제거한다.
		 */
		
		
		/**
		 * 2. filter()
		 * 	- 매개값으로 주어진 Predicate가 true를 리턴하는 요소만 필터링한다.
		 */
		
		List<String> names = Arrays.asList("thor", "potts", "stark", "wanda", "thor", "Thor", "steve");
		
		// 중복제거
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		// 필터링
		names.stream()
			.filter(n -> n.startsWith("s"))
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		// 중복 제거 후 필터링
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("s"))
			.forEach(n -> System.out.println(n));
	}

}