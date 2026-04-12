package chapter10_Exception.sec05_TryWithResource;

import java.io.IOException;

public class TryWithResourceExample {
	/**
	 * [try-with-resource 구문]
	 *   - 자바7에서 새로 추가됨
	 *   - try-with-resource 구문을 사용하면 예외 발생 여부와 상관없이 
	 *      사용했던 리소스 객체(각종 입출력 스트림, 서버 소켓, 소켓, 각종 채널 등)의 close() 메소드를 호출해서 안전하게 리소스를 닫아준다.
	 *   - 사용조건 : 리소스 객체가 java.lang.AutoCloseable 인터페이스를 구현 하고 있어야 한다.
	 *   				AutoClosable에는 close() 메소드가 정의되어 있는데 try-with-resource는 바로 이 close() 메소드를 자동 호출한다
	 *      
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/**
		 * 자바6 이전에 사용하던 방식
		 * - finally 블록에서 다시 try-catch를 사용해서 close() 메소드롤 예외 처리해야 하므로 다소 복잡해짐
		 */
		System.out.println("[자바6 이전]");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file1.txt");
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("FileInputStream 생성 도중 예외 발생");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {

				}
			}
		}
		System.out.println();
		
		
		/**
		 * close() 메소드를 호출한 곳이 없음에도 try 실행 도중 예외가 발생하면 
		 * 자동으로 FileInputStream의 close() 메소드가 실행된다.
		 *   - 예외가 발생하면 우선 close()로 리소스를 닫고, catch 블록을 실행한다.
		 */
		System.out.println("[자바7 이후]");
		try (FileInputStream fs = new FileInputStream("file2.txt"))
		{
			fs.read();
			throw new Exception();	// 강제 예외 발생
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행됨");
		}
	}

}
