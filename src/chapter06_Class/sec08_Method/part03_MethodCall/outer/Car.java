package chapter06_Class.sec08_Method.part03_MethodCall.outer;

public class Car {
	
	//필드
	public int speed;

	//getter
	public int getSpeed() {
		return speed;
	}

	public void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	public void run() {
		for (int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}

} //end class
