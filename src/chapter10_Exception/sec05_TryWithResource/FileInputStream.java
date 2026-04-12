package chapter10_Exception.sec05_TryWithResource;

import java.io.IOException;

public class FileInputStream implements AutoCloseable {

	private String file;

	public FileInputStream(String file) throws Exception {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
