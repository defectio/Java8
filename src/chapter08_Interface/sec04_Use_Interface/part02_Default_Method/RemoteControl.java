package chapter08_Interface.sec04_Use_Interface.part02_Default_Method;

public interface RemoteControl {
	
	/**
	 *  상수필드(static final) -> 변경 불가
	 */
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/**
	 * 추상메소드 -> 선언부만 있음.(구현객체에서 재정의, overriding) 
	 */
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);
	
	/** 
	 * 디폴트 메소드
	 */
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	/**
	 *  정적 메소드
	 */
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
} //end interface