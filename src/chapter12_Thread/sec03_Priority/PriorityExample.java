package chapter12_Thread.sec03_Priority;

public class PriorityExample {

	public static void main(String[] args) {

			/**
			 * 스레드를 10개 생성하고, 20억번의 루핑을 누가 더 빨리 끝내는가를 테스트
			 * 
			 *   - 순위가 높은 스레드가 실행 기회를 더 많이 가지기 때문에 우선순위가 낮ㄷ은 스레드 보다 계산 작업ㅇ르 빨리 끝낸다. 
			 */
			for (int i = 1; i <= 10; i++) {
				Thread thread = new CalcThread("thread" + i);
				if (i != 10) {
					thread.setPriority(Thread.MIN_PRIORITY);
				} else {
					thread.setPriority(Thread.MAX_PRIORITY);
				}
				thread.start();
			}
	}

}
