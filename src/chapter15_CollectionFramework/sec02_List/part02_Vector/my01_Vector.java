package chapter15_CollectionFramework.sec02_List.part02_Vector;

import java.util.List;
import java.util.Vector;

public class my01_Vector {

	/*
	 * [List]
	 * 		- List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고 있다.
	 *       객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.
	 *     - List는 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조한다.
	 *		  동일한 객체를 중복 저장할 수 있는데, 이 경우 동일한 번지가 참조된다. 
	 *		  null도 저장 가능한데 이 경우에 해당 인덱스는 객체를 참조하지 않는다.
	 */
	public static void main(String[] args) {
		
		/*
		 * [Vector] : 멀티스레드 환경에서도 사용 가능
		 * 	 - Vector는 ArrayList와 동일한 내부 구조를 가지고 있고, 메소드 사용 방법도 동일하다.
		 *  - ArrayList와 다른점은 Vector는 동기화된 메소드로 구성되어 있기 때문에 
		 *    멀티스레드가 동시에 이 메소드를 실행할 수 없고, 하나의 스레드가 실행을 완료 해야만 다른 스레드를 실행할 수 있다. 
		 *    그래서 멀티스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. (Thread safe, 쓰레드가 안전하다)
		 */
		
		//List<T> list = new Vector<T>();
		List<my01_board> list = new Vector<my01_board>();
		
		list.add(new my01_board("제목1", "내용1", "글쓴이1"));
		list.add(new my01_board("제목2", "내용2", "글쓴이2"));
		list.add(new my01_board("제목3", "내용3", "글쓴이3"));
		list.add(new my01_board("제목4", "내용4", "글쓴이4"));
		list.add(new my01_board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			my01_board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	} //end main

} //end class
