package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 사용자에게 파일 명을 물어보고, res에 새로운 파일로 복사하는 프로그램
 * 복사장소와 파일명을 받음 -> 붙힐 장소와 파일명을 받음 -> 복붙.
 */
public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//장소 위치 받기.
		System.out.println("복사할 장소와 파일명 :");
		String pathname = sc.next();
		//파일명받기
		System.out.println("붙여넣을 장소와 파일명 :");
		String pathname2 = sc.next();
		
		File file1 = new File(pathname);
		File file2 = new File(pathname2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//읽기
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			
			//쓰기
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
			
//			bw.write(sb.toString());
			bw.write(str); //받으면서 치환하기
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
