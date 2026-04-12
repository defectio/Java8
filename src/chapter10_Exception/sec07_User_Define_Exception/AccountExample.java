package chapter10_Exception.sec07_User_Define_Exception;

public class AccountExample {
	/**
	 * [사용자정의 예외]
	 *   - 프로그램을 개발하다보면 자바 표준 API에서 제공하는 예외 클래스만으로는 다양한 종류의 예외를 표현할 수 없다.
	 *   - 예를들어, 은행 업무를 처리하는 프로그램에서 잔고보다 더 많은 출금 요청이 들어왔을 경우 오류가되며,
	 *   				프로그램은 잔고 부족 예외를 발생 시킬 필요가 있다.
	 * @param args
	 */
	public static void main(String[] args) {
		//계좌 생성
		Account account = new Account();
		
		//10000원 예금하기
		account.deposit(10000);
		System.out.println("10000원 예금하기");
		System.out.println("예금액 : " + account.getBalance() + "원\n");

		/**
		 * withdraw 메소드는 Exception(컴파일러 체크)을 상속한 BalanceInsufficientException 예외를 throws 하기 때문에
		 * withdraw 메소드를 호출한 곳에서 예외 처리 코드를 작성해야 한다.(try-catch 블록)
		 * 		-> Surround with try/catch 클릭
		 */
//		account.withdraw(30000);
		
		//출금하기
		try {
			System.out.println("30000원 출금하기");
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			/**
			 * [예외 정보 얻기]
			 *  - try 블록에서 예외가 발생하면 예외 객체는 catch 블록의 매개변수에서 참조하게 되므로 매개변수를 이용하면 예외 객체의 정보를 알 수 있다.
			 *  - 모든 예외 객체는 Exception 클래스를 상속하기 때문에 Exception이 가지고 있는 메소드들을 모든 예외 객체에서 호출할 수 있다.
			 *  	(1) getMessage() : String 타입을 매개변수로 하는 예외 객체 생성 시 메시지가 자동으로 예외 객체 내부에 저장됨
			 *  	(2) printStackTrace() : 예외 발생 코드를 추적해서 모두 콘솔에 출력한다.(예외가 어디 발생했는지 상세하게 출력)
			 */
			//예외 객체가 가지고 있는 Message 얻기(예외 객체 생성 시 사용한 매개 변수 : ["잔고부족:"+(money-balance)+" 모자람"])
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//예외 발생 경로를 추적
			e.printStackTrace();
		}
		
	} //end main
	
} //end class