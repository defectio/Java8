package chapter16_Stream.sec07_looping.part01;

import java.util.Arrays;

public class LoopingExample {

	/**
	 * Looping : 요소 전체를 반복한다.
	 *  1. peek() : 중간처리 메소드
	 *  	- 중간 처리 단계에서 전체 요소를 루핑하면서 추가적인 작업을 하기 위해 사용
	 *  	- 최종 처리 메소드가 실행되지 않으면 지연되기 때문에 반드시 최종 처리 메소드가 호출되어야 동작한다.
	 *  2. forEach() : 최종처리 메소드
	 *  	- 최종 처리 메소드이기 때문에 파이프라인 마지막에 루핑하면서 요소를 하나씩 처리한다.
	 *  	- forEach() 메소드 호출 후, 다른 최종 처리 메소드를 호출하면 안된다.
	 */
	public static void main(String[] args) {
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		
		// 최종 처리 메소드가 호출되지 않아, peek() 메소드는 실행되지 않음
		System.out.println("peek()를 마지막에 호출한 경우");
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.peek(n -> System.out.println(n));
		
		System.out.println();
		
		// 요소 처리의 최종 단계가 합을 구하는 것이라면, peek() 호출 후 sum()을 호출해야만 peek()가 정상적으로 동작한다.
		System.out.println("peek() 이후에 최종 처리 메소드를 호출한 경우");
		int total = Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.peek(n -> System.out.println(n))
			.sum();
		System.out.println("짝수의 총합 : " + total);
		
		System.out.println();
		
		// 필터링 후 어떤 요소만 남았는지 확인하는 경우
		System.out.println("forEach()를 마지막에 호출한 경우");
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.forEach(n -> System.out.println(n));
	}

}
