package chapter14_Lambda.sec03_FunctionalInterface.part02;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(3);
		
		fi = (x) -> { System.out.println(x * 5); };
		fi.method(3);
		
		// 실행문이 하나면 {} 생략 가능
		fi = (x) -> System.out.println(x * 5);
		fi.method(3);

	}

}
