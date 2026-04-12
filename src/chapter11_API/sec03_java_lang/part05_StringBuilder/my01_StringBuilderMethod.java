package chapter11_API.sec03_java_lang.part05_StringBuilder;

public class my01_StringBuilderMethod {

	/*
	 * [StringBuilder, StringBuffer]
	 *   - 문자열을 저장하는 String은 내부의 문자열을 수정할 수 없다.
	 *      예를들어, String의 replace() 메소드는 내부의 문자를 대치하는 것이 아니라, 대치된 새로운 문자열을 리턴한다.
	 *   - 문자열을 변경하는 연산을 많이 할수록 String 객체의 수가 늘어나기 때문에, 프로그램의 성능이 저하된다.
	 *   - StringBuilder, StringBuffer 클래스는 내부에 버퍼(buffer:데이터를 임시로 저장하는 메모리)에 문자열을 저장해두고,
	 *     그 안에서 추가, 수정, 삭제 작업을 할 수 있도록 설계되어 있다.
	 *     -> String 처럼 새로운 객체를 만들지 않고도 문자열을 조작할 수 있다.
	 *   - StringBuilder : 싱글스레드
	 *   - StringBuffer : 멀티 스레드
	 */
	public static void main(String[] args) {
		
		/* StringBuilder 생성자 */
		//버퍼가 부족할 경우 자동으로 버퍼 크기를 늘리기 때문에 초기 버퍼의 크기는 중요하지 않다.
		//StringBuilder sb = new StringBuilder();		//기본 생성자는 16개의 문자를 저장할 수 있는 초기 버퍼를 만든다.
		//StringBuilder sb = new StringBuilder(int capacity);  //capacity로 주어진 개수만큼 문자들을 저장할 수 있는 초기 버퍼를 만든다.
		//StringBuilder sb = new StringBuilder(String str);		//str로 주어진 매개값을 버퍼의 초기값으로 저장
		StringBuilder sb = new StringBuilder();
		
		//append() : 문자열 끝에 주어진 매개값을 추가
		sb.append("java ");
		
		sb.append("program study");
		System.out.println("sb : "+sb);
		System.out.println("sb.toString() : "+sb.toString());
		
		//insert(int offset, ...) : 문자열 중간에 주어진 매개값을 추가
		sb.insert(4,  "2");	//4번 인덱스자리에 "2"를 추가하고, 그 이후의 문자는 뒤로 한칸씩 민다.
		System.out.println("sb : "+sb);
		
		//setChar(int index, char ch) : 문자열에서 주어진 index의 문자를 다른 문자로 대치
		sb.setCharAt(4, '6');
		System.out.println(sb);
		
		//replace(int start, int end, String str) : 문자열의 일부분을 다른 문자열로 대치
		sb.replace(6, 13, "book");		//6번~12번 인덱스의 문자열을 book으로 교체
		System.out.println(sb);
		
		//delete(int start, int end) : 문자열의 일부분을 삭제
		sb.delete(4,  5);		//4번 인덱스의 문자열 삭제
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("총 문자 수 : "+length);
		//System.out.println(sb.getClass().getName());	//java.util.StringBuilder
		
		//buffer에 있던 것을 String 타입으로 리턴
		//즉, StringBuilder를 통해서 문자열을 조작하고, 문자열 조작이 끝나면 String으로 바꿔서 저장
		String result = sb.toString();
		System.out.println("result : "+result);

	} //end main
	
} //end class