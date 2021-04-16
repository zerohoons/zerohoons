package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator + "Study_YH" + File.separator + "util" + File.separator + "������.txt";
	
		File file = new File(pathname);

		FileWriter fw = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			URLConnection uc = url.openConnection();
			br = new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
			
			String msg = null;
			StringBuffer sb = new StringBuffer(); 
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				
				br.close();
				bw.close();
				fw.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
