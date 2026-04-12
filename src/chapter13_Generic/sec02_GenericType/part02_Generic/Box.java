package chapter13_Generic.sec02_GenericType.part02_Generic;

public class Box<T> {

	//Object 타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만,
	//저장할 때 Object 타입으로 자동타입변환이 발생하고, 읽어올 때에도 강제타입변환이 발생한다.
	
	//모든 종류의 객체를 저장하면서 타입변환이 발생하지 않도록 하는 방법 -> "제네릭"
	/* 
	 * [제테릭 타입]
	 * 	 - 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
	 *  - <T>는 Box 클래스로 객체를 생성할 때 구체적인 타입으로 변경된다.
	 *		 ex)	Box<String> box = new Box<String>(); 
	 * 			   처럼 Box 객체를 생성하면 Box 클래스의 T는 String으로 자동으로 재구성 된다. 
	 */
	
	//T -> Box 객체 생성 시 타입 파라미터에 따라 다르게 생성됨 
	//즉, Box 객체 생성 시 구체적인 타입이 결정된다.
	private T t;
	
	public void set(T t) {
		this.t =t;
	}
	
	public T get() {
		return t;
	}
	
} //end class