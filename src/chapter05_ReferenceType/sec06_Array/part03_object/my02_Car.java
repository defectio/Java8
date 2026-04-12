package chapter05_ReferenceType.sec06_Array.part03_object;

public class my02_Car {

	public static void main(String[] args) {
		my02_Tires[] tires = { new my02_Tires("왼쪽앞바퀴"),
										  new my02_Tires("오른쪽앞바퀴"),
										  new my02_Tires("왼쪽뒷바퀴"),
										  new my02_Tires("오른쪽뒷바퀴")};
		
		for(int i=0 ; i<tires.length ; i++) {
			System.out.println(tires[i].location);
		}
		
	}
}
