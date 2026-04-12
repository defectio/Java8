package chapter11_API.sec04_java_util.part02_StringTokenizer;

import java.util.StringTokenizer;

public class my01_token {

	/*
	 * [StringTokenizer 클래스]
	 *   - 문자열이 한 종류의 구분자로 연결되어 있을 경우, 
	 *     StringTokenizer 클래스를 이용하면 손쉽게 문자열(token, 토큰)을 분리해낼 수 있다.
	 *   - StringTokenizer 객체를 생성할 때 
	 *     첫 번째 매개값을 전체 문자열을 주고, 두번째 매개값으로 구분자를 주면된다.
	 */
	public static void main(String[] args) {
		
		//StringTokenizer st = new StringTokenizer("문자열", "구분자");
		//만약 구분자를 생략하면 공백(space)이 기본 구분자가 된다

		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		//StringTokenizer 객체가 생성되면 부분 문자열을 분리해 낼 수 있는데, 
		//다음 메소드들을 이용해서 전체 토큰 수, 남아 있는 토큰 여부를 확인한 다음, 토큰을 읽으면 된다.
		
		//(1) int countTokens() : 꺼내지 않고 남아 있는 토큰의 수
		//(2) boolean hasMoreTokens() : 남아 있는 토큰이 있는지 여부
		//(3) String nextToken() : 토큰을 하나씩 꺼내옴
		//nextToken() 메소드로 토큰을 하나 꺼내 오면 StringTokenizer 객체에는 해당 토큰이 없어진다.
		//StringTokenizer 객체에 더 이상 가져올 토큰이 없다면 nextToken() 메소드는 java.util.NoSuchElementException 예외를 발생시킨다.
		//그래서 nextToken() 메소드로 토큰을 꺼내 오기전, hasMoreTokens() 메소드로 꺼내올 토큰이 있는지 조사한 후에 안전하게 꺼내 와야 한다.
		
		//[방법 1] : 전체 토큰 수를 얻어 토큰의 수만큼 for문 루핑
		System.out.println("[방법 1]");
		int count = st.countTokens();
		//System.out.println("전체 토큰 의 수 : "+count);
		for(int i=0 ; i<count ; i++) {
			String name = st.nextToken();
			System.out.println(name);
		}
		System.out.println();
		
		//[방법 2] : hasMoreTokens() 메소드로 토큰이 없을때 까지 가져오는 while문 루핑
		//방법 1에서 토큰을 모두 꺼내 왔으므로, 방법 2를 실행하려면 StringTokenizer 객체를 다시 생성해야 한다.
		System.out.println("[방법 2]");
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}
		
	} //end main

} //end class