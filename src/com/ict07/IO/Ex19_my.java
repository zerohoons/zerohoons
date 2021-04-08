package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 사용자에게 파일 명을 물어보고, res에 새로운 파일로 복사하는 프로그램
 * 복사장소와 파일명을 받음 -> 붙힐 장소와 파일명을 받음 -> 복붙.
 */
public class Ex19_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//장소 위치 받기.
		System.out.println("복사할 파일이 있는 위치를 적어주세요.");
		String pathname = sc.next();
		//파일명받기
		System.out.println("복사할 파일명을 적어주세요.");
		String copy = sc.next();
		
		//붙혀넣을 위치 받기
		System.out.println("붙혀넣을 위치를 적어주세요");
		String pathname2 = sc.next();
		System.out.println("수정할 파일명을 알려주세요.");
		String paste = sc.next();
		//파일명과 위치 합치기
		pathname = pathname + File.separator + copy;
		pathname2 = pathname2 + File.separator +paste;
		
		//파일 읽기 쓰기
		File r_file = new File(pathname);
		File w_file = new File(pathname2);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
//		FileInputStream fis = null;
//		BufferedInputStream bis = null;
//		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(r_file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
		
			fr = new FileReader(r_file);
			br = new BufferedReader(fr);
			
//			fis = new FileInputStream(w_file);
//			bis = new BufferedInputStream(fis);
//			dis = new DataInputStream(bis);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg= br.readLine())!=null) {
				dos.writeBytes(msg);
			}
			
			dos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
//				dis.close();
//				bis.close();
//				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		
	}
}
