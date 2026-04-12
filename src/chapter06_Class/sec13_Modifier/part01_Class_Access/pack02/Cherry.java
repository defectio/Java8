package chapter06_Class.sec13_Modifier.part01_Class_Access.pack02;

import chapter06_Class.sec13_Modifier.part01_Class_Access.pack01.*;

public class Cherry {
	/* Apple은 Cherry와 다른 패키지에 속하는 default 클래스 */
	//Apple apple = new Apple();		//접근 불가
	
	/* Banana는 Cherry와 다른 패키지에 속하는 public 클래스 */
	//단, Banana 클래스가 속한 패키지를 import 해야만 접근 가능
	Banana banana = new Banana();	
	
} //end class
