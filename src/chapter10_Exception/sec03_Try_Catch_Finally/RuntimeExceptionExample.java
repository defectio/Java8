package chapter10_Exception.sec03_Try_Catch_Finally;

/**
 * [실행 예외 처리 코드]
 *   - 실행 예외는 컴파일러가 체크하지 못하기 때문에, 개발자가 경험에 의해서 예외 처리 코드를 적절히 작성해야 한다.
 */
public class RuntimeExceptionExample {
	
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		/**
		 * 실행예외는 컴파일러가 체크하지 않기 때문에 개발자의 경험에 의해 예외 처리를 작성해주어야 한다.
		 */
		try { 
			int value1 = Integer.parseInt(data1);
			System.out.println("data1 변환 완료");
			
			/**
			 * data2(String)를 value(int)로 변환할 수 없음. -> NumberFormatException 발생(실행 예외)
			 * 
			 * 실행 예외 -> 개발자의 경험에 의해 예외 처리 코드를 작성해야 한다.
			 */
			// try 블록 실행을 즉시 중단하고 catch 블록을 실행함.
			int value2 = Integer.parseInt(data2);
			System.out.println("data2 변환 완료");
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	
	} //end main
	
} //end class