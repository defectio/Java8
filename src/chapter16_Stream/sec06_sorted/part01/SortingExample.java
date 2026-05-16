package chapter16_Stream.sec06_sorted.part01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted()
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		// 객체 기본 정렬
		List<Student> students = Arrays.asList(
			new Student("thor", 30),
			new Student("steve", 10),
			new Student("stark", 23)
		);
			
		/**
		 * 객체 기본 정렬
		 *  - sorted()
		 *  - sorted((a, b) -> a.compareTo(b))
		 *  - sorted(Comparator.naturalOrder())
		 */
		students.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getScore() + "-" + s.getName()));
		
		System.out.println();
		
		/**
		 * 객체 역순 정렬
		 *  - sorted((a, b) -> b.compareTo(a))
		 *  - sorted(Comparator.reverseOrder())
		 */
		students.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.println(s.getScore() + "-" + s.getName()));
		
		System.out.println();
		
		// Comparable 구현하지 않은 객체 정렬
		List<Product> products = Arrays.asList(
			new Product("iphone", 1000),
			new Product("iPad", 3000),
			new Product("Mac-Book", 2000),
			new Product("Mac-Pro", 7000),
			new Product("Mac-Mini", 5500)
		);
		
		// Comparable 구현하지 않은 객체를 스트림으로 sorted() 하기 때문에 
		// java.lang.ClassCastException:Product cannot be cast to java.lang.Comparable 발
//		products.stream()
//			.sorted()
//			.forEach(p -> System.out.println(p.getPrice() + "-" + p.getName()));
		
		/**
		 * 객체 요소가 Comparable을 구현하지 않았다면 Comparator를 매개값으로 갖는 sorted() 메소드를 사용하면 된다.
		 * a, b 비교해서 정렬 방법별 리턴 코드를 작성하면 된다.
		 *  1. 오름차순 정렬 방법
		 *  	- a < b : 음수 리턴
		 *  	- a = b : 0 리턴
		 *  	- a > b : 양수 리턴
		 *  2. 내림차순 정렬 방법
		 *  	- a < b : 양수 리턴
		 *  	- a = b : 0 리턴
		 *  	- a > b : 음수 리턴
		 */
		products.stream()
			.sorted((a, b) -> {
				return a.getPrice() - b.getPrice();
			})
			.forEach(p -> System.out.println(p.getPrice() + "-" + p.getName()));
		
		System.out.println();
		
		products.stream()
			.sorted((a, b) -> {
				return b.getPrice() - a.getPrice();
			})
			.forEach(p -> System.out.println(p.getPrice() + "-" + p.getName()));
		
	}

}
