package chapter11_API.sec03_java_lang.part06_Wrapper;

public class my04_ValueComparison {

	/*
	 * [Wrapper 클래스]
	 *   - 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다. -> Wrapper(포장) 객체
	 *   - 포장 객체의 특징은 포장하고 있는 기본 타입 값은 외부 에서 변경할 수 없다.
	 *      만약, 내부의 값을 변경하고 싶다면 새로운 포장 객체를 만들어야 한다.
	 */
	public static void main(String[] args) {
		
		//포장 객체는 내부의 값을 비교하기 위해 ==와 != 연산자를 사용할 수 없다.(객체니까 주소지 비교하는 연산이 된다.)
		//포장 객체 내부의 값만 비교하려면 언박싱한 값을 얻어 비교 해야 한다.
		/* 
		 *   boolean(true, false)
		 *   char(\u0000~\u007f)
		 *   byte,short,int(-128~127) 의 경우에는 ==, != 연산자로 내부의 값을 바로 비교 할 수 있다.
		 * 
		 *   이외의 경우에는 박싱된 값을 ==, != 연산자로 비교 할 수 없다.
		 */
		
		//즉, 포장 객체에 정확히 어떤 값이 저장될지 모르는 상황이라면 ==, != 연산자를 사용하지 않는 것이 좋다.
		//직접 내부 값을 언박싱 해서 비교하거나, equals() 메소드로 내부의 값을 비교하는 것이 좋다.
		//포장클래스이 equals() 메소드는 내부의 값을 비교하도록 오버라이딩 되어 있다.
		
		System.out.println("[-128~127 초과일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("obj1 == obj2 결과 : "+(obj1 == obj2));
		System.out.println("언박싱 후 obj1 == obj2 결과 : "+(obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과 : "+obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("obj3 == obj4 결과 : "+(obj3 == obj4));
		System.out.println("언박싱 후 obj3 == obj4 결과 : "+(obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 : "+obj3.equals(obj4));

	}

}
