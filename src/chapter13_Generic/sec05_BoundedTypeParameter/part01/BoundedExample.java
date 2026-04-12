package chapter13_Generic.sec05_BoundedTypeParameter.part01;

public class BoundedExample {
	
	public static void main(String[] args) {
		//Number 타입 또는 Number의 하위 타입 외에는 매개값으로 들어 올 수 없다.
		//String str = Util.compare("a", "b");     //String 타입은 매개값으로 사용 불가능
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	
	} //end main
	
} //end class