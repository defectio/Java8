package chapter04_Statement.sec03_loop.part01_for;

public class my03_ForSumExample {

	public static void main(String[] args) {
		
		//[1] 1~100까지의 합 구하기
		int sum1 = 0;
		for(int i=1 ; i<=100 ; i++)	{
			sum1 += i;
		}
		System.out.println("sum : "+sum1);
		
		//[2] 1~100까지의 합 구하기
		int sum2 = 0;
		
		int i = 0; //카운터 변수
		for(i=1 ; i<=100 ; i++) {
			sum2 += i;
		}
		//for문을 빠져 나온 i에는 101이 저장되어 있다.
		System.out.println("i : "+i);
		System.out.println("1 부터 "+(i-1)+"까지의 합 : "+sum2);
	}

}
