package chapter07_Inheritance.sec03_Super_Constructor.part02;

public class StudentExample {

	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		// 초기화된 부모 필드
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		System.out.println("studentNo : " + student.studentNo);
	}

}
