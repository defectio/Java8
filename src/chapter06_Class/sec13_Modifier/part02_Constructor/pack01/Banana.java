package chapter06_Class.sec13_Modifier.part02_Constructor.pack01;

public class Banana {
	
	Apple a1 = new Apple(true);	//public 생성자 : 모든 패키지의 클래스에서 호출 가능
	Apple a2 = new Apple(1);		//default 생성자 : 같은 패키지의 모든 클래스에서 호출 가능
	
	//private 생성자는 외부 클래스에서 호출 불가능
	//Apple a3 = new Apple("사과");		//private 생성자 : 모든 외부 클래스에서 호출 불가능
	
} //end class
