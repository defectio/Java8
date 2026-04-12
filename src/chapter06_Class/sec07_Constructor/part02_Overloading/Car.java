package chapter06_Class.sec07_Constructor.part02_Overloading;

public class Car {

	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
		
	/*
	 * [생성자 오버로딩]
	 *  - 외부에서 제공되는 다양한 데이터들을 이용해서 객체를 초기화하려면 생성자도 다양화될 필요가 있다. 
	 *  - 자바는 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공한다.(매개변수를 달리하는 생성자를 여러개 선언하는 것)
	 */
	public Car() { }
	
	/* this() 사용전
	public Car(String model) {
		this.model = model;
	}
	*/
	//this() -> 매개변수가 가장 많은 생성자를 호출한다
	public Car(String model) {
		//매개값 model은 초기화하고, this의 나머지 매개값들은 기본값으로 초기화한다.
		this(model, null, -1);
	}
		
	/* this() 사용전
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	*/
	public Car(String model, String color) {
		//매개값 model, color은 초기화하고, this의 나머지 매개값들은 기본값으로 초기화한다.
		this(model, color, -1);
	}
	/* 타입 순서가 같으면 오버로딩이 아니다.
	public Car(String color, String model) {
		this(model, color, 0);
	}
	*/
		
	//매개변수 개수가 가장 많은 생성자가 기준이 된다. -> this 키워드로 다른 생성자를 호출하면 중복코드가 줄어든다.
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
		
} //end class
