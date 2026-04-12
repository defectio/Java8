package chapter11_API.sec04_java_util.part04_Random;

import java.util.Random;

public class my01_RamdomExample {
	
	/*
	 * [Random 클래스]
	 *   - Math.random() 메소드는 0.0에서 1사이의 double 난수를 얻는데만 사용된다.
	 *   - Random 클래스는 boolean, int, long, float, double 난수를 얻을 수 있다. & 종자값(seed)를 설정 할 수있다.
	 *     (종자값은 난수를 만드는 알고리즘에 사용되는 값으로 종자값이 같으면 같은 난수를 얻는다.)
	 */

	public static void main(String[] args) {
		
		//boolean nextBoolean() : boolean 타입의 난수를 리턴
		Random random = new Random();
		
		for(int i=0 ; i<10 ; i++) {
			boolean temp = random.nextBoolean();
			System.out.println(i+" : "+temp);
		}
		
		//double nextDouble() : double 타입의 난수를 리턴(0.0 <= .. <1.0)
		for(int i=0 ; i<10 ; i++) {
			double temp = random.nextDouble();
			System.out.println(i+" : "+temp);
		}
		
		//int nextInt() : int 타입의 난수를 리턴(-2^31 <= .. <=2^31-1)
		for(int i=0 ; i<10 ; i++) {
			int temp = random.nextInt();
			System.out.println(i+" : "+temp);
		}
		
		//int nextInt(int n) : int 타입의 난수를 리턴(0<= .. <n)
		for(int i=0 ; i<10 ; i++) {
			int temp = random.nextInt(6)+1;
			System.out.println(i+" : "+temp);
		}
		
	} //end main

} //end class
