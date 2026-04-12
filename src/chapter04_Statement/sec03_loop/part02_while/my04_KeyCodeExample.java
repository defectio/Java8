package chapter04_Statement.sec03_loop.part02_while;

import java.io.IOException;

public class my04_KeyCodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode = 0;
		
		while(true) {
			
			//System.in.read() : 하나의 키코드만 읽기 때문에 콘솔에 입력된 문자열을 한 번에 읽을 수 없다.
			keyCode = System.in.read();
			System.out.println("keyCode : "+keyCode);
			if(keyCode==51) {
				break;
			}
		}
		

	}

}
