package chapter08_Interface.sec04_Use_Interface.part03_Static_Method;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		/**
		 * [정적 메소드의 사용]
		 * 	 - 인터페이스의 정적 메소드는 구현 객체 없이 인터페이스로 바로 호출 가능하다.
		 */
		RemoteControl.changeBattery();
	
	} //end main

} //end class