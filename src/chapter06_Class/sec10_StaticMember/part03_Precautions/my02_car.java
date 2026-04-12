package chapter06_Class.sec10_StaticMember.part03_Precautions;

public class my02_car {
	//인스턴스 필드
	public int speed;

	//인스턴스 메소드
	public void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
		/* main() 메소드 역시 정적메소드 이므로 인스턴스 멤버를 사용하려면 객체 생성 후 참조 변수로 접근하여 사용해야한다. */
		//정적 메소드 내부에서 객체 생성 없이 인스턴스 멤버 사용 불가능
		my02_car myCar = new my02_car();

		// 객체 생성 후, 참조 변수로 인스턴스 멤버에 접근
		myCar.speed = 60;
		myCar.run();
	
	} //end main
	
} //end class