package ch18.sec11;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if(!dir.exists()) {
			dir.mkdir(); //디렉토리가 존재하지 않으면 디렉토리를 만듬
		}
		
		if(file1.exists()) file1.createNewFile(); //파일이 존재하지 않으면 파일을 만듬
		if(file2.exists()) file2.createNewFile();
		if(file3.exists()) file3.createNewFile();
		
		//temp 폴더의 내용을 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:hh");
		
		for(File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) {
				System.out.print(" "+ file.getName() + " ");
			}else {
				System.out.print(" "+ file.length() + " ");
				System.out.print(" "+ file.getName() + " ");
			}
			
			System.out.println();
		}
				
				
	}

}
