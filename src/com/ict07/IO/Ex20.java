package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		/* byte - 문자결합 : 체인방식
		 * 입력 - InputStreamReader : InputStream -> Reader
		 * 		  InputStream -> InputStream -> Reader -> BufferedReader */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("원하는 문자 입력");
//		String msg = scan.next();
//		
//		System.out.println("받은 문자 : " + msg);

		//입력을 InputStreamReader 로 받는법.
		System.out.println("원하는 문자 입력");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine(); //br은 한줄씩 값을 받을 수 있다.
		System.out.println("받은 문자 : " + msg);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
	}

}
