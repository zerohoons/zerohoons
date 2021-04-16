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
 * - ���� ������ �ڿ��� �ּ�.
 * - final class �̱� ������ ��� �ȵ�.*/
public class Ex02 {
	public static void main(String[] args) {
		InputStream is =null;
		InputStreamReader isr = null;
		BufferedReader br =null;
		
		String pathname = "c:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"���û.txt";
		File file = new File(pathname);
		FileWriter fw = null;  //���°� ���ڸ� ���� ������ outputstreamwriter�� �ƴ�.
		BufferedWriter bw = null;
		try {
			
			//���� �� �������� �б�.
			URL url = new URL("https://movie.naver.com/"); //�����Ϸ��� �ּ� URL class �Է�
			is = url.openStream(); //����
			isr = new InputStreamReader(is,"utf-8"); //�ѱ�ó���ϱ�. �ѱ� ������ ��������.
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer(); //String �� ������� ���� ���� �𸣹Ƿ�, �̸� ������Ű�� ���� ���� ���.
			
			while((msg = br.readLine())!=null){ //readLine �� ���� ���� ���پ� �о.
				
				sb = sb.append(msg+"\n"); //�߰��Ǵ� msg�� ����ؼ� �Էµ�.
			
			}
			
		//	System.out.println(sb.toString()); //�߰��Ǵ� ���� Ȯ��.
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb.toString()); //���Ϸ� �ۼ��ؼ� ����.
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
		System.out.println("�Ϸ�Ǿ����ϴ�.");
	}
}
