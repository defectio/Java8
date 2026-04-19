package chapter16_Stream.sec01_Intro.part03_Pipeline;

import java.util.Arrays;
import java.util.List;

import chapter16_Stream.sec01_Intro.part01_Lambda.Student;

public class PipelineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("stark", 90),
			new Student("thor", 80),
			new Student("james", 85),
			new Student("steve", 77),
			new Student("pury", 81)
		);
		
		double avg = list.stream()
				.mapToInt(Student :: getScore)  // 중간처리 : 학생 객체를 점수로 매
				.average()						// 최종처리 : 평균 구하기
				.getAsDouble();
		
		System.out.println("평균 점수 :" + avg);

	}

}
