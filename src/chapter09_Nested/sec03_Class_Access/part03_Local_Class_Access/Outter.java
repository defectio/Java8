package chapter09_Nested.sec03_Class_Access.part03_Local_Class_Access;

/**
 * [로컬 클래스에서 사용 제한]
 *  - 로컬 클래스 내부에서는 바깥 클래스의 필드나 메소드를 제한 없이 사용할 수 있다.
 *  - 문제는 메소드의 매개변수나 로컬 변수를 로컬 클래스에서 사용할 때이다.
 *  - 로컬클래스의 객체는 메소드 실행이 끝나도 힙 메모리에 존재해서 계속 사용될 수 있다.
 *  - 매개 변수나 로컬 변수는 메소드 실행이 끝나면 스택 메모리에서 사라지기 때문에 로컬 객체에서 사용할 경우 문제가 발생한다.
 * 		-> 자바는 이 문제를 해결하기 위해 컴파일 시 로컬클래스에서 사용하는 매개 변수나 로컬 변수의 값을 로컬 클래스 내부에 복사해 두고 사용한다.
 * 		-> 그리고 매개변수나 로컬변수가 수정되어 값이 변경되면 로컬클래스에 복사해 둔 값과 달라지는 문제를 해결하기 위해 매개 변수나 로컬 변수를 final로 선언해 수정을 막는다.
 * 		-> 결론적으로, 로컬클래스에서 사용 가능한 것은 final로 선언된 매개 변수와 로컬변수 뿐이다.
 */
public class Outter {
	
	int instanceField = 1;
	static int staticField = 2;
	
	void instanceMethod() {
		System.out.println("인스턴스 메소드");
	}
	static void staticMethod() {
		System.out.println("정적 메소드");
	}
	
	// 바깥 클래스의 인스턴스 메소드(자바 7 이전)
	public void method1(final int arg) {  //final 키워드 없이 선언된 매개 변수나 로컬 변수를 로컬 클래스에서 사용하면 컴파일 에러가 발생한다.
		final int localVariable = 1;
		/* final은 수정 불가능 */
		//arg = 100; 						
		//localVariable = 100; 
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	/**
	 * 바깥 클래스의 인스턴스 메소드(자바 8 이후)
	 *  - 매개변수에 final 키워드 선언을 하지 않더라도 final 특성을 갖는다.
	 * @param arg
	 */
	public void method2(int arg) {
		
		int localVariable = 100;
//		final int localVariable = 1;
		
		/**
		 * 매개변수에 final 키워드가 없지만 final 특성을 갖기 때문에 수정 불가능하다.
		 * Local variable arg defined in an enclosing scope must be final or effectively final
		 */
//		 arg = 100;
		
		
		/**
		 * final 키워드가 있으면 로컬 클래스의 메소드 내부에 지역 변수로 복사
		 * final 키워드가 없다면 로컬 클래스의 필드로 복사된다.
		 * 		-> 로컬 클래스의 내부 복사위치에 신경 쓸 필요 없이 로컬 클래스에서 사용된 매개변수와 로컬 변수는 모두 final 특성을 갖는다.
		 */
		class Inner {
			int innerNum = 20;
			/**
			 * 로컬클래스에서 사용된 매개변수와 로컬 변수는 모두 final 특성을 갖는다. -> 위에서 변경 불가
			 */
			public void method() {
				/**
				 * method2() 에서 arg(매개변수)를 수정하려 한다면 에러 발생
				 * arg, localVariable은 인스턴스 메소드의 매개변수와 로컬변수를 가져다 쓰기 때문에 final 특성으로 바뀜(수정못함)
				 */
				int result = arg + localVariable;
				System.out.println("result = "+result);
				
				/**
				 * 	Inner 클래스 자체적으로 선언한 필드는 수정 가능
				 */
				System.out.println(innerNum);
				innerNum = 30; 
				System.out.println(innerNum);
			}
		} //end class Inner
		
		Inner in = new Inner();
		in.method();
	}

} //end class 