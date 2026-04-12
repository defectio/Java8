package chapter11_API.sec03_java_lang.part01_Object;

public class my05_ThinCloneExample {

	/**
	 * [객체 복제]
	 *   - 객체 복제란 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는 것이다.
	 *   - 객체를 복제하는 이유는 원본 객체를 안전하게 복제하기 위해서이다.
	 *     신뢰하지 않는 영역으로 원본 객체를 넘겨 작업할 경우 원본 객체의 데이터가 훼손될 수 있기 때문에 
	 *     복제된 객체를 만들어 신뢰하지 않는 영역으로 넘기는 것이 좋다.
	 *   - 객체 복제 방법
	 *   		(1) 얕은 복제(thin clone) : 단순히 필드값을 복사 해서 객체를 복제하는 것
	 *   		(2) 깊은 복제(deep clone) : 참조하고 있는 객체도 복제하는 것
	 */
	
	/**
	 * (1) 얕은 복제 : 단순히 필드값을 복사해서 객체를 복제하는 것.
	 *   - 필드가 기본 타입일 경우 값 복사
	 *   - 필드가 참조 타입일 경우 객체의 번지가 복사
	 */

	
	/**
	 * [Cloneable 인터페이스 구현]
	 *   - clone() 메소드로 객체를 복제하려면 원본 객체는 java.lang.Cloneable 인터페이스를 구현하고 있어야 한다.
	 *   - Cloneable 인터페이스에는 추상 메소드 선언이 없음에도 Cloneable 인터페이스를 명시하는 이유는
	 *     클래스 설계자가 복제를 허용한다는 의도적인 표시를 하기 위해서 이다.
	 *   - 클래스 설계자가 복제를 허용하지 않는다면 Cloneable 인터페이스를 구현하지 않으면 된다.
	 */
	public class Member implements Cloneable { //Cloneable -> 복제할 수 있다는 표시
		public String id;
		public String name;
		public String pw;
		public int age;
		public boolean adult;
		public int[] arr;
		
		public Member() {}
		public Member(String id, String name, String pw, int age, boolean adult, int[] arr) {
			this.id = id;
			this.name = name;
			this.pw = pw;
			this.age = age;
			this.adult = adult;
			this.arr = arr;
		}
		
		/**
		 * [Object clone() 메소드]
		 *   - clone() 메소드는 자신과 동일한 필드값을 가진 얕은 복제된 객체를 리턴한다.
		 *   - clone() 메소드를 사용하려면 원본 객체는 반드시 java.lang.Cloneable 인터페이스를 구현해야 한다.
		 *   - Cloneable 인터페이스 구현하지 않으면 clone() 메소드를 구현할 때 CloneNotSupportedException 예외가 발생하여 복제가 실패된다.
		 *   - clone() 메소드는 CloneNotSupportedException 예외 처리가 필요한 메소드이기 때문에 try-catch 구문이 필요하다.
		 */
		
		/**
		 * Member 클래스가 Cloneable 인터페이스를 구현했기 때문에
		 * clone() 메소드로 자신을 복제한 후, 복제한 객체를 외부로 리턴할 수 있다.
		 * @return
		 */
		public Member getMember() {
			Member cloned = null;
			try {
				/**
				 * clone() 메소드는 리턴값이 Object 타입이므로 Member(리턴하려는 클래스) 타입으로 강제 타입 변환
				 * Object 클래스의 clone() 메소드는 thorws CloneNotSupportedException 선언 -> try-catch
				 */
				cloned = (Member) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}				
			return cloned;
		}
	}
	
	public static void main(String[] args) {
		// 외부 클래스 생성
		my05_ThinCloneExample out = new my05_ThinCloneExample();
		
		//Member 원본 객체 생성
		Member original = out.new Member("blue", "홍길동", "12345", 23, true, new int[] {1, 2, 3});
		System.out.println("원본 객체 : "+original);
		
		// 원본 객체에서 복제 객체 얻기
		Member cloned = original.getMember();
		System.out.println("복제 객체 : "+cloned);
		System.out.println();
		
		//복제 객체의 패스워드를 변경했다고 하더라도 원본 객체의 패스워드는 변경 없음.
		System.out.println("[원본 객체의 필드 값]");
		System.out.println("id : "+original.id);
		System.out.println("name : "+original.name);
		System.out.println("pw : "+original.pw);
		System.out.println("age : "+original.age);
		System.out.println("adult : "+original.adult);
		//필드가 참조 타입인 경우 객체의 주소를 복제하기 때문에 같은 참조값을 갖는다.
		System.out.println("arr : "+original.arr);
		System.out.println();
		
		//복제한 객체의 pw 변경 후 출력 -> 복제 객체의 필드값만 변경됨(원본객체의 필드값은 변경안됨)
		System.out.println("[복제 객체의 패스워드 변경]");
		System.out.println("12345 -> 67890");
		cloned.pw = "67890";
		System.out.println();
		
		System.out.println("[복제 객체의 필드 값]");
		System.out.println("id : "+cloned.id);
		System.out.println("name : "+cloned.name);
		System.out.println("pw : "+cloned.pw);
		System.out.println("age : "+cloned.age);
		System.out.println("adult : "+cloned.adult);
		//필드가 참조 타입인 경우 객체의 주소를 복제하기 때문에 같은 참조값을 갖는다.
		System.out.println("arr : "+cloned.arr);
		System.out.println();
		
		//복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지게 된다.
		System.out.println("[복제 객체의 배열 변경]");
		System.out.println("arr[0] : 1 -> 4 변경");
		cloned.arr[0] = 4;
		System.out.println();
		
		System.out.println("[복제 객체의 배열 변경 후 참조 주소값 비교]");
		System.out.println("원본객체의 arr : "+original.arr);
		for(int a : original.arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("복제객체의 arr : "+cloned.arr);
		for(int a : cloned.arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	} //end main

} //end class