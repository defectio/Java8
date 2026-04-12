package chapter11_API.sec03_java_lang.part07_Math;

public class my02_RoundExample {

	/*
	 * [Math 클래스]
	 *   - java.lang.Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공하고 있다.
	 *   - Math 클래스가 제공하는 메소드는 모두 정적(static) 이므로 Math 클래스로 바로 사용이 가능하다.
	 */
	public static void main(String[] args) {
		
		/* double ceil(double a) : 올림 */
		System.out.println("Math.ceil(5.3) : "+Math.ceil(5.3));
		System.out.println("Math.ceil(-5.3) : "+Math.ceil(-5.3));
		
		/* double floor(double a) : 버림 */
		System.out.println("Math.floor(5.3) : "+Math.floor(5.3));
		System.out.println("Math.floor(-5.3) : "+Math.floor(-5.3));
		
		/* long round(double a) : 반올림 */
		//round() 메소드는 소수점 첫째 자리에서 반올림해서 정수형으로 리턴함
		System.out.println("Math.round(5.3) : "+Math.round(5.3));
		System.out.println("Math.round(-5.3) : "+Math.round(-5.3));
		System.out.println();
		
		//////////////////////////////////////////////////
		
		//반올림 해서 소수점 둘째 자리 까지 나타내기
		/*
		 * [Hint] 
		 *   - round()는 소수점 첫째자리에서 반올림해서 정수 실수로 리턴함
		 *   	-> (1) 반올림 해야할 위치가 소수점 첫째 자리 까지 오도록 10의 거듭제곱을 곱한다.
		 *   	-> (2) Math.round() 메소드로 반올림해서 정수 실수로 만든다.
		 *   	-> (3) Math.round()의 결과에 (1)에서 곱한 10의 거듭제곱 만큼을 나눈다.
		 *   			  여기서 정수 거듭제곱으로 나누면 정수/정수 이기 때문에 정수 실수를 리턴함. 
		 */
		double test = 123.456789;
		
		System.out.println("test : "+test);
		double result = Math.round(test * 100) / 100;	
		//"정수/정수" 연산은 몫을 리턴한다.
		System.out.println(result);
		
		result = Math.round(test * 100.0) / 100.0;
		System.out.println(result);

	} //end main

} //end class