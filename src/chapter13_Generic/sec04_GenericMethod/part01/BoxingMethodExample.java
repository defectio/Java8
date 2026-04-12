package chapter13_Generic.sec04_GenericMethod.part01;

public class BoxingMethodExample {
	
	public static void main(String[] args) {
		/* 제네릭 메소드를 호출하는 방법 */
		
		//[1] 타입파라미터의 구체적인 타입을 명시적으로 지정(호출하는 메소드 앞에 타입 파라미터를 명시)
		//리턴타입 변수 = <구체적타입>메소드명(매개값);
		Box<Integer> box1 = Util.<Integer>boxing(100);	
		int intValue = box1.get();
		System.out.println("intValue : "+intValue);

		//[2] 컴파일러가 매개값을 보고 구체적인 타입을 추정
		//리턴타입 변수 = 메소드명(매개값);
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println("strValue : "+strValue);
		
	} //end main
	
} //end class
