package chapter11_API.sec03_java_lang.part07_Math;

public class my01_NumericOperations {

	/*
	 * [Math 클래스]
	 *   - java.lang.Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공하고 있다.
	 *   - Math 클래스가 제공하는 메소드는 모두 정적(static) 이므로 Math 클래스로 바로 사용이 가능하다.
	 */
	public static void main(String[] args) {
		/* max() : 두 값을 비교 해서 최댓값 리턴함 */
		//int max(int a, int b)
		//double max(double a, double b) 
		int num1 = 10;
		int num2 = 20;
		int result1 = Math.max(num1, num2);
		System.out.println("Math.max(num1, num2) : "+result1);
		
		/* min() : 두 값을 비교 해서 최솟값 리턴함 */
		//max(int a, int b)
		//max(double a, double b) 
		double num3 = 11.23;
		double num4 = 21.11;
		double result2 = Math.min(num3, num4);
		System.out.println("Math.min(num3, num4) : "+result2);
		
		/* abs() : 절댓값 리턴 */
		//int abs(int a)
		//double abs(double a)
		int result3 = Math.abs(num1-num2);
		System.out.println("Math.abs(num1-num2) : "+result3);
		
		/* pow(double a, double b) : 거듭제곱(a^b) 리턴 */
		double result4 = Math.pow(2, 3);	//매개값이 int 이면 double로 자동타입변환됨
		System.out.println("Math.pow(2, 3) : "+result4);
	
	} //end main

} //end class