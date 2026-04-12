package chapter13_Generic.sec02_GenericType.part01_NonGeneric;

public class Box {

	/*
	 * [Box의 필드를 Object로 선언할 경우]
	 *   - 필드를 Object 타입으로 선언하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만,
	 *     setter로 저장할 때 Object 타입으로 자동타입변환이 되어 저장된다. -> 타입변환발생
	 *   - getter로 값을 리턴할 때도, Object 타입으로 리턴하기 때문에
	 *     리턴받으려는 타입으로 강제타입변환(casting) 해야 한다. -> 타입변환발생
	 */
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}

} //end class