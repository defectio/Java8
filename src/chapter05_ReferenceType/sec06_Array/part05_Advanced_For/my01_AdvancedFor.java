package chapter05_ReferenceType.sec06_Array.part05_Advanced_For;

public class my01_AdvancedFor {

	/*
	 * [향상된 for문]
	 * 자바 5부터 배열 및 컬렉션 객체를 좀 더 쉽게 처리할 목적으로 향상된 for문을 제공한다.
	 * 향상된 for문은 반복 실행을 위해 카운터 변수와 증감식을 사용하지 않는다.
	 * 배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져 나간다.
	 * 즉, 카운터 변수와 증감식의 필요 없이, 항목 전체 개수 만큼 반복한다.
	 */
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		/*
		 * 	for(타입 변수 : 배열) {
		 * 		실행문;
		 * }
		 * 
		 */
		//배열에서 가져올 값이 존재할 경우 for문에 선언한 변수에 저장한다. -> 실행문 실행
		//배열에서 가져올 값이 없을 경우 for문을 빠져 나간다.
		for (int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
