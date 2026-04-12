package chapter06_Class.sec13_Modifier.part03_Field_Method.pack01;

public class Apple {
	
	/*
	 * [필드와 메소드의 접근 제한]
	 *  - 필드와 메소드를 선언할 때 고려해야 할 사항은 
	 *    클래스 내부에서만 사용할 것인지, 패키지 내에서만 사용할 것인지, 다른 패키지에서도 사용할 수 있도록 할 것인지 결정해야 한다.
	 *  - public, protected, default, private
	 */

	public int field1;			//public	
	int field2;					//default
	private int field3;		//private
	
	//클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
	public Apple() {
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {	//public
		System.out.println("public method1");
	}		
	void method2() {	//default
		System.out.println("default method2");
	}					
	private void method3() {	//private
		System.out.println("private method3");
	}	
	
} //end class
