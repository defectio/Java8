package chapter10_Exception.sec07_User_Define_Exception;

/**
 * [사용자 정의 예외 클래스]
 * 	  (1) 일반 예외로 선언 : Exception 상속(컴파일러가 체크 한다.)
 *   (2) 실행 예외로 선언 : RuntimeException 상속(컴파일러가 체크하지 않는다.)
 */
//Exception을 상속하기 때문에 컴파일러에 의해 체크되는 예외가 된다. -> try~catch 블록으로 예외처리가 필요하다.
public class BalanceInsufficientException extends Exception {
	/**
	 * [사용자 정의 예외 클래스의 생성자]
	 *   - 사용자 정의 예외 클래스의 이름은 Exception으로 끝나는 것이 좋다.
	 * 	  - 사용자 정의 클래스도 필드, 생성자, 메소드 선언들을 포함할 수 있지만 대부분 생성자 선언만을 포함한다.
	 *   - 생성자는 2개를 선언하는 것이 일반적이다.
	 *      (1) 매개변수가 없는 기본 생성자
	 *  	 (2) 예외 발생 원인(예외 메시지)를 전달하기 위해 String 타입의 매개 변수를 갖는 생성자
	 *  		-> String 타입의 매개변수를 갖는 생성자는 상위 클래스의 생성자를 호출하여 예외 메시지를 넘겨준다.
	 *  		-> 예외 메시지의 용도는 catch 블록의 예외 처리 코드에서 이용하기 위해서 이다.
	 */
	public BalanceInsufficientException() { }
	
	// message는 상위 클래스로 전달된다( -> Exception의 생성자 -> Throwable의 생성자로 전달)
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
} //end class