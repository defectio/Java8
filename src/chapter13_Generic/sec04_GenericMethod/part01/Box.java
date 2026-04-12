package chapter13_Generic.sec04_GenericMethod.part01;

public class Box<T> {

	private T t;

	//getter
	public T get() {
		return t;
	}

	//setter
	public void set(T t) {
		this.t = t;
	}

} //end class