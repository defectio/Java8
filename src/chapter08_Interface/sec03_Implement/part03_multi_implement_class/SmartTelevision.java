package chapter08_Interface.sec03_Implement.part03_multi_implement_class;

/**
 * [다중 인터페이스 구현]
 *   - 객체는 다수의 인터페이스 타입으로 사용할 수 있다.
 *   - 구현 클래스는 모든 인터페이스의 추상 메소드에 대해 실체 메소드를 작성해야 한다.
 * @author defec
 */
public class SmartTelevision implements RemoteControl, Searchable {
	//필드
	private int volume;
	
	/**
	 * RemoteControl의 실체메소드
	 */
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	/**
	 *  Searchable의 실체메소드 
	 */
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

} //end class