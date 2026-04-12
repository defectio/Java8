package chapter05_ReferenceType.sec05_String;

public class my03_StringExample {

	public static void main(String[] args) {
		
		//객체가 없으면 초기화 하라는 메시지 나옴.
		//The local variable name may not have been initialized
		String name;
		//System.out.println(name);
		
		//String은 클래스(참조타입)이므로 null로 초기화 할 수 있다. null은 참조하는 객체가 없다는 의미
		// 기본 타입은 null로 초기화 할 수 없다.
		String hobby = null;

		String major = "mathematics";
		major = null;
		major = "physics";
		
		//null값으로 바꾸니까 힙 영역에 null인 String 객체를 참조하는 것처럼 바뀐다.
		//참조하는 객체가 없다면, 사용시에 NullPointerException이 발생할 텐데 발생하지 않고 null을 출력한다.
		System.out.println("취미 : "+hobby);
		System.out.println("전공 : "+major);
	}

}
