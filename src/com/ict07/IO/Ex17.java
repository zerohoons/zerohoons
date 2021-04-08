package com.ict07.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex17 {
	public static void main(String[] args) {
		/* FileInputStream : 1byte 처리, read() : int(아스키코드 활용) ->char변환가능. 문자는 영문자만 가능
		 * 				->read(byte[] b), String을 통해 읽음.
		 * FileReader	   : read() : int(유니코드 활용) -> char 변환 가능, 전 세계 문자 가능.
		 * 				-> read(char[] c), String을 이용  */
		
		String pathname =  "C:"+File.separator+"Study_YH"+File.separator+"util"
				+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			//한글자 읽기
//			방법1)
//			int k = fr.read();
//			System.out.println(k+" : "+((char)(k)));
//			
//			방법2)
//			int k = 0;
//			while((k=fr.read())!= -1) {
//				System.out.println((char)(k));
//			}
			
//			char[] 이용하기
			
//			char[] c = new char[(int)(file.length())];
//			fr.read(c);
//			for (char d : c) {
//				System.out.print(d);
//			}
			
//			String 이용
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
		} catch (Exception e) {
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
