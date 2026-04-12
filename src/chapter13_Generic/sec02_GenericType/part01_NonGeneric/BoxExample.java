package chapter13_Generic.sec02_GenericType.part01_NonGeneric;

public class BoxExample {
	
	/*
	 * [비제네릭 타입 사용시 문제점]
	 *  - Object 타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만,
	 *    저장할 때 Object 타입으로 자동타입변환이 발생하고, 읽어올 때에도 강제타입변환이 발생한다.
	 */
	public static void main(String[] args) {
		Box box = new Box();
		//매개변수가 String 타입 -> Object 타입으로 자동타입변환
		box.set("GLE");
		
		/*값을 가져올 때(받으려는 타입으로) casting 해야함 */
		//리턴타입이 Object여서 String으로 받으려면 casting 해야함.
		//String car = box.get();		//Type mismatch: cannot convert from Object to String 
		//casting 안하고 받으면 컴파일 오류
		String car = (String) box.get();

		box.set(new Apple());
		//Apple로 타입 변환해야함.
		Apple apple = (Apple) box.get();
		
	} //end main

} //end class
