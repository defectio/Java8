package chapter06_Class.sec13_Modifier.part02_Constructor.pack02;

import chapter06_Class.sec13_Modifier.part02_Constructor.pack01.* ;

public class Cherry {
	
	//다른 패키지 에서 호출 -> public 생성자만 호출 가능
	Apple a1 = new Apple(true);
	
	//Apple a2 = new Apple(1);		//default 생성자 : 다른 패키지의 클래스에서 호출 불가능
	//Apple a3 = new Apple("사과");	//private 생성자 : 모든 외부 클래스에서 호출 불가능
	
} //end class