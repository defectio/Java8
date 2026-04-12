package chapter11_API.sec04_java_util.part03_Arrays;

public class my03_Member implements Comparable<my03_Member>{

	String name;
	
	public my03_Member() {}
	public my03_Member(String name) {
		this.name = name;
	}
	
	//Member객체의 이름 순 정렬
	@Override
	public int compareTo(my03_Member o) {
		return name.compareTo(o.name);
	}

} //end class