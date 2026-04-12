package chapter10_Exception.sec02_Runtime_Exception;

/**
 * 실행 예외(Runtime Exception)는 자바 컴파일러가 체크를 하지 않기 때문에 오로지 개발자의 경험에 의해서 예외 처리 코드를 삽입해야 한다.
 * @author defec
 */
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		/**
		 * [ArrayIndexOutOfBoundsException]
		 * 	 - 배열에서 인덱스 범위를 초과하여 사용할 경우 예외 발생
		 */
		int[] array = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < 6; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

	} //end main

} //end class