package chapter13_Generic.sec03_MultiTypeParameter;

public class Product<T, M> {
	/*
	 * [멀티 타입 파라미터]
	 *   - 제네릭 타입은 두 개 이상의 멀티 타입 파라미터를 사용할 수 있다.
	 *   - 이 경우 각 타입 파라미터를 콤마로 구분한다. 
	 */
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

} //end class