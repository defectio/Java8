package chapter07_Inheritance.sec03_Super_Constructor.part02;

public class Student extends People {
	
	public int studentNo;

	/**
	 * super()로 부모 생성자 명시적 호출
	 * @param name
	 * @param ssn
	 * @param studentNo
	 */
	public Student(String name, String ssn, int studentNo) {
		/**
		 * super(매개값1, 매개값2, ...) 은 매개값의 타입과 일치하는 부모 생성자를 호출한다.
		 * 그렇기 때문에 부모 클래스에는 super의 매개값과 일치하는 생성자가 반드시 존재해야한다.
		 * 만약, 매개값의 타입과 일치하는 부모 생성자가 없을 경우 컴파일 오류가 발생한다.
		 */
		
		// 부모 클래스에 String 매개값을 2개 받는 생성자가 반드시 있어야함. -> 없으면 컴파일 오류
		// 부모 생성자를 명시적으로 호출하지 않으면, 컴파일 오류 발생
		super(name, ssn);  
		
		/** 
		 * super(매개값,...) 가 생략되면 컴파일러에 의해 super()가 자동적으로 추가되기 때문에 부모의 기본생성자가 존재해야 한다.
		 * 	 (1) 부모 클래스에 생성자가 아예 없으면 정상
		 * 	 (2) 부모 클래스에 기본생성자가 없고, 매개값을 갖는 생성자가 있다면 컴파일 오류 발생.
		 * 
		 * super(매개값, ...) 이 생략되면 부모의 name, ssn 필드는 null로 초기화 된다.
		 */
		this.studentNo = studentNo;
	}
}
