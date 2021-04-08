package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* 시험문제
 * C:\\Study\\util\\test100.txt 
 * 1. 위 파일에 이름 : ㅇㅇㅇ 나이:ㅇㅇ 전화번호 : ~~~ 를 쓰고 읽어내기.
 * 
 * 2. 위 파일에 그림 / 음악 파일을 다른 장소(C:\\Study\\util\\res)로 복사하거나 이동하기. 
 * 
 */
public class Ex09 {
 public static void main(String[] args) {
	/*	C:\\Study\\util\\test100.txt 파일안에
	 * 	이름 : 
	 * 	나이 :
	 * 	전화번호 :
	 * 	위의 세가지 사항을 작성하기.
	 */
	 
	 //위치값 잡기.
	 String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"test100.txt";

	 
	 //파일 및fos bos 설정
	 File file = new File(pathname);
	 FileOutputStream fos = null;
	 BufferedOutputStream bos = null;
	 
	 //trycatch 입력 후, 값 작성 준비
	 try {
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		
		String msg = "이름 : 서영훈\r나이 : 27세\r전화번호 : 010-6880-7344";
		byte[] b = msg.getBytes(); //스트링을 바이트로 변경
		bos.write(b);
		bos.flush();
		
	} catch (Exception e) {
	}finally {
		try {
			bos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	 
}
}
