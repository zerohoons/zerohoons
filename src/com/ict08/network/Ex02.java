package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/* class URL
 * - 접근 가능한 자원의 주소.
 * - final class 이기 때문에 상속 안됨.*/
public class Ex02 {
	public static void main(String[] args) {
		InputStream is =null;
		InputStreamReader isr = null;
		BufferedReader br =null;
		
		String pathname = "c:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"기상청.txt";
		File file = new File(pathname);
		FileWriter fw = null;  //쓰는건 문자만 쓰기 때문에 outputstreamwriter이 아님.
		BufferedWriter bw = null;
		try {
			
			//먼저 웹 페이지를 읽기.
			URL url = new URL("https://movie.naver.com/"); //접근하려는 주소 URL class 입력
			is = url.openStream(); //접근
			isr = new InputStreamReader(is,"utf-8"); //한글처리하기. 한글 깨짐을 막기위해.
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer(); //String 이 어느정도 누적 될지 모르므로, 이를 누적시키기 위해 버퍼 사용.
			
			while((msg = br.readLine())!=null){ //readLine 을 통해 값을 한줄씩 읽어냄.
				
				sb = sb.append(msg+"\n"); //추가되는 msg가 계속해서 입력됨.
			
			}
			
		//	System.out.println(sb.toString()); //추가되는 내용 확인.
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb.toString()); //파일로 작성해서 저장.
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
				
			} catch (Exception e2) {
				System.out.println("2@="+e2);
			}
		}
		System.out.println("완료되었습니다.");
	}
}
