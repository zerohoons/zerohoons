package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		/*	2. 속도 향상을 위해서 BufferedOutputStream을 사용한다.
		 * 		-> 혼자서는 사용할 수 없고, 반드시 OutputStream을 받아서! 사용해야한다.
		 * 	생성자 - BufferedOutputStream(OutputStream out)
		 */
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"
							+File.separator+"util"+File.separator+"ict01.txt"; 
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//기존 파일이 있으면 덮어쓰기하고 없으면 생성한다.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			//기존 파일이 있으면 이어쓰기 하고, 없으면 생성한다.
//			fos = new FileOutputStream(file,true);
		
			//한글자쓰기 
			bos.write(65);
			bos.write(97);
			//자바에서 줄 변경은 13이다. ( 13 = Carriage Return -> CR -> \r)
			//다른 언어중에서는 \r\n(Line feed = 10)을 같이 사용하는 경우도 있다.
			bos.write(13);
			
			// int값을 넣기 때문에 char도 이용 가능.
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			bos.write(13);
			
			//배열을 이용해서 여러글자 쓰기
			byte[] b = {'H','i','J','A','V','A'};
			
			bos.write(b);
			bos.write(13);
			
			//String을 이용하면 영어 이외의 문자도 가능하다.
			String str = "Hello\r안녕\r大韓";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close(); //바깥쪽 -> 안쪽으로 순서
				if (fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
