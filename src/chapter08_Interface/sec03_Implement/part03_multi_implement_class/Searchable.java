package chapter08_Interface.sec03_Implement.part03_multi_implement_class;

public interface Searchable {

	/**
	 * [추상메소드] public abstract 생략해도 컴파일 시에 자동으로 붙는다.
	 * 
	 * @param url
	 */
	void search(String url);

} // end interface