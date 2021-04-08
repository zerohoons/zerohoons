package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
		//C:\\Study\\util\\java_1.png 파일을 C:\\Study\\util\\res로 복사.
		
		//읽는 위치 설정
		String pathname1 = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"java_1.png";
		
		//파일 읽기 설정
		File read_file = new File(pathname1);
		
		//새로 쓸 위치 설정
		String pathname2 = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"res"+File.separator+"사진_1.png";
		//한글로 새롭게 작성하는 것 가능.
		
		File write_file = new File(pathname2);
		
		//파일 읽어서 쓰기
		//input Stream
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		//output Stream
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
		
		//그림, 소리, 동영상 파일들을 처리하기.
		//무조건 1byte씩 처리해야함.
		int k = 0;
			//1byte씩 읽기.
			while((k=bis.read())!=-1) {
				//1byte씩 쓰기
				bos.write(k);
			}
		bos.flush();
		
		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				
			//이동 완료 후, 원본 파일 삭제
			//파일이 열린상태에서는 삭제할 수 없음.
			read_file.delete();
			
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		//C:\\Study\\util\\java_2.png 파일을 삭제
		
	}
}
