package chapter06_Class.sec08_Method.part03_MethodCall.inner;

public class CalculatorExample {

	//객체 내부 메소드 호출
	public static void main(String[] args) {
		//객체 생성
		Calculator myCalc = new Calculator();
		
		/* 메소드 호출 순서 */
		// execute() -> avg() -> plus() -> println()
		
		//메소드 실행순서
		//plus() -> avg() -> println()
		myCalc.execute();
	
	} //end main

} //end class
