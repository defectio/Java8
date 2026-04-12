package chapter06_Class.sec08_Method.part04_Overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator calc = new Calculator();
		
		//자동타입변환 예시 -> plus(double x, double y) 가 호출됨
		int x = 10;
		double y = 20.3;
		System.out.println("x + y = "+calc.plus(x, y));
		
		//정사각형의 넓이 구하기
		double result1 = calc.areaRectangle(10);

		//직사각형의 넓이 구하기
		double result2 = calc.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);

	} //end main

} //end class
