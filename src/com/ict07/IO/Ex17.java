package com.ict07.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex17 {
	public static void main(String[] args) {
		/* FileInputStream : 1byte ó��, read() : int(�ƽ�Ű�ڵ� Ȱ��) ->char��ȯ����. ���ڴ� �����ڸ� ����
		 * 				->read(byte[] b), String�� ���� ����.
		 * FileReader	   : read() : int(�����ڵ� Ȱ��) -> char ��ȯ ����, �� ���� ���� ����.
		 * 				-> read(char[] c), String�� �̿�  */
		
		String pathname =  "C:"+File.separator+"Study_YH"+File.separator+"util"
				+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			//�ѱ��� �б�
//			���1)
//			int k = fr.read();
//			System.out.println(k+" : "+((char)(k)));
//			
//			���2)
//			int k = 0;
//			while((k=fr.read())!= -1) {
//				System.out.println((char)(k));
//			}
			
//			char[] �̿��ϱ�
			
//			char[] c = new char[(int)(file.length())];
//			fr.read(c);
//			for (char d : c) {
//				System.out.print(d);
//			}
			
//			String �̿�
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
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
