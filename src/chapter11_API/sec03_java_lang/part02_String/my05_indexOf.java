package chapter11_API.sec03_java_lang.part02_String;

import java.util.Scanner;

public class my05_indexOf {

	public static void main(String[] args) {
		/*
		 * [indexOf()]
		 *   - 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴한다.
		 *   - 만약 주어진 문자열이 포함되어 있지 않으면 -1을 리턴한다.
		 */
		
		String subject = "Java 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("프로그래밍의 시작 인덱스 : "+location);
		
		//indexOf() 메소드는 if문의 조건식에서 특정 문자열이 포함되어 있는지 여부에 따라 실행코드를 달리 할 때 자주 사용된다.
		if(subject.indexOf("Java") != -1) { //subect에 Java라는 문자열이 포함되어 있으면~
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련되지 않았습니다.");
		}
		System.out.println();
		
		///////////////////////////////////////////////////////////////////////
		System.out.println("[도서 검색]");
		String[] titles = {"이것이 자바다", "스프링4 입문", "스파크를 다루는 기술", "자바의 정석",
				"Doit! 자료 구조와 함게 배우는 알고리즘 입문", "빅데이터로 일하는 기술" , "C언어 콘서트", 
				"파이썬 라이브러리를 활용한 데이터 분석", "파이썬 라이브러리를 활용한 머신 러닝",
				"뇌를 자극하는 알고리즘"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 : ");
		String search = sc.next();
		
		System.out.println("[검색 결과]");
		int count = 0;
		for(int i=0 ; i<titles.length ; i++)	 {
			if(titles[i].indexOf(search) != -1) {
				count++;
				System.out.println(titles[i]);
			}
		}
		
		if(count == 0) {
			System.out.println("검색 결과 없음.");
		}
		
		sc.close();
		
	} //end main

} //end class