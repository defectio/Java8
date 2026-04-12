package chapter06_Class.sec14_Getter_Setter;

public class Car {
	/*
	 * [Getter, Setter]
	 *  - 일반적으로 객체지향프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는다.(캡슐화)
	 *     그 이유는 객체의 데이터를 외부에서 마음대로 읽고 변경할 객체의 무결성이 깨질 수 있기 때문이다.
	 *  - 예를 들어 자동차의 속도는 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
	 *     ex)  speed = -10;
	 *  - 이러한 문제점을 해결하기 위해 객체 지향 프로그래밍에서는 메소드(getter, setter)를 통해서 데이터를 변경하는 방법을 선호한다.  
	 *     데이터는 외부에서 접근할 수 없도록 막고, 메소드는 공개해서 외부에서 메소드를 통해 데이터에 접근하도록 유도한다.
	 */
	
	//필드 -> private로 선언하여 외부로 부터 보호한다.
	//필드에 대한 Setter와 Getter 메소드를 작성해서 필드값을 안전하게 변경/사용하는 것이 좋다.
	private int speed;
	private boolean stop;

	//생성자 -> 기본 생성자

	//Getter() 메소드 : 외부에서 객체의 데이터를 읽을 때 사용함. 
	//객체의 외부에서 객체의 필드값을 사용하기에 부적절한 경우에는 getter 메소드로 필드값을 가공한 후 외부로 전달한다.
	public int getSpeed() {
		return speed;
	}

	//Setter() 메소드 : 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있게 한다.
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;    //return문을 만나는 즉시 메소드 실행 종료
		} else {
			this.speed = speed;
			this.stop = false;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
		System.out.println("차량이 멈춥니다.");
	}
	
} //end class
