package chapter13_Generic.sec04_GenericMethod.part02;

public class Util {
	/*
	 * [제네릭 메소드]
	 *   - 제네릭 메소드는 매개타입과 리턴타입으로 타입 파라미터를 갖는 메소드를 말한다.
	 *   - 리턴타입 앞에 <> 기호를 추가하고 타입파라미터를 기술한 다음, 리턴타입과 매개타입으로 타입 파라미터를 사용하면된다. 
	 *     즉, 리턴타입과 매개타입에 제네릭을 쓰고 싶으면 리턴타입 앞에 <T> 를 반드시 명시해야한다. 
	 */
	
	//public <T> 리턴타입 method(T t) { ... }  -> 리턴타입이 객체가 아닐 경우 타입파라미터 쓸 필요 없음.
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		//p1, p2(매개변수)의 key값과 value 값이 동일하면 true 리턴
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
	}
	
} //end class