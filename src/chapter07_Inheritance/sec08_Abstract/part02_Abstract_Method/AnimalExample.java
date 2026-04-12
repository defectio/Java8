package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog("포유류");
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//자동 타입 변환(부모타입 변수에 자식 타입이 대입됨) -> 오버라이딩된 자식메소드가 실행됨.
		Animal animal = null;
		animal = new Dog("포유류");
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new Dog("포유류"));
		System.out.println();
		animalSound(new Cat());
	} // end main
	
	/**
	 * Animal타입은 매개변수로 대입될 수 없음(Animal은 추상클래스이므로 객체를 생성할 수 없기 때문에 참조변수가 없다)
	 * Animal(추상클래스)의 자식타입만 대입될 수 있고 자동타입변환 발생 -> 오버라이딩 된 자식 메소드 사용가능
	 */
	public static void animalSound(Animal animal) {
		animal.breathe(); 		//부모메소드 당연히 사용 가능. 자식 클래스에서 overriding도 가능
		animal.sound();			//재정의된 자식메소드 사용 가능(부모클래스의 추상메소드를 재정의한 자식메소드)
	}
	
} //end class
