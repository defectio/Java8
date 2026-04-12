package chapter11_API.sec03_java_lang.part01_Object;

public class my03_HashCodeExample2 {

	// 중첩 클래스
	public class Member {
		public String id;

		public Member(String id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Member) {
				Member member = (Member) obj;
				if (this.id.equals(member.id)) {
					return true;
				}
			}
			return false;
		}

		/**
		 *  객체의 String 값을 hashCode로 리턴하도록 재정의
		 */
		@Override
		public int hashCode() {
			return id.hashCode();
		}

	}

	public static void main(String[] args) {
		// 외부 클래스 생성
		my03_HashCodeExample2 hc = new my03_HashCodeExample2();

		Member mem1 = hc.new Member("손흥민");
		Member mem2 = hc.new Member("손흥민");
		Member mem3 = hc.new Member("이강인");
		
		// id가 동일한 문자열인 경우 같은 해시코드를 리턴함
		System.out.println("mem1's hashCode : " +mem1.hashCode());
		System.out.println("mem2's hashCode : " +mem2.hashCode());
		System.out.println("mem3's hashCode : " +mem3.hashCode());
		System.out.println();

		System.out.println(mem1.equals(mem2));
		System.out.println(mem2.equals(mem3));
		System.out.println(mem1.equals(mem3));
	} // end main

} // end class