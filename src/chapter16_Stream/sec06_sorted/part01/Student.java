package chapter16_Stream.sec06_sorted.part01;

public class Student implements Comparable<Student>{

	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	/**
	 * 객체 요소일 경우에는 클래스가 Comparable를 구현하지 않으면 sorted() 메소드 호출 시 ClassCastException 발생하기 때문에, 
	 * Comparable을 구현한 요소에서만 sorted() 메소드를 호출해야한다.
	 *
	 */
	
	// score 기준으로 Student 객체를 오름차순으로 정렬하기 위한 Comparable 구현
	@Override
	public int compareTo(Student o) {
		/**
		 * score < o.score : 음수 리턴
		 * score = o.score : 0 리턴
		 * score > 0.score : 양수 리
		 */
		return Integer.compare(score, o.score);
	}
	
}
