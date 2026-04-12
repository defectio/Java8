package chapter13_Generic.sec07_Extends_Implements;

public class StorageImp<T> implements Storage<T> {

	/*
	 * [제네릭 타입의 상속과 구현]
	 * 	 - 제네릭 인터페이스를 구현한 클래스도 제네릭 타입이 된다.
	 * 	 - Storage<T> 인터페이스를 구현한 StorageImp 클래스는 인터페이스의 제네릭타입을 반드시 포함해야 하며, 추가적인 타입 파라미터를 가질 수 있다.
	 */
	private int capacity;
	private T[] array;

	public StorageImp() {}
	public StorageImp(int capacity) {
		this.capacity = capacity;
		this.array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public int getCapacity() {
		return capacity;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
} //end class
