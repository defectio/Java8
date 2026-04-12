package chapter09_Nested.sec05_Anonymous.part03_Local_Access;

public class Anonymous {
	
	private int field;
	
	/**
	 * 메소드 내 선언된 익명 구현 객체에서 메소드의 로컬변수와 매개변수 사용 시 주의할점
	 *   - 익명객체에서 사용된 매개변수와 로컬변수는 모두 final 특성을 갖는다.
	 * @param arg1
	 * @param arg2
	 */
	public void method(final int arg1, int arg2) {

		final int var1 = 0;
		int var2 = 0;
		
		/**
		 * 필드 -> 익명 객체에서 사용 시 문제 없음.(메소드의 로컬변수와 매개변수만 제한)
		 */
		field = 10;
		field = 20;
		
		/**
		 * [method()의 내부에 선언된 필드(지역 변수)]
		 *   final을 선언하든 안하든 익명 객체에서 사용된 지역 변수는 final 특성을 갖는다.
		 *   - final 지역변수(var1) : 익명 구현 객체 내부에서 사용 가능. 값 변경 불가
		 *   - 지역변수(var2) : 익명 구현 객체 내부에서 사용 가능. "익명 구현 객체에서 사용한다면" final의 특성을 갖는다.(값 변경 불가)
		 */
//		var1 = 30;  // (x) final로 선언된 지역변수라서 변경 불가
		var2 = 30;		// 익명 객체 내에서 사용하지 않았기 때문에 final의 특성을 갖지 않는다.
		
		/**
		 * [method()의 매개값]
		 *   final을 선언하든 안하든 익명 객체에서 사용된 매개변수는 final 특성을 갖는다.
		 *   - final 매개값(arg1) : 익명 구현 객체 내부에서 사용 가능. 값 변경 불가
		 *   - 매개값(arg2) : 익명 구현 객체 내부에서 사용 가능. "익명 구현 객체에서 사용한다면" final의 특성을 갖는다.(값 변경 불가)
		 */
//		arg1 = 20;  // (x) final로 전달받은 매개값이라서 변경 불가
//		arg2 = 20;  // (x) 익명 객체 내에서 사용했기 때문에 final의 특성을 갖는다.
		
		/**
		 * [메소드 내부에서 생성된 익명 객체]
		 * 	 - 익명 객체 내부에서는 바깥 클래스의 필드나 메소드는 제한 없이 사용할 수 있다. 
		 *     문제는 메소드의 내부의 매개변수나 로컬변수를 익명 객체에서 사용할 때이다.
		 *  - 메소드 내에서 생성된 익명 객체는 메소드 실행이 끝나도 힙 메모리에 존재해서 계속 사용할 수 있다.
		 *    매개변수나 로컬변수는 메소드 실행이 끝나면 스택 메모리에서 사라지기 때문에 익명 객체에서 사용할 수 없게 되므로 문제가 발생한다.
		 *     
		 */
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1;
				return result;
			}
		};
		
		/**
		 * 메소드 내부에서 선언된 익명 구현 객체는 메소드 외부에서 사용 불가
		 * 	  - method() 내부에서 calc.sum() 메소드 실행 
		 */
		System.out.println("sum : "+calc.sum());
	} //end method
	
} //end class