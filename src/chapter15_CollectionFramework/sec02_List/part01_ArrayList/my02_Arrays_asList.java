package chapter15_CollectionFramework.sec02_List.part01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class my02_Arrays_asList {

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
		
		//일반 배열을 ArrayList로 반환한다.
		//List<T> list = Arrays.asList(T ... a);
		//T 타입 파라미터에 맞게 asList()의 매개값을 순차적으로 입력하거나, T[] 배열을 매개값으로 주면 된다.
		//[1] 타입 파라미터에 맞게 매개값을 순차적으로 입력
		List<String> list1 = Arrays.asList("호랑이", "사자", "얼룩말");
		
		//※ Arrays.asList() 로 List를 생성하면 요소를 새롭게 추가할 수 없다.
		//list1.add("코끼리");	

		for(String animal : list1) {
			System.out.println(animal);
		}
		//get(), contains() 메소드는 사용 가능하다.
		System.out.println("get(0) : "+list1.get(0));
		if(list1.contains("호랑이")) {
			System.out.println("호랑이가 있습니다.");
		}
		System.out.println();
		
		//매개값을 배열로 입력
		//Integer[] intArr = {1, 2, 3};	//int가 객체타입이 아니여서 오류
		Integer[] intArr = {1, 2, 3};
		List<Integer> list2 = Arrays.asList(intArr);
		for(int value : list2) {
			System.out.println(value);
		}
	
	} //end main

} //end class