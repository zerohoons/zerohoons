package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		/*	1. FileInputStream : 파일을 대상으로 1byte씩 데이터 읽기를 할 수 있는 Stream
		 *	1) 생성자 - FileOutputStream(File file), FileOutputStream(String name)
		 * 	   File file, String name 은 특정위치 + 파일 이름.
		 *	2) 메소드
		 *	- read() : int -> 결과가 숫자로 나옴. char형으로 형변환을 해야지만 문자가 된다.
		 *			 : 더 이상 읽을 수 없을 때 -1이 나온다. 영문을 제외한 문자는 읽을 수 없다.
		 *	- read(byte[] b) : int -> 배열을 만들어서 인자에 넣음 -> 배열의 크기만큼 문자를 읽을 수 있다.
		 *						=> byte[] b의 크기만큼 읽을 문자들이 저장된다.
		 *
		 *	- close : open된 스트림 닫기.(사용 후 닫기), 보통 finally에서 처리
		 */
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
//			//한글자씩 읽어오기 : read() -> 숫자로 나오기 때문에 -> 형변환 필수!
//			int k = fis.read();
//			System.out.println(k + " : "+(char)(k));
			
			//한글자씩 계속 읽기 : 그림, 소리, 동영상, 파일을 읽을 때 무조건 사용!
			//단, 영어가 아닌 문자는 읽을 수 없다. -> 글자에는 맞지 않는 방법.
			
//			int k = 0;
//			while(true) {
//				k = fis.read();
//				if(k==-1)break;
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
//			
//			위 방법을 축약하면,
//			int k = 0;
//			while((k=fis.read()) != -1) { //fis를 읽었을 때, -1이 아니면 true -> 실행 / -1이 되는 순간 false -> 정지.
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
//			
		//배열을 이용하는 방법
			/*byte[] b = new byte[(int)(file.length())]; //배열의 크기 지정 -> 파일 길이는 용량! byte stream은 1바이트 저장!
			fis.read(b);
			for (byte c : b) {
				System.out.println(c+" : "+(char)(c));
			}*/
			
		//String을 이용하는 방법 -> 영어 이외의 문자도 가능.
		//-> byte[] 인자로 받는 생성자를 이용해서 가능
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{ 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
