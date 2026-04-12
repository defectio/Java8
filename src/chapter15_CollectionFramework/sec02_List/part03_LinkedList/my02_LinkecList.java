package chapter15_CollectionFramework.sec02_List.part03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class my02_LinkecList {

	/*
	 * [List]
	 * 		- List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고 있다.
	 *       객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.
	 *     - List는 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조한다.
	 *		  동일한 객체를 중복 저장할 수 있는데, 이 경우 동일한 번지가 참조된다. 
	 *		  null도 저장 가능한데 이 경우에 해당 인덱스는 객체를 참조하지 않는다.
	 */
	
	//ArrayList vs LinkedList 성능 비교
	public static void main(String[] args) {
		/*
		 * [LinkedList]
		 *  - ArrayList와 사용 방법은 똑같지만 내부 구조는 완전히 다르다.
		 *  - ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만, LinkedList는 인접 참조를 링크해서 체인 처럼 관리한다.
		 *    즉, ArrayList는 중간 인덱스에 객체를 제거하면 뒤의 객체는 인덱스가 1씩 앞으로 당겨진다.
		 *    	   LinkedList는 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 특정 인덱스를 삽입할 때도 마찬가지이다.
		 *    결론 : 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList 보다는 LinkedList가 좋은 성능을 발휘한다.
		 */
		
		List<String> array = new ArrayList<String>();
		List<String> linked = new LinkedList<String>();
		
		long startTime;
		long endTime;
		long arrayTime;
		long linkedTime;
		
		/* ArrayList */
		//메소드 시작 시간
		startTime = System.nanoTime();
		//0~9999까지 array 맨 앞에 add하기(0번 인덱스)
		for(int i=0; i<10000; i++) {
			array.add(0, String.valueOf(i));
		}
		//메소드 종료 시간
		endTime = System.nanoTime();
		//메소드 실행시간 : 종료시간 - 시작시간
		arrayTime = endTime - startTime;
		System.out.println("ArrayList 걸린시간: "+arrayTime+" ns");
		
		/* LinkedList */
		//메소드 시작 시간
		startTime = System.nanoTime();
		//0~9999까지 linked 맨 앞에 add하기(0번 인덱스)
		for(int i=0; i<10000; i++) {
			linked.add(0, String.valueOf(i));
		}
		//메소드 종료 시간
		endTime = System.nanoTime();
		//메소드 실행시간 : 종료시간 - 시작시간
		linkedTime = endTime - startTime;
		System.out.println("LinkedList 걸린시간: "+linkedTime+" ns");
		
		if(linkedTime < arrayTime) {
			System.out.println("LinkedList의 처리 속도가 "+(arrayTime-linkedTime)+" ns 만큼 빠릅니다.");
		}
		
		/*
		 * 끝에서 부터 순차적으로 추가/삭제하는 경우에는 ArrayList가 빠르지만, 중간에 추가/삭제 할 경우에는 LinkedList가 더 빠르다.
		 * 반면, 저장된 객체 검색 시에는 인덱스로 객체를 관리하는 ArrayList가 LinkedList 보다 빠른 성능을 가지고 있다. 
		 *       LinkedList는 인덱스가 없기 때문에 처음부터 순차 검색해야한다. 
		 */
	}

}
