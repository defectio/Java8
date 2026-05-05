package chapter16_Stream.sec04_filtering.part02;

import java.util.Objects;

public class Member {

	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int gender;
	private int age;
	
	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGender() {
		return gender;
	}
	
	public String getGenderStr() {
		if (getGender() == MALE) {
			return "male";
		} else {
			return "female";
		}
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "[name] : " + getName() + ", [gender] : " + getGenderStr() + ", [age] : " +getAge();
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
        return age == m.age && gender == m.gender && name.equals(m.name);
    }
	
    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }
}
