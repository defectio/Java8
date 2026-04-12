package chapter06_Class.sec13_Modifier.part01_Class_Access.pack01;

import chapter06_Class.sec13_Modifier.part01_Class_Access.pack02.Cherry;

//클래스 선언시 public을 생략하면 default 접근 제한을 갖는다.
//default 접근 제한을 가지게 되면 같은 패키지에서는 아무런 제한 없이 사용할 수 있지만, 다른 패키지에서는 사용할 수 없도록 제한된다.
class Apple {

	/* Apple 클래스와 같은 패키지에 속하는 public 클래스인 Banana 클래스에 접근 가능 */
	Banana banana;
	
	/* Apple과 다른 클래스이지만 public 클래스인 Cherry 클래스 접근 가능 */
	//단, Cherry가 속한 패키지를 import 해야만 접근 가능
	Cherry cherry;
	
} //end class
