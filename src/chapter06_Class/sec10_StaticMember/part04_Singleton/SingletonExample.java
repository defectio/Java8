package chapter06_Class.sec10_StaticMember.part04_Singleton;

public class SingletonExample {

	public static void main(String[] args) {
		/* Normal 객체 생성 */
		Normal normal1 = new Normal();
		Normal normal2 = new Normal();
		if(normal1 == normal2) {
			System.out.println("normal1과 normal2는 같은 객체 입니다.");
		} else {
			System.out.println("normal1과 normal2는 다른 객체 입니다.");
		}
		System.out.println();
		
		/* Singleton 클래스의 생성자가 private으로 선언되어 있기 때문에 객체 생성 불가 */
		//Singleton obj1 = new Singleton();	//컴파일 에러
		//Singleton obj2 = new Singleton();	//컴파일 에러
		
		//클래스가 로딩이 되면 Singleton 클래스를 인스턴스화해서 객체로 생성하고, 정적 필드에 담는다.(클래스가 로딩되면 자동으로 생성됨)
		/* getInstance() 정적 메소드를 통해서 리턴된 싱글톤 객체를 참조변수에 담는다. */
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		/* 단 하나만의 객체를 생성하기 때문에 obj1과 obj2는 같은 객체를 참조한다. */
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	} //end main

} //end class