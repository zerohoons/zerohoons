package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// InputStreamReader / OutputStreamWriter 을 이용해서 키보드로 값을 받아 출력하는 코딩.
public class Ex22 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			//메세지 출력
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 내용을 입력하세요.");
			
			bw.newLine();
			
			bw.flush(); // 메세지 출력!
			
			//메세지 입력
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			//입력받은 문자 숫자로 바꾸기
//			int k = Integer.parseInt(msg);

			//받은 메세지 출력
			System.out.println("받은 메세지 : " + msg);		
			
			
			
		} catch (Exception e) {
		}finally {
			try {
				
				br.close();
				isr.close();
				bw.close();
				osw.close();
				
			} catch (Exception e2) {
			}
		}
		
	}
}
