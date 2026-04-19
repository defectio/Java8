package chapter16_Stream.sec08_matching.part02;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

	/**
	 * 모든 item의 상태가 완료상태일때 alert
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Item> list = Arrays.asList(
			new Item(1, "phone", Item.DRAFT),
			new Item(2, "phone", Item.COMPLETE),
			new Item(3, "phone", Item.REJECT),
			new Item(4, "phone", Item.DRAFT),
			new Item(5, "phone", Item.WORKING),
			new Item(6, "phone", Item.COMPLETE)
		);
		
//		List<Item> list2 = Arrays.asList(
//			new Item(2, "phone", Item.COMPLETE),
//			new Item(6, "phone", Item.COMPLETE)
//		);
		
		if (check(list)) {
			System.out.println("모두 complete");
		} else {
			System.out.println("아직 complete 아님");
		}
	}

	public static boolean check(List<Item> list) {
		return list.stream().allMatch(a -> a.getStatus() == 3000);
	}
	
}
