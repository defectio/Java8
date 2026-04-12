package chapter06_Class.sec08_Method.part03_MethodCall.inner;

public class Calculator {

	/* 
	 * [객체 내부 메소드 호출하기]
	 *   - 단순 메소드 이름으로 호출한다
	 */
	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	public double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	public void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}

	public void println(String message) {
		System.out.println(message);
	}
		
}//end class
