package chapter07_Inheritance.sec02_Inheritance;

//자바는 다중 상속을 허용하지 않는다. 즉, extends 뒤에는 단 하나의 부모 클래스만 와야 한다.
public class DmbCellPhone extends CellPhone {
	/**
	 * [상속 대상의 제한]
	 *   (1) 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외된다.
	 *   (2) 부모 클래스와 자식 클래스가 다른 패키지에 존재한다면 default 접근 제한을 갖는 필드와 메소드도 상속 대상에서 제외 된다.
	 *
	 * [상속의 효과]
	 * 	 (1) 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 코드의 중복울 줄여 준다.
	 *   (2) 부모 클래스의 수정으로 모든 자식 클래스들의 수정 효과를 가져오기 때문에 유지 보수 시간을 최소화시켜준다.
	 */ 

	int channel;

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		// CellPhone 클래스(부모 클래스)의 필드 -> 부모의 필드를 사용하려면 초기화 하고 사용해야한다.
		this.model = model;
		this.color = color;
		
		//DmbCellPhone 클래스(자식 클래스)의 필드
		this.channel = channel;
	}

	// 메소드
	void turnOnDmb() {
		//channel은 DmbCellPhone 생성시 초기화됨
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
