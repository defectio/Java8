package chapter10_Exception.sec04_Multi_Catch;

public class CatchOrderExample {
	public static void main(String[] args) {
		/**
		 * [다중 catch 블록 작성시 주의할 점]
		 *   - 다중 catch 블록을 작성할 때는 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다.
		 *      try 블록에서 예외 발생시 catch블록은 위에서 부터 차례대로 검색된다.
		 *     만약 상위 예외 클래스의 catch 블록이 위에 있다면, 하위 예외 클래스의 catch 블록은 실행되지 않는다.
		 *     왜냐하면 하위 예외는 상위 예외를 상속 했기 때문에 상외 예외 타입도 되기 때문이다. 
		 */
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(Exception e) {
			//Exception 클래스가 더 상위 클래스이므로 아래쪽에 위치 해야 한다.
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	
	} //end main
	
} //end class