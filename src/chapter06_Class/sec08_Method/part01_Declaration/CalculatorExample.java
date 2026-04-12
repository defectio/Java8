package chapter06_Class.sec08_Method.part01_Declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(5,  6);
		System.out.println("result1 : "+result1);
		
		byte x = 10;
		byte y = 4;
	
		//bytes를 double에 담는다 -> 자동 타입 변환
		double result2 = cal.divide(x, y);
		System.out.println("result2 : "+result2);

		/* sum1(int[] values) 호출방법 */
		// [1] 배열 생성 후 매개변수로 넘긴다.
		int[] array = {1, 3, 5, 7, 9};
		int result3 = cal.sum1(array);
		System.out.println("result3 : "+result3);
		
		// [2] 매개변수로 넘길 때 배열을 생성한다.
		int result4 = cal.sum1(new int[] {2, 4, 6, 8});
		System.out.println("result4 : "+result4);
		
		/* sum2(int ... values) 호출 방법 */
		// 배열 선언 없이 리스트 만으로 매개변수를 넘긴다.
		int result5 = cal.sum2(1, 2, 3);
		System.out.println("result5 : "+result5);
		
		cal.powerOff();

	} //end main

} //end class