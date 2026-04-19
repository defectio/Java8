package chapter14_Lambda.sec03_FunctionalInterface.part01;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		// 실행문이 하나면 {} 생략 가능
		fi = () -> System.out.println("method call3");
		fi.method();

	}

}
