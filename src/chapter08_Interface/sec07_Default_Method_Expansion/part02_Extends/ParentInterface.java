package chapter08_Interface.sec07_Default_Method_Expansion.part02_Extends;

public interface ParentInterface {
	
    public void method1();
    
    /**
     * [부모 인터페이스의 디폴트 메소드] -> 자식 인터페이스에서 디폴트 메소드를 활용하는 방법
     * 		(1) 디폴트 메소드를 단순히 상속 받는다.
     * 		(2) 디폴트 메소드를 재정의해서 실행내용을 변경한다.
     * 		(3) 디폴트 메소드를 추상메소드로 재선언한다.
     */
    public default void method2() { 
    	System.out.println("ParentInterface's default method2");
    }
    
} //end interface
