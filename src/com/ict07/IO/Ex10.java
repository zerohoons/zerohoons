package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* 시험문제
 * C:\\Study\\util\\test100.txt 
 * 1. 위 파일에 이름 : ㅇㅇㅇ 나이:ㅇㅇ 전화번호 : ~~~ 를 쓰고 읽어내기.
 * 
 * 2. 위 파일에 그림 / 음악 파일을 다른 장소(C:\\Study\\util\\res)로 복사하거나 이동하기. 
 * 
 */
public class Ex10 {
 public static void main(String[] args) {
	/*	C:\\Study\\util\\test100.txt 파일을 읽어내기. */
	 
	//위치값 잡기.
		 String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"test100.txt";
		 
		 //파일 및fis bis 설정
		 File file = new File(pathname);
		 FileInputStream fis = null;
		 BufferedInputStream bis = null;
		 
		 try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 
}
}
