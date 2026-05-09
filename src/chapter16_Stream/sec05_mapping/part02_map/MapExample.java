package chapter16_Stream.sec05_mapping.part02_map;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	/**
	 * 매핑(mapping)은 중간처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다.
	 * 스트림에서 제공하는 매핑 메소드는 flatMapxxx(), mapxxx(), asDoubleStream(), asLongStream(), boxed()가 있다. 
	 */
	public static void main(String[] args) {
		/**
		 * mapxxx() 메소드
		 *   : 요소를 대체하는 요소로 구성된 새로운 스트림을 리턴한다.
		 */
		
		List<Member> member = Arrays.asList(
			new Member("thor", 25),
			new Member("steve", 30),
			new Member("stark", 35)
		);
		
		member.stream()
			.mapToInt(Member :: getAge)
			.forEach(age -> System.out.println(age));
	}

}
