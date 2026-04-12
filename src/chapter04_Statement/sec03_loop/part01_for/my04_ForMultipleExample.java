package chapter04_Statement.sec03_loop.part01_for;

public class my04_ForMultipleExample {

	//구구단 출력하기 
	public static void main(String[] args) {
		int dan = 0;  //단수 2~9
		int num = 0; //곱하는수 1~9
		
		for(dan=2 ; dan<=9 ; dan++) {
			System.out.println("["+dan+"단 출력]");
			for(num=1 ; num<=9 ; num++) {
				System.out.println(dan+" * "+num+" = "+(dan*num));
			}
			System.out.println("************");
		}

	}

}
