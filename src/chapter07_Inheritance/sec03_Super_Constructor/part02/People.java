package chapter07_Inheritance.sec03_Super_Constructor.part02;

public class People {
	
	public String name;
	public String ssn;

	/**
	 * 기본 생성자는 항상 선언하는 것을 권장.
	 *   (1) 매개변수가 있는 생성자가 선언되어 있으면, 기본 생성자로 객체를 생성하지 못함.
	 *   (2) 자식클래스 생성자에서 부모생성자를 명시적으로 호출(super()) 하지 않을 경우, 컴파일 오류 발생
	 *     : Implicit super constructor People() is undefined. Must explicitly invoke another constructor
	 */
	public People() {}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
