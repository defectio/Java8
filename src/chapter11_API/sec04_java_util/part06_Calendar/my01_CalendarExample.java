package chapter11_API.sec04_java_util.part06_Calendar;

import java.util.Calendar;

public class my01_CalendarExample {

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
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);	//년도
		int month = now.get(Calendar.MONTH)+1;		//월(0~11) -> +1 해줘야함
		int day = now.get(Calendar.DAY_OF_MONTH);	//일
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일을 리턴(1:일요일, 2:월요일, ... 7:토요일)
		//System.out.println("일요일 : "+Calendar.SUNDAY);
		//System.out.println("월요일 : "+Calendar.MONDAY);
		//System.out.println("화요일 : "+Calendar.TUESDAY);
		//System.out.println("수요일 : "+Calendar.WEDNESDAY);
		//System.out.println("목요일 : "+Calendar.THURSDAY);
		//System.out.println("금요일 : "+Calendar.FRIDAY);
		//System.out.println("토요일 : "+Calendar.SATURDAY);
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
		System.out.println("week : "+strWeek);
		
		int amPm = now.get(Calendar.AM_PM);	//오전:0 오후:1
		//System.out.println("오전 : "+Calendar.AM);
		//System.out.println("오후 : "+Calendar.PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		System.out.println("amPm : "+strAmPm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		
	} //end main

} //end class