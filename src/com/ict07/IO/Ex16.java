package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex16 {
	public static void main(String[] args) {
		//BufferedWrite : 속도향상을 위해 사용되며, 줄 바꾸기 메소드가 존재한다.
		
		
		String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"
						+File.separator+"ict05.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = new BufferedWriter(fw);
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			//한글자쓰기
			bw.write(97);
			bw.write(65);
			bw.newLine(); //줄변경 메소드
			
			//int이므로 char로 대체 가능
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.newLine(); //줄변경 메소드
			bw.write('대');
			bw.write('한');
			bw.newLine(); //줄변경 메소드
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.newLine(); //줄변경 메소드
			
			//배열 입력하기
			char[] c = {'k','o','r','e','a',13,'대','한','민','국',13};
			bw.write(c);
			bw.newLine(); //줄변경 메소드
			
			bw.write("한국ICT인재개발원\n");
			bw.newLine(); //줄변경 메소드
			bw.write("1강의장\n");
			bw.newLine(); //줄변경 메소드
			fw.write("자바수업\n");
			bw.newLine(); //줄변경 메소드
			
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
