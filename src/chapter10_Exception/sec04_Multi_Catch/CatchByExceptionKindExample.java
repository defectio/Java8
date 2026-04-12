package chapter10_Exception.sec04_Multi_Catch;

/**
 * 다중 catch
 * @author defec
 *
 */
public class CatchByExceptionKindExample {
	
	public static void main(String[] args) {
		/**
		 * try 블록 내부에는 다양한 종류의 예외가 발생할 수 있다.
		 * 발생되는 예외별로 예외 처리 코드를 다르게 하려면 어떻게 하면 될까? -> 다중 catch 블록 작성 
		 */
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
			/**
			 * try 블록에서 예외발생시 즉시 실행을 멈추고 해당 catch 블록으로 이동하기 때문에,
			 * catch 블록이 여러 개라 할지라도 단 하나의 catch 블록만 실행된다. 
			 */
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample  num1  num2");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	
	} //end main

} //end class 
