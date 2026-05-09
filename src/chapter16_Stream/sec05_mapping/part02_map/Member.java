package chapter16_Stream.sec05_mapping.part02_map;

import java.util.Objects;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "[name] : " + getName() + ", [age] : " +getAge();
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
        	return true;
        }
        if (!(o instanceof Member)) {
        	return false;
        }
        
        Member m = (Member) o;
        return age == m.age && name.equals(m.name);
    }
	
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
