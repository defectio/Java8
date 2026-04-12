package chapter15_CollectionFramework.sec03_Set.part01_HashSet;

public class my02_Member {

	public String name;
	public int age;
	
	public my02_Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof my02_Member) {
			my02_Member member = (my02_Member) obj;
			return this.name.equals(member.name) && this.age == member.age;
		}
		return false;
	}
}
