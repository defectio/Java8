package chapter15_CollectionFramework.sec02_List.part03_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class my01_LinkecList {

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
		 * [LinkedList]
		 *  - ArrayList와 사용 방법은 똑같지만 내부 구조는 완전히 다르다.
		 *  - ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만, LinkedList는 인접 참조를 링크해서 체인 처럼 관리한다.
		 *    즉, ArrayList는 중간 인덱스에 객체를 제거하면 뒤의 객체는 인덱스가 1씩 앞으로 당겨진다.
		 *    	   LinkedList는 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 특정 인덱스를 삽입할 때도 마찬가지이다.
		 *    결론 : 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList 보다는 LinkedList가 좋은 성능을 발휘한다.
		 */
		
		//List<T> list = new LinkedList<T>();
		List<String> list = new LinkedList<>();
		
		list.add("호랑이");
		list.add("사자");
		list.add("코끼리");
		list.add("라이언");
		list.add("기린");
		
		//LinkedList는 내부에 저장된 객체를 인덱스로 관리하지 않는다고 했는데, 인덱스로 접근 가능하다??
		//맨 처음 저장된 "호랑이"를 root로 하여 0번 인덱스 처럼 여겨진다.
		
		//인덱스를 이용해서 데이터를 조회할 때 LinkedList는 head가 가리키는 노드부터 시작해서 순차적으로 노드를 찾아가는 과정을 거쳐야 한다. 
		//만약 찾고자 하는 엘리먼트가 가장 끝에 있다면 모든 노드를 탐색해야 하기 때문에 객체 조회할 때 LinkedList의 성능은 ArrayList 보다 좋지 않다.
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println("list["+i+"] = "+list.get(i));
		}

	} //end main

} //end class
