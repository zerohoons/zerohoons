package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		/*	2. �ӵ� ����� ���ؼ� BufferedOutputStream�� ����Ѵ�.
		 * 		-> ȥ�ڼ��� ����� �� ����, �ݵ�� OutputStream�� �޾Ƽ�! ����ؾ��Ѵ�.
		 * 	������ - BufferedOutputStream(OutputStream out)
		 */
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"
							+File.separator+"util"+File.separator+"ict01.txt"; 
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//���� ������ ������ ������ϰ� ������ �����Ѵ�.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			//���� ������ ������ �̾�� �ϰ�, ������ �����Ѵ�.
//			fos = new FileOutputStream(file,true);
		
			//�ѱ��ھ��� 
			bos.write(65);
			bos.write(97);
			//�ڹٿ��� �� ������ 13�̴�. ( 13 = Carriage Return -> CR -> \r)
			//�ٸ� ����߿����� \r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.
			bos.write(13);
			
			// int���� �ֱ� ������ char�� �̿� ����.
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			bos.write(13);
			
			//�迭�� �̿��ؼ� �������� ����
			byte[] b = {'H','i','J','A','V','A'};
			
			bos.write(b);
			bos.write(13);
			
			//String�� �̿��ϸ� ���� �̿��� ���ڵ� �����ϴ�.
			String str = "Hello\r�ȳ�\r����";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close(); //�ٱ��� -> �������� ����
				if (fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
