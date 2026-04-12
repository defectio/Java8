package chapter06_Class.sec06_Field;

public class Car {

	/*
	 * [클래스의 구성 멤버 - 1.필드(field)]
	 *   - 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳
	 *   - 변수 vs 필드
	 *   		-> 변수 : 생성자와 메소드내에서만 사용되고, 생성자와 메소드가 실행종료 되면 자동 소멸된다.
	 *   		-> 필드 : 생성자와 메소드 전체에서 사용되며, 객체가 소멸되지 않는 한 객체와 함께 존재한다.
	 */
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;    //필드 초기화 하지 않았기 때문에 기본값이 저장됨.

} //end class