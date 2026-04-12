package chapter15_CollectionFramework.sec02_List.part01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class my04_Arrays_asList {

	/*
	 * [List 인터페이스]
	 * 		- List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고 있다.
	 *       객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.
	 *     - List는 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조한다.
	 *		  동일한 객체를 중복 저장할 수 있는데, 이 경우 동일한 번지가 참조된다. 
	 *		  null도 저장 가능한데 이 경우에 해당 인덱스는 객체를 참조하지 않는다.
	 */
	public static void main(String[] args) {
		/*
		 * [asList() 메소드]
		 *   - ArrayList를 생성하고 런타임 시 필요에 의해 객체들을 추가하는 것이 일반적이지만,
		 *   - 고정된 객체들로 구성된 List를 생성할 때도 있다.  -> 이런 경우에는 Arrays.asList(T... a) 메소드를 사용하는 것이 간편하다.
		 */
		
		/*
		 * List는 내부 구조가 배열로 만들어져 있다. 따라서 asList()를 사용해서 반환되는 List도 배열을 갖게 된다.
		 * 이때, "asList()를 사용해서 List 객체를 만들 때 새로운 배열 객체를 만드는 것이 아니라, 원본 배열의 주소값을 가져오게 된다."
 		 * 따라서 asList()를 사용해서 내용을 수정하면 원본 배열도 함께 바뀌게 되고 원본 배열을 수정하면 그 배열로 만들어뒀던 asList()를 이용한 List 내용도 바뀌게 된다.  
		 * 이러한 이유 때문에 "Arrays.asList()로 만든 List에 새로운 원소를 추가하거나 삭제 할 수 없다."
		 */
		
		//배열로 부터 진짜 ArrayList를 얻기 위한 방법
		String[] company = {"alpha", "bravo", "charlie"};
		System.out.println(Arrays.toString(company));
		
		//배열로 ArrayList 생성
		List<String> list = new ArrayList<>(Arrays.asList(company));
		System.out.println(list.toString());
		System.out.println();
		
		//원본배열 변경 -> list 변경 안됨
		company[0] += "99";
		System.out.println("[company 변경]");
		System.out.println("company : "+Arrays.toString(company));
		System.out.println("list : "+list.toString());
		System.out.println();
		
		//list 변경 -> 원본배열 변경 안됨.
		list.set(2, list.get(2)+"33");
		System.out.println("[list 변경]");
		System.out.println("company : "+Arrays.toString(company));
		System.out.println("list : "+list.toString());
		System.out.println();
		
		//add() 사용 가능
		list.add("headquarter");
		System.out.println("company : "+Arrays.toString(company));
		System.out.println("list : "+list.toString());
		
	} //end main

} //end class