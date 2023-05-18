package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용중입니다.");
		
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8"); // 보조 스트림
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8"); //보조 스트림
		
		char[] data = new char[100];
		int num = reader.read(data);
		
		reader.close();
		
		String str = new String(data, 0 , num); //char 배열에서 읽은 문자수 만큼 가져온다.
		return str;
		
		
	}
}
