package chapter06_Class.sec11_Final.part01_Final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "이순신");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		/* Person 클래스의 final 필드(nation, ssn)는 값 수정 불가능 */
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		
		/* Person 클래스의 name 필드는 final이 아니기 때문에 변경 가능 */
		p1.name = "을지문덕";
		
	} //end main

} //end class