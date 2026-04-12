package chapter13_Generic.sec02_GenericType.part02_Generic;

public class BoxExample {

	public static void main(String[] args) {
		//Box 객체를 생성할 때 구체적인 타입이 지정딤.
		Box<String> box1 = new Box<String>();
		box1.set("GLE");
		//box1.set(1);  	//box1은 제네릭타입이 String인 객체여서 String만 저장 가능
		
		//제네릭으로 선언되어 있으면 casting 필요 없음
		String car = box1.get();
		System.out.println("car name : "+car);

		/* 자바 7부터 제네릭 타입 파라미터의 중복 기술을 줄이기 위해 다이아몬드 연산자 <>를 제공한다. */
		Box<Apple> box2 = new Box<>();
		box2.set(new Apple());
		
		//제네릭으로 선언되어 있으면 casting 필요 없음
		Apple apple = box2.get();
		System.out.println("apple : "+apple.name);
		
	} //end main

} //end class