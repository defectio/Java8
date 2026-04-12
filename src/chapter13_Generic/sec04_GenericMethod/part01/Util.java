package chapter13_Generic.sec04_GenericMethod.part01;

public class Util {
	/*
	 * [제네릭 메소드] 
	 *   - 제네릭 메소드는 매개타입과 리턴타입으로 타입 파라미터를 갖는 메소드를 말한다.
	 *   - 리턴타입 앞에 <> 기호를 추가하고 타입파라미터를 기술한 다음, 리턴타입과 매개타입으로 타입 파라미터를 사용하면된다. 
	 *     즉, 리턴타입과 매개타입에 제네릭을 쓰고 싶으면 리턴타입 앞에 <T> 를 반드시 명시해야한다. 
	 */
	//public <T> 리턴타입<T> method(T t) { ... }  -> 리턴타입이 객체일 경우 타입파라미터 명시
	
	//리턴타입 : Box<T>
	//매개값을 box에 담아서 Box 객체를 리턴
	public static <T> Box<T> boxing(T t) {
		//매개변수로 전달된 타입을 타입파라미터로 Box<T> 객체 생성. 
		Box<T> box = new Box<T>();
		box.set(t);		//Box<T> 객체에 매개값 저장
		
		//t(매개변수)가 setting된 Box<T> 리턴
		return box;
	}

} //end class