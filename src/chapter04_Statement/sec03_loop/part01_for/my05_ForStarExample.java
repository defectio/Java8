package chapter04_Statement.sec03_loop.part01_for;

public class my05_ForStarExample {

	//별찍기
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		} //end for
		
	} //end main

} //end class
