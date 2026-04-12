package chapter05_ReferenceType.sec06_Array.part01_basic;

public class my02_Declaration {

	/*
	 * 배열 : 같은 타입의 많은 양의 데이터를 다룰 수 있다.
	 * 	 - 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인ㄷ게스(index)를 부여해 놓은 자료구조이다.
	 */
	public static void main(String[] args) {
	
		/* 배열 선언 방법 [3] : 값 목록으로 배열 생성 */
		//타입[] 변수 = {값1, 값2, ... };
		String[] animals = {"호랑이", "사자", "독수리", "곰", "코끼리", "기린", "얼룩말"};
		
		//배열의 요소는 index로 접근가능하다.
		System.out.println("첫번째 동물 : "+animals[0]);
		
		/* 값 목록으로 배열 생성시 주의할 점 */
		//배열 변수를 이미 선언한 후에는 다른 실행문에서 중괄호를 사용한 배열 생성은 허용되지 않는다.
		String[] fruits;
		//fruits = {"사과", "포도", "딸기"};  //컴파일 에러
		
		//해결 방법 : new 연산자를 사용해서 값 목록을 지정한다.
		fruits = new String[] {"사과", "포도", "딸기"};
		
		/* 배열을 생성함과 동시에 메소드의 매개값으로 사용하고자 할 때는 반드시 new 연산자를 사용한다. */
		//int result = add({1, 2, 3});  //컴파일 에러
		int result = add(new int[] {1, 2, 3});
		System.out.println("result : "+result);
		
	} //end main
	
	public static int add(int[] intArr) {
		int sum = 0;
		for(int i=0 ; i<intArr.length ; i++) {
			sum += i;
		}
		return sum;
	}

} //end class
