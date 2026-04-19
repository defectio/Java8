package chapter14_Lambda.sec03_FunctionalInterface.part03;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(3, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(3, 5));
		
		// 리턴문만 하나면 return, {} 생략 가능
		fi = (x, y) -> x + y;
		System.out.println(fi.method(3, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(3, 5));
	}
	
	public static int sum (int x, int y) {
		return (x + y);
	}

}
