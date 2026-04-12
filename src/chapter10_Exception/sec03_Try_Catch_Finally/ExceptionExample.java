package chapter10_Exception.sec03_Try_Catch_Finally;

/**
 * [예외 처리 코드]
 * 	 - 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도록 처리하는 코드를 예외 처리 코드라고 한다.
 *  - 자바 컴파일러는 일반 예외가 발생할 가능성이 있는 코드를 발견하면 컴파일 오류를 발생시켜 강제적으로 예외 처리 코드를 작성하도록 요구한다
 *  - 하지만, 실행예외는 컴파일러가 체크해주지 않기 때문에 예외처리코드를 개발자의 경험을 바탕으로 작성해야한다
 */
public class ExceptionExample {
	
	/**
	 * ClassNotFoundException는 일반 예외이므로 컴파일러가 체크하여 강제로 예외 처리 코드를 작성하도록 한다.
	 */
	public static void main(String[] args) {
		/**
		 * (일반 예외)ClassNotFoundException  발생(컴파일러 체크) -> try~catch문으로 작성해야함 
		 */
//		Class clazz = Class.forName("java.lang.String2");
		
		try {  
			/**
			 * [try 블록]
			 *   - 예외 발생 가능 코드가 위치
			 *   - try 블록의 코드가 예외 발생 없이 정상 실행되면 catch 블록의 코드는 실행되지 않는다.
			 *     (finally 블록이 있다면 finally 블록 실행)
			 *   - try 블록 코드 실행 시 예외가 발생하면 즉시 실행을 멈추고 catch 블록으로 이동하여 예외 처리 코드를 실행한다.
			 */
			
			/**
			 * Class.forName() 메소드는 매개값으로 주어진 클래스가 존재하면 Class 객체를 리턴하지만,
			 * 존재하지 않으면 ClassNotFoundException(일반예외) 예외를 발생시킨다.
			 * 
			 * 일반 예외 -> 컴파일러가 체크해서 강제로 예외처리코드를 작성하도록 한다.
			 */
			Class clazz3 = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			/**
			 * [catch 블록]
			 *   - try 블록 실행 중 예외 발생하면 catch 블록이 실행된다.
			 */
			System.out.println("클래스가 존재 하지 않습니다.");
		} finally {
			/**
			 * [finally 블록]
			 *   - 예외 발생 여부와 상관없이 항상 실행할 내용이 있을 경우에만 finally 블록을 작성해주면 된다.
			 *   - try~catch에서 return 문을 사용하더라도 finally 블록은 항상 실행된다.
			 *   - finally 블록은 옵션으로 생략 가능.
			 */
			System.out.println("finally 블록은 항상 실행됩니다.");
		}
		
	} //end main
	
} //end class