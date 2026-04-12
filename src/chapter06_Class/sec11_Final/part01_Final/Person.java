package chapter06_Class.sec11_Final.part01_Final;

public class Person {
	/*
	 * [final 필드]
	 *  - final 필드는 초기값이 저장되면 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없다.
	 *  - final 필드 초기화 방법
	 *  	(1) final 필드 선언시 초기화 : 단순 값이라면 제일 간단한 방법 
	 *  	(2) 생성자로 초기화 : 복잡한 초기화 코드가 필요하거나, 객체 생성 시 외부 데이터로 초기화 할 경우
	 */
	
	//[1] 선언시 초기화
	public final String nation = "Korea";
	
	//[2] 객체 생성시 외부 데이터로 초기화
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
} //end class
