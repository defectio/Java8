package chapter11_API.sec03_java_lang.part02_String;

public class my02_charAt {

	public static void main(String[] args) {
		/**
		 * charAt(int index) 메소드
		 *   - 매개값으로 주어진 특정 위치(인덱스)의 문자 리턴
		 */
		String ssn = "010624-12301230";
		char gender = ssn.charAt(7);
		switch(gender) {
			case '1' :
			case '3' :
				System.out.println("남자 입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자 입니다.");
				break;
		}
		System.out.println();
		
		////////////////////////////////////////////////////////////////////
		
		/**
		 *  num에 저장된 숫자문자열을 각각 한 개씩 쪼개서 int[] 배열에 담기
		 */
		String test = "123456789";
		int[] arr1 = new int[test.length()];
		
		// 숫자 문자를 아스키코드로 저장한다. 0 -> 49, 1 -> 50...으로 저장
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = test.charAt(i);
		}
		
		System.out.println("[arr1]");
		for(int temp : arr1) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println();
		
		// 숫자 문자 그대로 저장
		int[] arr2 = new int[test.length()];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = test.charAt(i) - '0';
		}
		
		System.out.println("[arr2]");
		for(int temp : arr2) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println();
		

		/**
		 *  문자열을 각각 한 개씩 쪼개서 char[] 배열에 담기
		 */
		String test2 = "Hello java";
		char[] charArr1 = new char[test2.length()];
		for (int i = 0; i < charArr1.length; i++) {
			charArr1[i] = test2.charAt(i);
		}
		
		System.out.println("[charArr1]");
		for (char temp : charArr1) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("[charArr2]");
		char[] charArr2 = test2.toCharArray(); 
		for (char temp : charArr2) {
			System.out.print(temp + " ");
		}

	} //end main

} //end class
