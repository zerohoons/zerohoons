package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex15 {
	public static void main(String[] args) {
		//문자Stream - 사람 중심. 모든 처리를 2 byte씩 처리
		//대상 		 - 전 세계 모든 언어로 구성된 문서파일들.
		//최상위클래스- Reader (입력) / Writhe(출력)
		
		//FileOutputStream (바이트) : 1byte 처리, write(int b), write(byte[] b)
		//FileWriter (문자)			: 2byte 처리, write(int b), write(char[] b), wirte(String str)
		
		String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"
						+File.separator+"ict05.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			//한글자쓰기
			fw.write(97);
			fw.write(65);
			fw.write(13);
			
			//int이므로 char로 대체 가능
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('대');
			fw.write('한');
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			//배열 입력하기
			char[] c = {'k','o','r','e','a',13,'대','한','민','국',13};
			fw.write(c);
			
			fw.write("한국ICT인재개발원\n");
			fw.write("1강의장\n");
			fw.write("자바수업\n");
			
			fw.flush();
			
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
