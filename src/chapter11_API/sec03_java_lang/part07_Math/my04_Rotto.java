package chapter11_API.sec03_java_lang.part07_Math;

import java.util.Arrays;

public class my04_Rotto {

	public static boolean isDuplicate(int[] rotto, int win) {
		//win이 rotto에 있으면 중복 되어 있음(true) / 없으면 false 리턴
		for(int i=0 ; i<rotto.length ; i++) {
			if(rotto[i] == win) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// 로또 번호 얻기
		int[] rotto = new int[6];
		int win;

		//중복 제거 전 로또 랜덤 번호
		/*
		for(int i=0 ; i<rotto.length ; i++) {
			rotto[i] = (int) (Math.random() * 45) + 1;
		}
		*/

		//중복 제거 후 로또 번호
		for (int i = 0; i < rotto.length; i++) {
			// 중복 검사
			do {
				win = (int) (Math.random() * 45) + 1;
			} while (isDuplicate(rotto, win));
			
			// rotto 배열에 저장
			rotto[i] = win;
		}
		
		Arrays.sort(rotto);
		
		for (int temp : rotto) {
			System.out.print(temp + " ");
		}

	} //end main

} //end class