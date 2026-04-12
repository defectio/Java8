package chapter10_Exception.sec06_Throws;

public class ThrowsExample {

	/**
	 * [예외 떠넘기기, throws]
	 *   - 메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 try~catch 블록으로 예외를 처리하는 것이 기본이다.
	 *   - 하지만, 경우에 따라서는 메소드를 호출한 곳으로 예외를 떠넘길 수 있다.(throws)
	 *   - throws 키워드는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.
	 */
	public static void main(String[] args) {
		/**
		 * findClass()에서 예외 처리를 떠넘기기 때문에 findClass()를 호출한 곳에서 예외 처리를 해야 한다.
		 */
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	} //end main
	
	//public static void findClass() throws ClassNotFoundException, NullPointerException {	//예외를 떠넘길 예외 클래스를 쉼표로 구분해서 나열
	//public static void findClass() throws Exception {		//throws Exception 만으로 모든 예외를 간단히 떠넘길 수 있다.
	public static void findClass() throws ClassNotFoundException {
		/** forName() 메소드 선언부에서 ClassNotFoundException을 떠넘기기 때문에
		 * 		(1) forName 호출 시 try-catch 블록으로 예외 처리 하거나
		 * 		(2) findClass() 메소드에 throws ClassNotFoundException을 선언하고 findClass()를 호출한 곳으로 예외처리를 떠넘겨야 한다.
		 */
		Class clazz = Class.forName("java.lang.String2");
	}

} //end class