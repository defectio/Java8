package chapter04_Statement.sec04_practice;

public class ex03_Exercise {

	public static void main(String[] args) {
		
		//1~100까지의 정수 중 3의 배수의 총합을 구하라.
		int sum = 0;
		
		for(int i=1 ; i<=100 ; i++)	{
			if(i%3 == 0) {
				//System.out.println("i : "+i);
				sum += i;
			}
		}
		System.out.println("forSum : "+sum);
		
		int sum2 = 0;
		int index = 0;
		while(index <= 100) {
			index++;
			if(index%3 == 0) {
				//System.out.println("index : "+index);
				sum2 += index;
				continue;
			}
		}
		System.out.println("whileSum : "+sum2);
	}

}
