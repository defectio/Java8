package chapter12_Thread.sec02_Generate_Execution.part02_SubClass;

import java.awt.Toolkit;

public class my01_BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new my01_BeepThread();
		thread.start();
		
		// 프린팅 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
