package chapter13_Generic.sec07_Extends_Implements;

public class ChildProduct<T, M, C> extends Product<T, M> {
	/*
	 * [제네릭 타입의 상속과 구현]
	 * 	 - 제네릭 타입도 다른 타입과 마찬가지로 부모 클래스가 될 수 있다.
	 * 	 - Product<T, M> 클래스를 상속받은 ChildProduct는 부모의 제네릭타입을 반드시 포함해야 하며, 추가적인 타입 파라미터를 가질 수 있다.
	 */
	private C company;

	public C getCompany() {
		return this.company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

} //end class
