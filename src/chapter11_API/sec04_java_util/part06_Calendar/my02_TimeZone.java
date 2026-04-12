package chapter11_API.sec04_java_util.part06_Calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class my02_TimeZone {

	/*
	 * [Calendar 클래스]
	 *   - 달력을 표현한 클래스
	 *   - Calendar 클래스는 추상(abstract) 클래스 이므로 new 연산자를 사용해서 인스턴스를 생성할 수 없다.
	 *     그 이유는 날짜와 시간을 계산하는 방식이 지역과 문화와 나라에 따라 다르기 때문이다.(음력, 양력)
	 *   - 그래서 Calendar 클래스에는 날짜와 시간을 계산하는데 꼭 필요한 메소드들만 선언되어 있고, 
	 *      특정한 역법을 따르는 계산 로직은 하위 클래스에서 구현하도록 되어 있다.
	 *   - 특별한 역법을 사용하는 경우가 아니라면 직접 하위 클래스를 만들 필요는 없고
	 *     Calendar 클래스의 정ㅈ거 메소드인 getInstance() 메소드를 이용하면 
	 *     현재 운영체제에 설정되어 있는 시간대(timezone)를 기준으로 Calendar 하위 객체를 얻을 수 있다. 
	 */
	public static void main(String[] args) {
		
		//다른 시간대에 해당하는 날짜와 시간을 출력하기 위해서는 어떻게 해야 할까?
		//예를 들어, 미국/뉴욕의 현재 날짜와 시간을 출력하기 위해서는 어떻게 해야 할까?
		
		//Calendar 클래스의 오버로딩된 다른 getInstance() 메소드를 이용하면 다른 시간대의 Calendar 객체를 얻을 수 있다.
		
		//사용가능한 시간대 출력
		String[] availableIDs = TimeZone.getAvailableIDs();
		System.out.println("사용가능한 시간대 : "+availableIDs.length+"개");
		/*
		for(String id : availableIDs) {
			System.out.println(id);
		}
		 */
		System.out.println();
		//미국/뉴욕 시간대 가져오기
		TimeZone newyork = TimeZone.getTimeZone("America/New_York");
		Calendar now = Calendar.getInstance(newyork);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;		
		int day = now.get(Calendar.DAY_OF_MONTH);	
		
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일을 리턴(1:일요일, 2:월요일, ... 7:토요일)
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월요일";
				break;
			case Calendar.TUESDAY:
				strWeek = "화요일";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수요일";
				break;
			case Calendar.THURSDAY:
				strWeek = "목요일";
				break;
			case Calendar.FRIDAY:
				strWeek = "금요일";
				break;
			case Calendar.SATURDAY:
				strWeek = "토요일";
				break;
			default:
				strWeek = "일요일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println("[뉴욕] "+year+"년 "+month+"월 "+day+"일 "+strWeek+" "+strAmPm+" "+hour+"시 "+minute+"분 "+second+"초");

	} //end main

} //end class