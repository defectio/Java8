package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Comparator;

public class my01_StudentComparotor implements Comparator<my01_Student>{

	@Override
	public int compare(my01_Student o1, my01_Student o2) {
		/**
		 * o1 < o2 : 음수
		 * o1 = o2 : 0
		 * o1 > o2 : 양수
		 * 
		 * o1 - o2로 부호 생각하면 된다.
		 *  
		 */
//		if (o1.getSno() < o2.getSno()) {
//			return -1;
//		} else if (o1.getSno() == o2.getSno()) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		/**
		 * Integer 클래스의 compare() 사용
		 */
		return Integer.compare(o1.getSno(), o2.getSno());
	}

} //end class
