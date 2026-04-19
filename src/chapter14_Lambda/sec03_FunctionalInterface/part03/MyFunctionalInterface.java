package chapter14_Lambda.sec03_FunctionalInterface.part03;

/**
 * 모든 인터페이스를 람다식의 타켓으로 사용할 수 없다.
 * 람다식이 하나의 메소드를 정의하기 때문에 두 개 이상의 추상메소드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다.
 * 하나의 추상메소드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있는데, 이러한 인터페이스를 함수적 인터페이스(Functional Interface)라고 한다.
 * @FunctionalInterface : 함수적 인터페이스를 작성할 때 두 개 이상의 추상 메소드가 선언되지 않도록 컴퍼일러가 체킹해준다. 
 * 						  두 개 이상의 추상메소드가 선언되면 컴파일 오류를 발생시킨다.
 * 					      Invalid '@FunctionalInterface' annotation; MyFunctionalInterface is not a functional interface
 */
@FunctionalInterface
public interface MyFunctionalInterface {

	public int method(int x, int y);
	//public void method2();

}
