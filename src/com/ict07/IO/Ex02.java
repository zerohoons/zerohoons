package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File 클래스를 사용하기 전에 특정 위치를 지정
		String pathname_1 = "F:\\programming\\Study_YH\\util\\01";  // 운영체제가 windows 일때 
		String pathname_2 ="F:/programing/Study_YH/util/01";     // 운영체제가 Linux, Unix 일때 
		
		// 운영체제와 상관없이 사용하는 방법
		String pathname_3 = "F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"01";

		//수정날짜 구하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			
			// 컴퓨터에 저장되는 종류는 디렉토리와 파일밖에 없다.
			
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : "+ file2 + "\r크기가 존재하지 않음. \r 최근 수정일 : " + sdf.format(file2.lastModified()));
			} else {
			System.out.println("파일 : " + file2 + "\r크기는 " + (int)(file2.length()/1024)+"KB"+ "\r최근 수정일 : " +sdf.format(file2.lastModified())); 
			}
			
		}
	}
}
