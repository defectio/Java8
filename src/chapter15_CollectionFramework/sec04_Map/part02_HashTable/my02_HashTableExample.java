package chapter15_CollectionFramework.sec04_Map.part02_HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class my02_HashTableExample {

	/*
	 * [HashTable]
	 *  - HashTable(다중스레드)은 HashMap과 동일한 내부 구조를 가지고 있다. 
	 *  - HashTable도 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다.
	 * 
	 *  - HashMap과의 차이점은 HashTable은 동기화된(synchronized) 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드를 실행할 수는 없고, 
	 *    하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. 
	 *    그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. -> 스레드가 안전하다. thread safe 하다.
	 */
	
	public static void main(String[] args) {
		// HashTable 생성
		Map<String, String> table = new Hashtable<>();
		
		//HashTable에 아이디와 비밀번호를 미리 저장함.
		table.put("spring", "12");
		table.put("summer", "123");
		table.put("fall", "1234");
		table.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = scan.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scan.nextLine();
			System.out.println();
			
			if(table.containsKey(id)) { //입력한 아이디가 존재함
				if(table.get(id).equals(password)) {  //입력한 아이디의 비밀번호와 입력한 비밀번호가 동일함.
					System.out.println("로그인 되었습니다");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}				
			} else { //입력한 아이디가 존재하지 않음.
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
			
		} //end while

	} //end main
	
} //end class
