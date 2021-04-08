package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//1.FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할 수 있는 Stream.
		/*	생성자 - FileOutputStream(File file), FileOutputStream(File file, boolean append)
		 * 			 FileOutputStream(String name, boolean append), FileOutputStream(String name)
		 * 			 File file, String name -> 특정위치 + 파일이름.
		 * 			 boolean append -> false or 생략 시, 덮어쓰기 / true는 이어쓰기.
		 * 	주요메소드 
		 * 	write(int b) -> 한글자 쓰기 가능. (단, 영문자나 숫자, 일부의 특수문자만)
		 * 	write(byte[] b) -> 여러 글자를 byte[]에 넣어서 쓰기 가능
		 * 	flush()	-> write 후 반드시 실행하자. (일반 메소드의 return 같은 존재)
		 * 	close() -> open된 스트림 닫기(사용 후 닫기), 보통 finally로 처리*/
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"
							+File.separator+"util"+File.separator+"ict01.txt"; 
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			//기존 파일이 있으면 덮어쓰기하고 없으면 생성한다.
			fos = new FileOutputStream(file);
			
			//기존 파일이 있으면 이어쓰기 하고, 없으면 생성한다.
//			fos = new FileOutputStream(file,true);
		
			//한글자쓰기 
			fos.write(65);
			fos.write(97);
			//자바에서 줄 변경은 13이다. ( 13 = Carriage Return -> CR -> \r)
			//다른 언어중에서는 \r\n(Line feed = 10)을 같이 사용하는 경우도 있다.
			fos.write(13);
			
			// int값을 넣기 때문에 char도 이용 가능.
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			//배열을 이용해서 여러글자 쓰기
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			
			fos.write(b);
			
			//String을 이용하면 영어 이외의 문자도 가능하다.
			String str = "Hello\r안녕\r大韓";
			byte[] b2 = str.getBytes();
			fos.write(b2);
			
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
