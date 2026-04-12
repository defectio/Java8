package chapter09_Nested.sec03_Class_Access.part03_Local_Class_Access;

public class OutterExample {

	public static void main(String[] args) {
		/**
		 * 로컬 클래스에서 사용하는 매개변수와 메소드 내부에 선언된 필드를 사용할 경우에만 문제가 됨.
		 */
		Outter out = new Outter();
		
		out.method2(10);

	}

}
