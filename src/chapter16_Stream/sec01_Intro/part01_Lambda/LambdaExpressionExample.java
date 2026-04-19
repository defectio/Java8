package chapter16_Stream.sec01_Intro.part01_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("stark", 20),
			new Student("thor", 33)
		);
		
		/**
		 * 1. 람다식으로 요소 처리 코드를 제공한다.
		 * Stream이 제공하는 대부분의 요소 처리 메소드는 함수적 인터페이스 매개타입을 가지기 때문에, 
		 * 람다식 또는 메소드 참조를 이용해서 요소 처리 내용을 매개값으로 전달할 수 있다.
		 */
		Stream<Student> stream = list.stream();  // List 컬렉션으로 부터 stream 얻기 
		stream.forEach( s -> {
			// List 컬렉션에서 Student 객를 가져와 람다식의 매개값으로 제공
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " - " + score);
		});

	}

}
