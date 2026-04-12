package chapter06_Class.sec09_InstanceMember;

public class Car {
	/*
	 * [인스턴스 멤버] - 인스턴스 필드, 인스턴스 메소드
	 * 	 - 인스턴스 : 클래스로부터 new 연산자를 통해 생성된 객체를 인스턴스라고 한다.
	 *  - 인스턴스 멤버란 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드를 말한다. 
	 *  - 인스턴스 필드와 메소드는 객체에 소속된 멤버이기 때문에 객체 없이는 사용할 수 없다.
	 *  - 객체 내부에서도 인스턴스 멤버에 접근 하기 위해서 this 키워드를 사용할 수 있다.
	 */
	
	//필드
	public String model;
	public int speed;
	
	//생성자
	public Car() {}
	public Car(String model) {
		this.model = model;
	}
	
	//메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		for(int i=10; i<=50; i+=10) {
			//인스턴스 멤버임을 명시하기 위해 this 키워드를 사용
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}	
	
} //end class