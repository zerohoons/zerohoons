package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		/*	속도 향상을 위한 BufferedInputStream을 사용한다. : BufferedInputStream(InputStream in)
		 * 	혼자서는 사용할 수 없고 반드시 InputStream을 받아서 사용.
		 */
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			
//			//한글자씩 읽어오기 : read() -> 숫자로 나오기 때문에 -> 형변환 필수!
//			int k = bis.read();
//			System.out.println(k + " : "+(char)(k));
			
			//한글자씩 계속 읽기 : 그림, 소리, 동영상, 파일을 읽을 때 무조건 사용!
			//단, 영어가 아닌 문자는 읽을 수 없다. -> 글자에는 맞지 않는 방법.
			
//			int k = 0;
//			while(true) {
//				k = bis.read();
//				if(k==-1)break;
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
//			
//			위 방법을 축약하면,
//			int k = 0;
//			while((k=bis.read()) != -1) { //bis를 읽었을 때, -1이 아니면 true -> 실행 / -1이 되는 순간 false -> 정지.
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
////			
		//배열을 이용하는 방법
			/*byte[] b = new byte[(int)(file.length())]; //배열의 크기 지정 -> 파일 길이는 용량! byte stream은 1바이트 저장!
			bis.read(b);
			for (byte c : b) {
				System.out.println(c+" : "+(char)(c));
			}*/
			
		//String을 이용하는 방법 -> 영어 이외의 문자도 가능.
		//-> byte[] 인자로 받는 생성자를 이용해서 가능
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{ 
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
