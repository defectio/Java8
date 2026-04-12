package chapter06_Class.sec10_StaticMember.part03_Precautions;

public class my01_precautions {

	//인스턴스 필드
	public int field1 = 10;
	//인스턴스 메소드
	public void method1() {
		System.out.println("field1 : "+field1);
	}
	
	//정적 필드
	public static int field2 = 20;
	//정적 메소드
	public static void method2()	 {
		System.out.println("field2 : "+field2);
	}
	
	/*
	 * [정적 메소드와 정적 블록 선언 시 주의할 점]
	 *  - 정적 메소드와 정적 블록은 객체 생성 없이도 실행된다는 특징 때문에, 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
	 *  - 또한, 객체 자신의 참조인 this 키워드도 사용불가능.
	 *  - 정적 메소드와 정적 블록 안에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성하고 참조 변수로 접근해야 한다.
	 */
	
	//정적 블록
	static {
		/* 정적블록 내부에서는 인스턴스 필드, 인스턴스 메소드 사용 불가 -> 사용하면 컴파일 에러 */
		//field1 = 100;	//인스턴스 멤버 사용불가
		//method1();		//인스턴스 멤버 사용불가
		field2 = 200;
		method2();
	}
	
	//정적 블록
	static {
		/* 정적블록 내부에서는 this 키워드 사용 불가 -> 사용하면 컴파일 에러 */
		//this.field1 = 100;	//this 사용불가
		//this.method1();		//this 사용불가
		//this.field2 = 200;	//this 사용불가	
		field2 = 200;
		method2();
	}
	
	/* 객체 생성 후 접근 */
	//[1] 블록 외부에서 객체를 인스턴스로 생성 -> 정적블록 내부에서 참조 불가능, 사용불가능
	my01_precautions ref_i = new my01_precautions();  
	//[2] 블록 외부에서 객체를 static으로 생성 -> 정적 블록 내부에서 참조 가능
	static my01_precautions ref_s = new my01_precautions(); 
	
	//정적 블록
	static {
		//[1] 블록 외부에서 객체를 인스턴스로 생성한 ref_i를 static 블록 내부에서 참조하면 하면 컴파일 오류 발생. 
		//ref_i.field1 = 1000;
		
		//[2] 블록 외부에서 객체를 static으로 생성한 ref_s를 static 블록 내부에서 참조 가능
		ref_s.field1 = -1000;
		ref_s.method1();
		
		/* 정적 블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 블록 내부에서 생성하고 사용하면 된다. */
		my01_precautions ref = new my01_precautions();
		
		ref.field1 = 1000;
		ref.method1();
		field2 = 2000;
		method2();
	}
	
	//정적 메소드
	public static void method3() {
		/* 정적 메소드에서 인스턴스 메소드를 사용하고 싶다면 객체를 먼저 생성하고 사용하면 된다. */
		
		//int field3 = field1 + field2;  //field1(인스턴스 필드) 사용 불가
		my01_precautions ref = new my01_precautions();
		int field3 = ref.field1 + field2;
		System.out.println("field3 : "+field3);
	}
	
} //end class
