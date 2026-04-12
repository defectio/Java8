package chapter11_API.sec04_java_util.part04_Random;

import java.util.Arrays;
import java.util.Random;

public class my02_RottoExample {

	/*
	 * [Random 클래스]
	 *   - Math.random() 메소드는 0.0에서 1사이의 double 난수를 얻는데만 사용된다.
	 *   - Random 클래스는 boolean, int, long, float, double 난수를 얻을 수 있다. & 종자값(seed)를 설정 할 수있다.
	 *     (종자값은 난수를 만드는 알고리즘에 사용되는 값으로 종자값이 같으면 같은 난수를 얻는다.)
	 */
	public static void main(String[] args) {
		Random ran = new Random(3);
		int[] selectNum = new int[6];
		
		System.out.print("선택 번호 : ");
		for(int i=0 ; i<6 ; i++) {
			selectNum[i] = ran.nextInt(45)+1;
			System.out.print(selectNum[i]+" ");
		}
		System.out.println();
		
		ran = new Random(5);
		int[] winningNum = new int[6];
		System.out.print("당첨 번호 : ");
		for(int i=0 ; i<6 ; i++) {
			winningNum[i] = ran.nextInt(45)+1;
			System.out.print(winningNum[i]+" ");
		}
		System.out.println();

		//선택번호, 당첨번호 정렬
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.println("당첨 여부 : "+(result ? "1등 당첨 " : "꽝"));
		
	} //end main

} //end class