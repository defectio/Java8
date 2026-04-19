package chapter16_Stream.sec03_Pipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
			new Member("thor", Member.MALE, 30),
			new Member("potts", Member.FEMALE, 33),
			new Member("stark", Member.MALE, 40),
			new Member("wanda", Member.FEMALE, 25)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getGender() == Member.MALE) 	// 중간처리 : 남자 Member 객체를 요소로 하는 새로운 stream 생성
				.mapToInt(Member :: getAge)					// 중간처리 : Member 객체를 age로 매핑해서 age를 요소로 하는 새로운 stream 생성
				.average()									// 최종처리 : age 요소들의 평균을 OptioanalDouble에 저장한다
				.getAsDouble();								// OptionalDouble에 저장된 평균값을 읽으려면 getAsDouble() 메소드를 사용한다.
		
		System.out.println("남자 평균 나이 : " + ageAvg);

	}

}
