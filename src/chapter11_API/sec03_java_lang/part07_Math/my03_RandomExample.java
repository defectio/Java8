package chapter11_API.sec03_java_lang.part07_Math;

public class my03_RandomExample {

	/*
	 * [Math 클래스]
	 *   - java.lang.Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공하고 있다.
	 *   - Math 클래스가 제공하는 메소드는 모두 정적(static) 이므로 Math 클래스로 바로 사용이 가능하다.
	 */
	public static void main(String[] args) {
		
		/*
		 * [Math.random()]
		 *   - 0.0 <= ... < 1.0 사이에 속하는 double 타입의 값을 리턴한다.
		 */
		double ran = Math.random();
		System.out.println(ran);
		
		//1~6까지의 정수 난수 얻기
		//0.0 <= Math.random() < 1.0
		//0.0 * 6 <= Math.random() * 6 < 6.0
		//(int) 0.0 <= (int) Math.random() * 6 < (int) 6.0
		//1 <= (int) Math.random() * 6 + 1 < 7 사이의 난수 리턴
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위  : "+dice);
		
	}

}
