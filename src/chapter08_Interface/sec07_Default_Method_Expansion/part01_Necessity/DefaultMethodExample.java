package chapter08_Interface.sec07_Default_Method_Expansion.part01_Necessity;

public class DefaultMethodExample {
	
	public static void main(String[] args) {
		
		MyInterface mi1 = new MyClassA();
		
		mi1.method1();		//구현 객체의 재정의한 메소드 사용(추상 메소드)
		mi1.method2();		//구현 객체를 통해서 인터페이스의 디폴트 메소드 사용
		
		System.out.println();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();		//구현 객체의 재정의한 메소드 사용(추상 메소드)
		mi2.method2();		//구현 객체에서 재정의한 인터페이스의 디폴트 메소드 사용 
	
	} //end main
	 
} //end class