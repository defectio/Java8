package chapter08_Interface.sec04_Use_Interface.part02_Default_Method;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	private boolean mute;
	
	//RemoteControl의 추상메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
	}
	
	/**
	 * [인터페이스의 디폴트 메소드 재정의]
	 *   - 재정의한 디폴트 메소드에는 default 키워드를 붙이지 않는다. 
	 */
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Audio를 무음 처리합니다.");
		} else {
			System.out.println("Audio를 무음 해제합니다.");
		}
	}

} //end class