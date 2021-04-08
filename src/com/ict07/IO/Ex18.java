package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex18 {
	public static void main(String[] args) {
		/* BufferReader : 속도향상을 위해서 사용. 한줄씩 읽는 메소드가 존재.
		 * 
		 */
		
		String pathname =  "C:"+File.separator+"Study_YH"+File.separator+"util"
				+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br =null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//한글자 읽기
//			방법1)
//			int k = br.read();
//			System.out.println(k+" : "+((char)(k)));
//			
//			방법2)
//			int k = 0;
//			while((k=br.read())!= -1) {
//				System.out.println((char)(k));
//			}
			
//			char[] 이용하기
			
//			char[] c = new char[(int)(file.length())];
//			br.read(c);
//			for (char d : c) {
//				System.out.print(d);
//			}
			
//			String 이용
//			char[] c = new char[(int)(file.length())];
//			br.read(c);
//			String msg = new String(c);
//			System.out.println(msg);
			
////			첫줄읽기
//			String msg = br.readLine();
//			System.out.println(msg);
			
//			모두 읽기
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
		
			
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
