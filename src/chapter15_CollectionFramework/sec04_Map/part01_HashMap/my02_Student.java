package chapter15_CollectionFramework.sec04_Map.part01_HashMap;

public class my02_Student {

	public int sno;
	public String name;
	
	public my02_Student() {}
	public my02_Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		//이 객체의 해시코드는 이름(String)의 해시코드에 학번(int)를 더한 값을 리턴한다.
		//즉, name(String) 값과 학번(int) 값이 동일하면 동일한 해시코드를 갖는다.
		return this.name.hashCode() + this.sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		//name값과 sno 값이 동일하면 true 리턴
		if(obj instanceof my02_Student) {
			my02_Student student = (my02_Student) obj;
			return (this.name.equals(student.name)) && (this.sno == student.sno);		
		}
		return false;
	}
}
