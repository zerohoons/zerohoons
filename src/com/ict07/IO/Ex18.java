package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex18 {
	public static void main(String[] args) {
		/* BufferReader : �ӵ������ ���ؼ� ���. ���پ� �д� �޼ҵ尡 ����.
		 * 
		 */
		
		String pathname =  "C:"+File.separator+"Study_YH"+File.separator+"util"
				+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br =null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//�ѱ��� �б�
//			���1)
//			int k = br.read();
//			System.out.println(k+" : "+((char)(k)));
//			
//			���2)
//			int k = 0;
//			while((k=br.read())!= -1) {
//				System.out.println((char)(k));
//			}
			
//			char[] �̿��ϱ�
			
//			char[] c = new char[(int)(file.length())];
//			br.read(c);
//			for (char d : c) {
//				System.out.print(d);
//			}
			
//			String �̿�
//			char[] c = new char[(int)(file.length())];
//			br.read(c);
//			String msg = new String(c);
//			System.out.println(msg);
			
////			ù���б�
//			String msg = br.readLine();
//			System.out.println(msg);
			
//			��� �б�
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
		
			
		} catch (Exception e) {
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
