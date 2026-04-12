package chapter06_Class.sec10_StaticMember.part01_Declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		/* 
		 * 정적멤버(필드, 메소드)는 객체 생성없이 클래스명으로 직접 접근 가능하다.
		 * 객체 생성 후 객체 참조 변수로도 사용가능 하지만 권장하지 않는다. -> 이클립스에서는 경고 표시가 나타난다.
		 */
		//Calculator cal = new Calculator();
		//double result1 = 10 * 10 * cal.pi;		//참조변수로 Calculator 객체의 정적 필드에 접근 할 수 있으나, 권장하지 않음.
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	} //end main

} //end class