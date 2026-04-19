package chapter16_Stream.sec01_Intro.part02_Parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"stark", "steve", "thor", "pury", "james" 
		);
		
		/**
		 * 2. 내부 반복자를 사용하므로 병렬 처리가 쉽다.
		 * 외부반복자(for, while, iterator 등)를 사용하면, 요소를 가져오 것에서 부터 처리하는 것까지 모두 개발자가 작성해야함.
		 * 반면, 내부반복자를 사용하면 컬렉션 내부에서 요소를 어떻게 반복시킬 것인가는 컬렉션에게 맡겨두고, 개발자는 요소 처리 코드에 집중할 수 있다.
		 * 스트림을 사용하면 코드도 간결해지지만, 무엇보다도 요소의 병렬처리가 컬렉션 내부에서 처리되므로 일석이조의 효과를 가져온다. 
		 * 
		 * 병렬처리
		 * 한 가지 작업을 서브 작업으로 나누고, 서브작업들을 분리된 스레드에서 병렬적으로 처리하는 것을 말한다.
		 * 병렬처리 스트림을 이용하면 런타임 시 하나의 작업을 서브 작업으로 자동으로 나누고, 서브 작업의 결과를 자동으로 결합해서 최종 결과물을 생성한다.
		 * ex) 순차처리 스트림 : 하나의 스레드가 요소들을 순차적으로 읽어 합을 구한다.
		 *     병렬처리 스트림 : 여러개의 스레드가 요소들을 부분적으로 합하고 이 부분합을 최종 결합해서 전체합을 생성한다.
		 */
		
		// 순차처리 스트림
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		System.out.println();
		
		// 병렬처리 스트림
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}

	public static void print(String str) {
		System.out.println(str +" : " + Thread.currentThread().getName());
	}
}
