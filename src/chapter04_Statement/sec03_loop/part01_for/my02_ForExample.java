package chapter04_Statement.sec03_loop.part01_for;

public class my02_ForExample {

	/*
	 * 어떤 경우에는 초기화식이 둘 이상이 있을 수도 있고, 증감식이 둘 이상 있을 수도 있다. 쉼표로 구분한다
	 * 
	 * for(int i=0, j=100 ; i<=50 && j>=50 ; i++, j--) {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		 for(int i=0, j=5 ; i<=5 && j>=0 ; i++, j--) {
			 System.out.println("("+i+", "+j+")");
		 }

	} //end main

} //end class
