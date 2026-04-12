package chapter05_ReferenceType.sec06_Array.part01_basic;

public class my03_Declaration {

	/*
	 * 배열 : 같은 타입의 많은 양의 데이터를 다룰 수 있다.
	 * 	 - 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인ㄷ게스(index)를 부여해 놓은 자료구조이다.
	 */
	public static void main(String[] args) {
	
		/* 배열 선언 방법 [4] : new 연산자로 배열 생성 */
		//타입[] 변수 = new 타입[길이];
		int[] scores = new int[10]; //길이가 10인 배열 생성
		System.out.println("scores의 크기 : "+scores.length);
		
		//null로 선언 후 나중에 new 연산자로 생성
		String[] names = null;
		names = new String[5];
		System.out.println("names의 크기 : "+names.length);
		
		//new 연산자로 배열을 처음 생성할 경우, 배열은 자동적으로 기본값으로 초기화 된다.
		for(int i=0 ; i<scores.length ; i++)	{
			System.out.println("scroes["+i+"] = "+scores[i]);
		}
		
		for(int i=0 ; i<names.length ; i++)	{
			System.out.println("names["+i+"] = "+names[i]);
		}
	
	} //end main
	
} //end class
