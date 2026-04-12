package chapter11_API.sec03_java_lang.part01_Object;

import java.util.HashMap;

public class my02_HashCodeExample {

	// 중첩 클래스
	public class Key {
		public int number;

		public Key(int number) {
			this.number = number;
		}

		// number 값이 같으면 true를 리턴하도록 equals() 메소드 재정의
		@Override
		public boolean equals(Object obj) {
			// (1) 매개값(obj)이 기준 객체(Key)와 동일타입인지 확인해서 강제 타입 변환
			if (obj instanceof Key) {
				Key compareKey = (Key) obj;
				// (2) 필드값이 동일한지 검사
				if (this.number == compareKey.number) {
					return true;
				}
			}
			return false;
		}

		/**
		 * [hashCode()] - 객체를 식별할 하나의 정수값
		 *   - Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있다.
		 *   - 논리적 동등 비교 시 hashCode()를 오버라이딩 할 필요성이 있다.
		 *   - HashSet, HashMap, HashTable은 다음과 같은 방법으로 두객체가 동일한지 비교 한다.
		 *   	(1) hashCode() 리턴값 동일 
		 *   	 (2) equals() 리턴값 동일  -> 동등객체
		 */
		@Override
		public int hashCode() {
			return number;
		}

	} // end Key

	public static void main(String[] args) {
		// 외브 클래스 생성
		my02_HashCodeExample hc = new my02_HashCodeExample();

		// Key 객체를 식별키(key)로 사용해서 String값(value)를 저장하는 HashMap 객체 생성
		HashMap<Key, String> map = new HashMap<Key, String>();
		map.put(hc.new Key(1), "홍길동");

		/**
		 * Key 클래스에서 hashCode() 메소드를 재정의 하지 않았다면? 
		 *   - 식별키 new Key(1)로 "홍길동"을 읽어 오려하지만, 결과는 null이 나온다. 
		 *   - hashCode() 메소드에서 리턴하는 해시코드가 다르기 때문에 다른 키로 인식되어 값을 가져오지 못한다.
		 * 
		 * Key 클래스에서 hashCode() 메소드를 재정의 했다면? 
		 *   - new로 Key 객체를 생성하지만, hashCode() 리턴값이 같고, equals() 메소드가 true를 리턴하기 때문에 동등한 객체로 인식한다. 
		 *   - HashMap에서 Key 객체를 동등 객체로 평가해서, "홍길동" 값을 찾아 올 수 있다.
		 */
		String value = map.get(hc.new Key(1));
		System.out.println(value);

		// 결론적으로, 객체의 동등비교를 위해서 Object의 equals() 메소드만 재정의 하지 말고,
		// hashCode() 메소드도 재정의해서 논리적 동등 객체일 경우 동일한 해시코드가 리턴되도록 해야한다.

	} // end main

} // end class