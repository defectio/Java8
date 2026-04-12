package chapter06_Class.sec08_Method.part02_Return;

public class Car {
	// 필드
	int gas;

	// 생성자
	public Car() {}

	public void setGas(int gas) {
		this.gas = gas;
	}

	/* 리턴값이 있는 메소드 */
	//리턴 타입이 있는 메소드는 반드시 리턴문을 사용해서 리턴값을 지정해야 한다.
	//return문이 실행되면 메소드는 즉시 종료 된다.
	public boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
			// System.out.println("return문 이후에 실행문이 오면 Unreachable code라는 컴파일 오류 발생");
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	/* 리턴값이 없는 메소드 */
	//void로 선언된 메소드에서도 return문을 사용할 수 있다. -> return문 사용시 메소드 실행을 강제 종료 시킨다
	public void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 메소드 강제 종료
			}
		} // end while
	} // end run()
		
} //end class