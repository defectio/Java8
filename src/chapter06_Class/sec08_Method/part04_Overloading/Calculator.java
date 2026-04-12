package chapter06_Class.sec08_Method.part04_Overloading;

public class Calculator {
	
	/*
	 * [메소드 오버로딩]
	 *  - 클래스 내에 같은 이름의 메소드를 여러개 선언하는 것을 메소드 오버로딩(Overloading)이라고 한다.
	 *  - 메소드 오버로딩 조건은 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다.
	 *  - 메소드 오버로딩이 필요한 이유 : 매개값을 다양하게 받아 처리할 수 있도록 하기 위함.
	 *  - 오버로딩된 메소드를 호출할 경우 JVM은 매개값의 타입을 보고 메소드를 선택한다.
	 *  - 오버로딩된 메소드 호출시 자동타입변환 가능
	 */
	
	//자동타입변환 예시
	//plus() 메소드가 다음과 같을 때, plus(10, 20.3)을 호출하면 어떻게 될까?
	public int plus(int x, int y) {
		return x+y;
	}
	public double plus(double x, double y) {
		return x+y;
	}
	//첫번째 매개변수 타입이 int, 두번째 매개변수 타입이 double인 메소드가 없어서 컴파일 오류가 날 것 같지만, plus(double x, double y) 메소드가 실행된다.
	//JVM은 일차적으로 매개 변수 타입을 보지만, 매개변수의 타입이 일치 하지 않을 경우, 자동타입변환이 가능한지를 검사한다.
	//첫번째 매개변수 타입인 int는 double로 자동타입변환이 가능하므로 plus(double x, double y) 메소드가 실행되는 것이다.
	
	/* 사각형의 넓이 구하는 areaRectangle() 메소드 */
	//정사각형의 넓이 : 매개변수 1개(한 변의 길이만 필요함)
	public double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이 : 매개변수 2개(두 변의 길이가 필요함)
	public double areaRectangle(double width, double height) {
		return width * height;
	}	
	
} //end class