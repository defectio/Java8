package chapter06_Class.sec07_Constructor.part01_Declaration;

public class KoreanExample {

	public static void main(String[] args) {
		//기본 생성자가 없으므로 생성 불가
		//명시적 생성자가 선언되어 있고, 기본 생성자 선언이 없다면 기본 생성자로 객체 생성 불가능
		//Korean k = new Korean();   
		
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	} //end main

} //end class