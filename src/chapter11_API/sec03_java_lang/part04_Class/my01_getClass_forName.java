package chapter11_API.sec03_java_lang.part04_Class;

public class my01_getClass_forName {
	
	/*
	 * [Class 클래스]
	 *   - 자바는 클래스와 인터페이스의 메타데이터를 java.lang 패키지에 소속된 Class 클래스로 관리한다.
	 *   - 메타 데이터란 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보를 말한다.
	 */
	public static void main(String[] args) {
		
		/*
		 * [getClass()]
		 *  - 프로그램에서 Class 객체를 얻기 위해서는 Object 클래스가 가지고 있는 getClass() 메소드 이용
		 *  - Object는 모든 클래스의 최상위 클래스이므로 모든 클래스에서 getClass()를 호출할 수 있다. 
		 *  - getClass() 메소드는 해당 클래스로 객체를 생성했을 때만 사용할 수 있다.
		 */
		//Car 객체를 생성한 후에 getClass() 사용 가능
		my01_Car car = new my01_Car();
		Class class1 = car.getClass();
		System.out.println("class1 : "+class1);
		System.out.println("class1.getName() : "+class1.getName());
		System.out.println("class1.getSimpleName() : "+class1.getSimpleName());
		System.out.println("class1.getPackage().getName() : "+class1.getPackage().getName());
		System.out.println();
		/*
		 * [forName(String className)]
		 *   - 객체를 생성하지 않고 직접 Class 객체를 얻는 방법
		 *   - Class는 생성자를 감추고 있기 때문에 new 연산자로 객체를 만들 수 없고, 정적 메소드인 forName() 을 이용해야 한다.
		 *   - forName() 메소드는 클래스 전체 이름(패키지가 포함된 이름)을 매개값으로 받고 Class 객체를 리턴한다.
		 *   - Class.forName() 메소드는 매개값으로 주어진 클래스를 찾지 못하면 ClassNotFoundException 예외 발생(일반예외) -> 예외 처리 필요
		 */
		
		//ClassNotFoundException예외(일반예외) -> 컴파일러가 체크함.
		try {
			//매개값은 최상위 패키지명 부터 작성해야함.
			Class class2 = Class.forName("chapter11_API.sec03_java_lang.part04_Class.my01_Car");
			System.out.println("class2 : "+class2);
			System.out.println("class2.getName() : "+class2.getName());
			System.out.println("class2.getSimpleName() : "+class2.getSimpleName());
			System.out.println("class2.getPackage().getName() : "+class2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	} //end main

} //end class