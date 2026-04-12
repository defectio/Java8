package chapter10_Exception.sec07_User_Define_Exception;

/**
 * 계좌 클래스
 * @author defec
 */
public class Account {
	private long balance;	//잔액

	public Account() {}	

	/**
	 * 잔액조회
	 * @return
	 */
	public long getBalance() {
		return balance;
	}	
	
	/**
	 * 예금하기
	 * @param money
	 */
	public void deposit(int money) {
		balance += money;
	}
	
	/**
	 * 출금하기
	 * @param money (출금하려는 금액)
	 * @throws BalanceInsufficientException
	 */
	public void withdraw(int money) throws BalanceInsufficientException {
		//잔액 보다 많은 금액을 출금하려 했을 때 BalanceInsufficientException 예외 발생시키기
		if(balance < money) {
			/**
			 * [예외 발생시키기]
			 *   - 예외 객체를 생성할 때는 기본 생성자 또는 예외 메시지를 갖는 생성자 중 어떤 것을 사용해도 된다.
			 *   - catch 블록에서 예외 메시지가 필요하다면 예외 메시지를 갖는 생성자를 이용해야한다. 
			 *   - 예외 발생 코드를 가지고 있는 메소드는 내부에서 try-catch 블록으로 예외를 처리할 수 있지만,
			 *     대부분은 자신을 호출한 곳에서 예외를 처리하도록 throws 키워드로 예외를 떠넘긴다.
			 */
			//throw new BalanceInsufficientException();
			
			//예외를 발생시킬 때 String 타입의 메시지를 갖는 생성자를 이용했다면, 메시지는 자동적으로 예외 객체 내부에 저장된다.
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
		}
		balance -= money;
	}
	
} //end class