package chapter08_Interface.sec06_Interface_Inheritance;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		/** 
		 * 상위 인터페이스로 자동타입변환 -> 상위 인터페이스에 선언된 메소드만 사용 가능 
		 */
		InterfaceA ia = impl;
		System.out.println("[ImplementationC -> InterfaceA 자동타입변환]");
		//InterfaceA 타입은 methodA()만 호출 가능
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		System.out.println();
		
		System.out.println("[InterfaceA -> ImplementationC 강제타입변환]");
		ImplementationC temp1 = (ImplementationC) ia;
		temp1.methodA();
		temp1.methodB();
		temp1.methodC();
		
		System.out.println();

		InterfaceB ib = impl;
		//InterfaceB 타입은 methodB()만 호출 가능
		ib.methodB();
		//ib.methodA();
		//ib.methodC();
		System.out.println();

		/**
		 *  하위 인터페이스로 자동타입변환되면 상/하위 인터페이스에 선언된 모든 메소드를 사용할 수 있다.
		 */
		InterfaceC ic = impl;
		//InterfaceC 타입은 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();

	} //end main

} //end class